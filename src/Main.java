public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // task 2
        System.out.println("Задача 2");

        for (int i = 10;i >= 1; i--) {
            System.out.println(i);
        }

        // task 3
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // task 4

        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // task 5

        System.out.println("Задача 5");

        for (int i = 1904;i <= 2096; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println("Это Високосный год: " + i);
            }
        }
    }
}
