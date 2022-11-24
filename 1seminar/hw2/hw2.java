public class hw2 {
    public static void main(String[] args) {
        int bak = 0;
        System.out.println("Простые числа от 1 дот 1000:");
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    bak++;
                }
                // System.out.println(i);
                // System.out.println("bak - " + bak);
            }
            if (bak == 2) {
                System.out.print(i + " ");

            }
            bak = 0;
        }
    }

}
