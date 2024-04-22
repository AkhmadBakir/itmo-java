package itmo.java.Lab3;

import java.time.Year;

public class House {
    private Integer numberOfFloors;
    private Integer yearOfConstruction;
    private String name;

    House(Integer numberOfFloors, Integer yearOfConstruction, String name) {
        this.numberOfFloors = numberOfFloors;
        this.yearOfConstruction = yearOfConstruction;
        this.name = name;
    }

    public void printData() {
        System.out.println(numberOfFloors + " " + yearOfConstruction + " " + name);
    }

    public Integer ageHouse(Integer yearOfConstruction) {
        Integer thisYear = Year.now().getValue();
        return thisYear - yearOfConstruction;
    }
}
