package itmo.java.lab6.Ex1_2;

public abstract class Human {
    private String firstName;
    private String lastName;
    private String phone;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void Human() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public abstract void showInfo();

}
