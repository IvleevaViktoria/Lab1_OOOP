import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 1.53;
        double b = 5.14;
        double c = 3.97;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double y = (a * x + 3.8 * Math.tan(x)) / Math.sqrt(c * Math.pow(x, 3) + c * b);

        System.out.println("Результат вычислений функции y=f(x) при x = " + x + " равен " + y);
    }
}