public class Main {
    public static void main(String[] args) {
        // Print numbers from 1 to 2500 incrementing by 1
        for (int i = 1; i <= 2500; i++) {
            System.out.println(i);
        }

        // Print numbers from 5 to 950 incrementing by 5
        for (int i = 5; i <= 950; i += 5) {
            System.out.println(i);
        }

        // Print numbers from 1 to 100 incrementing by 3
        for (int i = 1; i <= 100; i += 3) {
            System.out.println(i);
        }

        // Print numbers from 800 to 1 decrementing by 2
        for (int i = 800; i >= 1; i -= 2) {
            System.out.println(i);
        }

        // Print numbers from 1 to 500 checking divisibility by 2
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("No aplica este valor");
            }
        }
    }
}