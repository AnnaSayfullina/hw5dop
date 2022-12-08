import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int p = 0;
        if (p % 2 !=0 || p == 0) {
            System.out.println("Число " + p + " нечетное число");
        } else {
            System.out.println("Число " + p + " четное число");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        float number = 10;
        float p = 7.3f;
        float d = 11.13f;

        if (Math.abs(p - number) > Math.abs(d - number)) {
            System.out.println("Число " + d + " ближайшее к числу " + number);
        } else {
            System.out.println("Число " + p + " ближайшее к числу " + number);
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int number = ThreadLocalRandom.current().nextInt(3, 159);
        if (number >= 22 && number <= 99) {
            System.out.println("Число " + number + " входит в интервал (22;99)");
        } else {
            System.out.println("Число " + number + " не входит в интервал (22;99)");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int number = ThreadLocalRandom.current().nextInt(100, 1000);
        int one = number / 100;
        int two = (number % 100) / 10;
        int three = number % 10;
        if (one > two && one > three) {
            System.out.println("В числе " + number + " наибольшим членом является " + one);
        } else if (two > three) {
            System.out.println("В числе " + number + " наибольшим членом является " + two);
        } else {
            System.out.println("В числе " + number + " наибольшим членом является " + three);
        }
    }
}