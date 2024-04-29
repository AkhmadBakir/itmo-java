package itmo.java.lab9.Ex1;

import java.util.*;

import static itmo.java.lab9.Ex1.RemoveReplay.removeReplay;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6));
        System.out.println(removeReplay(numbers));

    }

}
