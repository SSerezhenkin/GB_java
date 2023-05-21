import java.util.Scanner;


public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();
        System.out.print("Введите операцию (+, -, *, /): ");
        String operation = scanner.next();
        scanner.close();

        if (checkOperation(operation))
            System.out.printf("%d %s %d = %d", firstNum, operation, secondNum, result(firstNum, operation, secondNum));
        else System.out.println("Невверная операция");
    }

    static  boolean checkOperation(String oper) {
        switch (oper) {
            case "+":
            case "-":
            case "*":
            case "/": return true;
            default: return false;
        }
    }

    static int result(int first, String oper, int second) {
        switch (oper) {
            case "+": return first + second;
            case "-": return first - second;
            case "*": return first * second;
            case "/": return  first / second;
            default: return 0;
        }
    }
}
