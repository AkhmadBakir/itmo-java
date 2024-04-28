package itmo.java.lab6.Ex5;

import java.util.Scanner;

public class Parent {
    private int userAge;
    private String userName;

    Scanner scanner = new Scanner(System.in);

    public void lab() {
        System.out.println("Введите возраст: ");
        this.userAge = scanner.nextInt();
        System.out.println(userAge);
    }

    public Parent(int userAge, String userName) {
        this.userAge = userAge;
        this.userName = userName;
    }
}