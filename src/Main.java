public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}