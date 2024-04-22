package itmo.java.Lab3;

public class Tree {
    private Integer age;
    private Boolean aliveTree;
    private String name;

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, Boolean aliveTree, String name) {
        this.age = age;
        this.aliveTree = aliveTree;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
