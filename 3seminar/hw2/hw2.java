import java.util.ArrayList;

public class hw2 {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(36);
        number.add(11);
        number.add(45);
        number.add(12);
        number.add(70);
        number.add(51);

        System.out.println(number);

        for (int i = 0; i < number.size(); i++) {
            int even = number.get(i) % 2;

            if (even == 0) {
                System.out.println("Это четное число: " + number.get(i));
                number.remove(i);
                i--;
            }
        }

        System.out.println(number);

    }
}
