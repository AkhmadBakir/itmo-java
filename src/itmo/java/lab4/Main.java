package itmo.java.lab4;

import itmo.java.lab2.Color;
import itmo.java.lab2.Shapes;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое целое число:");
//        int x = scanner.nextInt();
//        System.out.println("Введите второе целое число:");
//        int y = scanner.nextInt();
//        System.out.println("Введите третье целое число:");
//        int z = scanner.nextInt();

        // Часть I. Первое упражнение

//        Exercises first = new Exercises();
//        String firstResult = first.firstExercise(x, y);
//        System.out.println(firstResult);

        // Часть I. Второе упражнение

//        Exercises second = new Exercises();
//        String secondResult = second.secondExercise(x, y);
//        System.out.println(secondResult);

        // Часть I. Третье упражнение

//        Exercises third = new Exercises();
//        Boolean thirdResult = third.thirdExercise(x, y, z);
//        System.out.println(thirdResult);

        // Часть I. Четвертое упражнение

//        Exercises fourth = new Exercises();
//        Boolean fourthResult = fourth.fourthExercise(x, y, z);
//        System.out.println(fourthResult);

        // Часть I. Пятое упражнение

//        Exercises fifth = new Exercises();
//        int[] array = {3, -3, 7, 4, 5, 2, 3};
//        Boolean fifthResult = fifth.fifthExercise(array);
//        System.out.println(fifthResult);

        // Часть I. Шестое упражнение

//        Exercises sixth = new Exercises();
//        int[] array = {3, -3, 7, 4, 5, 2, 4};
//        Boolean sixthResult = sixth.sixthExercise(array);
//        System.out.println(sixthResult);

        // Часть II. Первое упражнение

//        Exercises first = new Exercises();
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        Boolean firstResult = first.firstExerciseTwo(array);
//        System.out.println(firstResult);

        // Часть II. Второе упражнение

//        Scanner scanner = new Scanner(System.in);
//        Exercises second = new Exercises();
//        System.out.println("Введите длину массива:");
//        int x = scanner.nextInt();
//        System.out.println("Введите числа массива:");
//        int[] array = second.secondExerciseTwo(x);
//        System.out.println(Arrays.toString(array));

        // Часть II. Третье упражнение

//        Exercises third = new Exercises();
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        int[] yrraa  = third.thirdExerciseTwo(array);
//        System.out.println(Arrays.toString(yrraa));

        // Часть II. Четвертое упражнение

//        Exercises fourth = new Exercises();
//        int[] array = {1, 1, 3, 3, 5, 5};
//        int x = fourth.fourthExerciseTwo(array);
//        System.out.println(x);

        // Часть II. Пятое упражнение

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int x = scanner.nextInt();
        int[] array = new int[x];
        Exercises fifth = new Exercises();
        int[] arraySort = fifth.fifthExerciseTwo(array);
        System.out.println(Arrays.toString(arraySort));


    }

}



