package itmo.java.lab4;

import java.util.Scanner;

public class Exercises {

    // Часть I. Первое упражнение

    public String firstExercise(int x, int y) {

        StringBuilder result = new StringBuilder();
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                result.append(i).append("\n");
            }
        }
        return result.toString();
    }

    // Часть I. Второе упражнение

    public String secondExercise(int x, int y) {
        StringBuilder result = new StringBuilder();
        for (int i = x; i <= y; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("Делится на 3 и 5:").append(i).append("\n");
            } else if (i % 3 == 0) {
                result.append("Делится на 3:").append(i).append("\n");
            } else if (i % 5 == 0) {
                result.append("Делится на 5:").append(i).append("\n");
            }
        }
        return result.toString();
    }

    // Часть I. Третье упражнение

    public Boolean thirdExercise(int x, int y, int z) {
        return x + y == z;
    }

    // Часть I. Четвертое упражнение

    public Boolean fourthExercise(int x, int y, int z) {
        return y > x && z > y;
    }

    // Часть I. Пятое упражнение

    public Boolean fifthExercise(int[] array) {
        int a = array[0];
        int b = array.length - 1;
        return (a == 3 || b == 3);
    }

    // Часть I. Шестое упражнение

    public Boolean sixthExercise(int[] array) {
        boolean check = false;
        for (int j : array) {
            if (j == 1 || j == 3) {
                check = true;
                break;
            }
        }
        return check;
    }

    // Часть II. Первое упражнение

    public Boolean firstExerciseTwo(int[] array) {
        boolean check = true;
        for (int j = 0; j < array.length - 1; j++)
            if (array[j + 1] < array[j]) {
                check = false;
                break;
            }
        return check;
    }

    // Часть II. Второе упражнение

    public int[] secondExerciseTwo(int x) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayResult = new int[x];
        for (int j = 0; j < arrayResult.length; j++) {
            arrayResult[j] = scanner.nextInt();
        }
        return arrayResult;
    }

    // Часть II. Третье упражнение

    public int[] thirdExerciseTwo(int[] array) {
        //int[] arrayResult = array;
        int x = array[0];
        int y = array[array.length - 1];
        int z = array[0];
        array[0] = y;
        array[array.length - 1] = z;
        return array;
    }

    // Часть II. Четвертое упражнение

    public int fourthExerciseTwo(int[] array) {
        int x = 0;
        for (int j = 0; j < array.length; j++) {
            boolean flag = true;

            for (int i = 0; i < array.length; i++) {
                if (j != i && array[j] == array[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return array[j];
            };
        }
        return x;
    }
}
