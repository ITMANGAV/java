import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        String n = iScanner.nextLine();
        iScanner.close();
        int num = Integer.parseInt(n);

        int summa = 0;
        int proizvenie = 1;
        for (int i = 1; i <= num; i++) {
            summa += i;
            proizvenie *= i;
        }
        System.out.println("Сумма = " + summa);
        System.out.println("Произведение = " + proizvenie);
    }
}