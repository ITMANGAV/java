import java.util.Arrays;
import java.io.*;

public class hw2 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("notes3.txt", false)) {

            String text = "Логирование пузырковой сортировки:";
            writer.write(text);

            writer.append('\n');

            int[] arr = { 8, 3, 5, 2, 1, 0 };
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                        writer.append(Arrays.toString(arr));
                        writer.append('\n');
                    }

                }
            }
            // System.out.println(Arrays.toString(arr));
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
