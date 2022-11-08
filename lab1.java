import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        int a = enter();
        int b = enter();
        int c = enter();
        int d = enter();
        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
        System.out.println("Третье число: " + c);
        System.out.println("Четвертое число: " + d);
        System.out.println("Минимальное число: " + minimum(a, b, c, d));
    }

    public static int enter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число:");
            String line = scanner.nextLine();
            try {
                int tmp = Integer.parseInt(line);
                return (tmp);
            } catch (NumberFormatException e) {
                System.err.println("Неправильный формат строки. Повторите ввод");
            }
        }
    }

    public static int minimum(int a, int b, int c, int d) {
        if ((a <= b) & (a <= c) & (a <= d))
            return a;
        else if ((b <= a) & (b <= c) & (b <= d))
            return b;
        else if ((c <= a) & (c <= b) & (c <= d))
            return c;
        else
            return d;
    }
}