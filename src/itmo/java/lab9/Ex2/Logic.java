package itmo.java.lab9.Ex2;

import java.util.List;
import java.util.Random;

public class Logic {
    public static void addMethod(List<Integer> objects, int x) {
        for (int i = 0; i < 1000000; i++) {
            objects.add(i);
        }
    }

    public static void takeRandom(List<Integer> objects) {
        Random random = new Random();
        Integer x = objects.get(random.nextInt(100000));
    }

    public static long durationMethod(List<Integer> objects) {
        long startTime = System.nanoTime();
        takeRandom(objects);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        return duration;
    }
}