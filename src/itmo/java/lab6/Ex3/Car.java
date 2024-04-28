package itmo.java.lab6.Ex3;

public class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и ее скорость - " + speed);
    }

    public Car(int w, String m, char c, float s) {
        weight = w;
        model = m;
        color = c;
        speed = s;
    }

    public Car() {
    }
}

