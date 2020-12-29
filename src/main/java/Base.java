public class Base {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        int numberOne = num.setInputNumber();
        int numberTwo = num.setInputNumber();
        Calculator calculator = new Calculator();
        char operation = calculator.getOperation();
        int result = calculator.setResult(numberOne, numberTwo, operation);
        System.out.println("Результат: " + result);
    }
}