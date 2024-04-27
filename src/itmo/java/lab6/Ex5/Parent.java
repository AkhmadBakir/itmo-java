package itmo.java.lab6.Ex5;

import java.util.Scanner;

public class Parent {
    private int userAge;
    private String userName;

    Scanner scanner = new Scanner(System.in);

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = userName;
    }

    public void lab() {
        this.userAge = scanner.nextInt();
    }

}