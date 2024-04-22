package itmo.java.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String firstExercise() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                result.append(i);
            }
        }
        return result.toString();
    }

    public String secondExercise() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                result.append(i + "\n");
            } else if (i % 5 == 0) {
                result.append(i + "\n");
            } else if (i % 3 == 0 && i % 5 == 0) {
                result.append(i + "\n");
            }
        }
        return result.toString();
    }

    public Boolean thirdExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int x = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int y = scanner.nextInt();
        System.out.println("Введите третье целое число:");
        int z = scanner.nextInt();
        return x + y == y;
    }

    public Boolean fourthExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int x = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int y = scanner.nextInt();
        System.out.println("Введите третье целое число:");
        int z = scanner.nextInt();
        return y > x && z > y;
    }

    public Boolean fifthExercise() {
        int[] array = new int[] {3, -3, 7, 4, 5, 4, 3};
        return array[0] == 3 || array[array.length] == 3;
    }

    public Boolean sixthExercise() {
        int[] array = new int[] {3, -3, 7, 4, 5, 4, 3};
        boolean check = false;
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                check = true;
            }
        }
        return check;
    }


}



