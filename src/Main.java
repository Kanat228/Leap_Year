import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формату 'yyyy'");
        String value = scanner.nextLine();
        int year = Integer.parseInt(value);

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Високосный год - 366 дней");
        } else {
            System.out.println("Обычный год - 365 дней");
        }
    }
}