// Найти треугольное число
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = scanner.nextInt();
        scanner.close();
        System.out.printf("Треугольное число: %d\n", result(i));
    }
        public static int result(int a) {
            return (a * (a + 1)) / 2;
        }
    }
