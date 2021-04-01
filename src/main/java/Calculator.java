import java.util.Scanner;

public class Calculator extends Base {
    static Scanner scanner = new Scanner(System.in);

    public Calculator() {};

    public int setResult(int firstNumber, int secondNumber, char operation) throws Exception {
        int result;
        switch (operation) {
            case '+':
                result = addition(firstNumber, secondNumber);
                break;
            case '-':
                result = subtraction(firstNumber, secondNumber);
                break;
            case '*':
                result = multiplication(firstNumber, secondNumber);
                break;
            case '/':
                result = divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Неизвестная операция или недоступна. Повторите ввод!");
                result = setResult(firstNumber, secondNumber, getOperation());
        }
        return result;
    }

    public Character getOperation() {
        System.out.print("Введите операцию: ");
        char operation;
        operation = scanner.next().charAt(0);
        try {
            if (operation == '%') {
                throw new Exception("Данный функционал отсутствует. Выберите '/', '*', '+' или '-'");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return operation;
    }

    private static int addition(int num1, int num2) {
        return num1 + num2;
    }

    private static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    private static int divide(int num1, int num2) {
        return num1 / num2;
    }
}