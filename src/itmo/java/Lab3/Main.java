package itmo.java.Lab3;

public class Main {
    public static void main(String[] args) {
        SimpleClassCar mitsubishi = new SimpleClassCar("red", "mitsubishi", 1500.0);
        SimpleClassCar niva = new SimpleClassCar("green", "niva", 1400.0);
        mitsubishi.printData();
        niva.printData();

        House firstHouse = new House(10, 1980, "First");
        House secondHouse = new House(20, 1990, "Second");

        firstHouse.printData();
        firstHouse.ageHouse(1980);
        secondHouse.printData();
        secondHouse.ageHouse(1990);

        Tree tree1 = new Tree(10, "tree1");
        Tree tree2 = new Tree(15, true, "tree2");
        Tree tree3 = new Tree();
    }
}
