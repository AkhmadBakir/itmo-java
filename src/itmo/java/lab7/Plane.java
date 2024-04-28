package itmo.java.lab7;

import java.util.Scanner;

public class Plane {

    // Внутренний класс

    class Wing {
        int wingWeight;

        void PrintWingWeight() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите вес крыла из внутреннего класса: ");
            wingWeight = scanner.nextInt();
            System.out.println("Вес крыла из внутреннего класса: " + wingWeight);
        }
    }

    public void InnerMethod() {
        Plane.Wing wing1 = new Plane.Wing();
        Plane.Wing wing2 = new Plane.Wing();
        wing1.PrintWingWeight();
        wing2.PrintWingWeight();
    }

    public static void main(String[] args) {
        Plane plane1 = new Plane();
        plane1.InnerMethod();
    }

    // Вложенный класс

    static class Wing1 {
        int wingWeight1;

        void PrintWingWeight1() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите вес крыла из вложенного класса: ");
            wingWeight1 = scanner.nextInt();
            System.out.println("Вес крыла из вложенного класса: " + wingWeight1);
        }
    }

}
