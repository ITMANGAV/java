import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class hw2 {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        // users.put("popova", "dima");
        // users.put("petrov", "polina");
        // users.put("ivanov", "dima");
        // users.put("sidorov", "katya");
        // users.put("popov", "sergey");
        // users.put("merchic", "katya");
        // users.put("jonotan", "katya");
        // System.out.println(users);

        File file = new File("C:\\GeekBrains\\java\\5seminar\\hw2", "users.txt"); // Укажите свой путь!
        System.out.println(file);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] bakParse = line.split(" ");
                users.put(bakParse[1], bakParse[0]);
                // System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Integer> countName = new HashMap<>();
        for (String name : users.keySet()) {
            Integer count = 0;
            for (String item : users.keySet()) {
                if (users.get(name).equals(users.get(item))) {
                    count++;
                }
            }
            countName.put(users.get(name), count);

        }
        countName.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
        // System.out.println(users);
        // System.out.println(countName);
    }
}