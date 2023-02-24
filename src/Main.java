public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task2() {
        byte clientOS = 1;
        short clientDeviceYear = 2010;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке/");
            }
        }
    }
}