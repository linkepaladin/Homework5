public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        byte clientOS = 0;
        short clientDeviceYear = 2017;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
        else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        }
    }

    public static void task3() {
        int year = 500;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " Это високосный год");
                }
                else {
                    System.out.println(year + " Это не високосный год");
                }
            } else if (year % 100 != 0) {
                System.out.println(year + " Это високосный год");
            }
        } else {
            System.out.println(year + " Это не високосный год");
        }
    }
    public static void task4() {
        int deliveryDistance = 1;
        int deliveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay = deliveryDay + 1;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100){
            deliveryDay = deliveryDay + 2;
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        else {
            System.out.println("Доставки нет.");
        }
    }
}