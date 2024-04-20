package itmo.java.lab2;

import java.awt.*;

public class Shapes {
    private String name;
    private Color color;
    private Double square;

    public Shapes() {
    }

    public Shapes(Double square, Color color, String name) {
        this.square = square;
        this.color = color;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Double getSquare() {
        return square;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquare(Double square) {
        this.square = square;
    }
}
