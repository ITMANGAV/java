import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        HashMap<String, String> manual = new HashMap<String, String>();
        manual.put("101", "MCHS");
        manual.put("102", "Polica");
        manual.put("103", "Ambulance");
        manual.put("8902112345", "Sidorov");
        manual.put("89454578930", "Popov");
        while (true) {
            System.out.println("\nМЕНЮ: \n");
            System.out.println("1. Просмотреть справочник ");
            System.out.println("2. Найти по фамилии ");
            System.out.println("3. Добавить контакт ");
            System.out.println("4. Выйти \n");
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Выбирите действие, введите цифру: ");
            String str = iScanner.nextLine();

            switch (str) {
                case "1":
                    lookManual(manual);
                    break;
                case "2":
                    findManual(manual);
                    break;
                case "3":
                    addInManual(manual);
                    break;
                case "4":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Ошибка в символе операции");
                    break;
            }

        }

    }

    public static void lookManual(HashMap<String, String> input) {
        System.out.println(input);
    }

    public static void findManual(HashMap<String, String> input) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Выбирите фамилию или название: ");
        String value = iScanner.nextLine();
        if (input.containsValue(value)) {
            for (String item : input.keySet()) {
                if (input.get(item).equals(value)) {
                    System.out.println(item + "-" + value);
                }
            }
        } else {
            System.out.println("Нет такого значения ");
        }
    }

    public static HashMap<String, String> addInManual(HashMap<String, String> input) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите номер: ");
        String number = iScanner.nextLine();
        System.out.println("Введите фамилию: ");
        String lastName = iScanner.nextLine();
        input.put(number, lastName);
        System.out.println("Запись добавлена");

        return input;
    }

    public static void exit(HashMap<Integer, String> input) {
        for (Integer item : input.keySet()) {
            System.out.println(input);
        }
    }
}
