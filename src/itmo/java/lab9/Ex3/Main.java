package itmo.java.lab9.Ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import static itmo.java.lab9.Ex3.Play.printScore;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.setName("Mark");
        user2.setName("John");
        user3.setName("Ann");

        Map<User, Integer> score = new HashMap<>();
        score.put(user1, 10);
        score.put(user2, 20);
        score.put(user3, 30);

        System.out.println("Введите имя польлзователя:");
        String nameUser = scanner.nextLine();
        Set<Integer> scoreUser = printScore(nameUser, score);
        System.out.println("У пользователя " + nameUser + ": " + scoreUser + " очков.");
    }
}
