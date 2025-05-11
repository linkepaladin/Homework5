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

        // task 6

        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // task 7

        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // task 8

        System.out.println("Задача 8");

        int savingsAmount = 0;
        int salary = 29000;
        for (int i = 1; i <= 12; i++) {
            savingsAmount = savingsAmount + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsAmount + " рублей ");
        }

        // task 9

        System.out.println("Задача 9");

        int savingsAmount1 = 0;
        int salary1 = 29000;
        double interestRateInMonth = 0.01;
        for (int i = 1; i <= 12; i++) {
            savingsAmount1 = savingsAmount1 + salary1;
            savingsAmount1 = (int) (savingsAmount1 + (savingsAmount1 * interestRateInMonth));
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsAmount1 + " рублей ");
        }

        // task 10

        System.out.println("Задача 10");

        for (int i = 1; i <= 10; i++) {
            int two = 2;
            int multResult = two * i;
            System.out.println(two + " * " + i + " = " + multResult);
        }

    }
}
