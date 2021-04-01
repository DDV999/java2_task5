public class Base {
    public static void main(String[] args) throws Exception {
        Numbers num = new Numbers();
        int numberOne = num.setInputNumber();
        int numberTwo = num.setInputNumber();
        Calculator calculator = new Calculator();
        char operation = calculator.getOperation();
        try {
            int result = calculator.setResult(numberOne, numberTwo, operation);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e){
            System.out.println("Ошибка деления на 0: " + e.getMessage());
        }
    }
}