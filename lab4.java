import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        int month = enter();

        switch (month) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }
    }

    public static int enter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число месяца: ");
            String line = scanner.nextLine();
            try {
                int tmp = Integer.parseInt(line);
                if ((0 < tmp) & (tmp < 13)) {
                    return (tmp);
                } else {
                    System.out.println("Неправильный формат ввода. Повторите ввод");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неправильный формат ввода. Повторите ввод");
            }
        }
    }
}