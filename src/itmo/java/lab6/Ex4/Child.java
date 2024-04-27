package itmo.java.lab6.Ex4;

public class Child extends Parent {

    public Child(int age) {
        super(age);
    }

    public void printAge() {
        System.out.println("Возраст:" + getAge());
    }

}
