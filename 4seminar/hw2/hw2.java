import java.util.LinkedList;
import java.util.Queue;

public class hw2 {
    public static void main(String[] args) {
        Queue<Integer> stack = new LinkedList<>();
        stack.add(5);
        stack.add(3);
        stack.add(1);
        stack.add(2);
        stack.add(0);
        System.out.printf("Исходная очередь: %s\n", stack);
        System.out.println(enqueue(stack, 9));
        System.out.printf("Удаленный первый элемент: %s\n", dequeue(stack));
        System.out.println(stack);
        System.out.printf("Первый элемент: %s\n", first(stack));

    }

    public static Queue<Integer> enqueue(Queue<Integer> input, int e) {
        input.add(e);
        return input;
    }

    public static void dequeue0(Queue<Integer> input) {
        System.out.println(input.poll());
        System.out.println(input);
    }

    public static Integer dequeue(Queue<Integer> input) {
        return input.poll();
    }

    public static Integer first(Queue<Integer> input) {
        return input.element();
    }
}
