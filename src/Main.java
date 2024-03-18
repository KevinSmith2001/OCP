public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Operation add = new Addition();
        System.out.println(calculator.calculate(5, 3, add));
        Operation multiply = new Multiplication();
        System.out.println(calculator.calculate(5, 3, multiply));
    }
}