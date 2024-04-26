package itmo.java.lab3;

public class SimpleClassCar {
    private String color;
    private String name;
    private Double weight;

    SimpleClassCar(String color, String name, Double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public void printData() {
        System.out.println(color + " " + name + " " + weight);
    }

    public void setColor() {
        this.color = color;
    }

    public void setColorWeight() {
        this.color = color;
        this.weight = weight;
    }

    public SimpleClassCar() {
    }
}
