package itmo.java.lab9.Ex2;

import java.sql.SQLOutput;
import java.util.*;

import static itmo.java.lab9.Ex2.Logic.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите длину List: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        ArrayList<Integer> firstList = new ArrayList<>();
        addMethod(firstList, x);

        LinkedList<Integer> secondList = new LinkedList<>();
        addMethod(secondList, x);

        long durationArrayList = durationMethod(firstList);
        System.out.println("Время выполнения ArrayList<Integer>: " + durationArrayList);

        long durationLinkedList = durationMethod(firstList);
        System.out.println("Время выполнения LinkedList<Integer>: " + durationLinkedList);

    }

}
