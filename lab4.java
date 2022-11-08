import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        int month = enter();

        if ((month == 1) | (month == 2) | (month == 12)) {
            System.out.println("Зима");
        } else if ((2 < month) & (month < 6)) {
            System.out.println("Весна");
        } else if ((5 < month) & (month < 9)) {
            System.out.println("Лето");
        } else if ((8 < month) & (month < 13)) {
            System.out.println("Осень");
        }
    }

    public static int enter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число месяца:");
            String line = scanner.nextLine();
            try {
                int tmp = Integer.parseInt(line);
                if ((0 < tmp) & (tmp < 13)) {
                    return (tmp);
                } else {
                    System.err.println("Неправильный формат ввода. Повторите ввод");
                }
            } catch (NumberFormatException e) {
                System.err.println("Неправильный формат ввода. Повторите ввод");
            }
        }
    }
}