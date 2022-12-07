import java.util.LinkedList;

public class hw1 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(0);
        System.out.println(numbers);

        System.out.println(reversL(numbers));
    }

    public static LinkedList<Integer> reversL(LinkedList<Integer> input) {
        LinkedList<Integer> revL = new LinkedList<>();
        for (int i = input.size() - 1; i >= 0; i--) {
            revL.add(input.get(i));
        }
        return revL;
    }
}