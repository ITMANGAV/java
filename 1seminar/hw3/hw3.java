import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        String n1 = iScanner.nextLine();
        System.out.println("Введите символ операции, +-*/ : ");
        String op = iScanner.nextLine();
        System.out.println("Введите второе число: ");
        String n2 = iScanner.nextLine();
        iScanner.close();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        switch (op) {
            case "+":
                int s = num1 + num2;
                System.out.println("Сумма = " + s);
                break;
            case "-":
                int r = num1 - num2;
                System.out.println("Разница = " + r);
                break;
            case "*":
                int p = num1 * num2;
                System.out.println("Произведение = " + p);
                break;
            case "/":
                int d = num1 + num2;
                System.out.println(" Деление = " + d);
                break;
            default:
                System.out.println("Ошибка в символе операции");
                break;
        }
    }
}
