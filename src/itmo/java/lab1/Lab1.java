package itmo.java.lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

//        Певое упражнение

        System.out.println("Я \nхорошо \nзнаю \nJava.");

//        Второе упражнение

        float a = 46;
        float b = 10;
        float c = 10;
        float d = 3;
        float e = (a + b) * (c / d);
        System.out.println(e);

//        Третье упражнение

        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println(result);

//        Четвертое уражнение

        double x = 3.6;
        double y = 4.1;
        double z = 5.9;
        double result1 = x * y * z;
        System.out.println(result1);

//        Пятое упражнение

        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int j = scanner.nextInt();

        System.out.println(f);
        System.out.println(g);
        System.out.println(j);

//        Шестое упражнение

        int p = scanner.nextInt();
        if ((p % 2) != 0) {
            System.out.println("Нечетное");
        } else if (p > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }


    }
}
