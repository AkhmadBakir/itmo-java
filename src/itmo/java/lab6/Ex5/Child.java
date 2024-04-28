package itmo.java.lab6.Ex5;

public class Child extends Parent {

    public Child(int userAge, String userName) {
        super(userAge, userName);
    }

    @Override
    public void lab() {
        System.out.println("Введите имя: ");
        String userName = scanner.nextLine();
        System.out.println(userName);
    }
}
