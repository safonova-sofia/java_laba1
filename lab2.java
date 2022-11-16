import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        int a = enter();
        int b = enter();
        int c = enter();
        int d = enter();
        int max_num = maximum(a, b, c, d);


        System.out.println("Первое число: " + a);
        System.out.println("Второе число: " + b);
        System.out.println("Третье число: " + c);
        System.out.println("Четвертое число: " + d);
        System.out.println("Максимальное число: " + max_num);

        System.out.print("Кол-во чисел равных максимальному: " + count_max(a, b, c, d, max_num));
    }

    public static int enter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число: ");
            String line = scanner.nextLine();
            try {
                int tmp = Integer.parseInt(line);
                return (tmp);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода. Повторите ввод");
            }
        }
    }

    public static int maximum(int a, int b, int c, int d) {
        if ((a >= b) & (a >= c) & (a >= d))
            return a;
        else if ((b >= a) & (b >= c) & (b >= d))
            return b;
        else if ((c >= a) & (c >= b) & (c >= d))
            return c;
        else
            return d;
    }

    public static int count_max(int a, int b, int c, int d, int max_num) {
        int count = 0;
        if (max_num == a) {
            count++;
        }
        if (max_num == b) {
            count++;
        }
        if (max_num == c) {
            count++;
        }
        if (max_num == d) {
            count++;
        }
        return count;
    }
}