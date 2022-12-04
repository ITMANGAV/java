import java.util.ArrayList;
import java.util.Collections;

public class hw3 {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(36);
        number.add(11);
        number.add(45);
        number.add(12);
        number.add(70);
        number.add(51);

        System.out.println(number);
        int max = Collections.max(number);
        int min = number.get(0);
        int sum = number.stream().mapToInt(Integer::valueOf).sum();
        Double average = (double) (sum / number.size());
        for (int i = 1; i < number.size(); i++) {
            if (min > number.get(i)) {
                int temp = min;
                min = number.get(i);
                number.set(i, temp);
            }
        }

        System.out.printf("min = %s max = %s average = %s", min, max, average);

    }
}
