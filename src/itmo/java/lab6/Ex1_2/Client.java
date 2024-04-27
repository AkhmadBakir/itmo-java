package itmo.java.lab6.Ex1_2;

public class Client extends Human implements Additional {
    private String nameBank;
    private String firstName = getFirstName();
    private String lastName = getLastName();
    private String phone = getPhone();

    public Client(String nameBank, String firstName, String lastName, String phone) {
        this.nameBank = nameBank;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Override
    public void showInfo() {
        System.out.println("Имя: " + this.firstName + "Фамилия: " + this.lastName + "Наименование банка: " + nameBank);
    }

    @Override
    public void printPhone() {
        System.out.println("Телефон клиента: " + this.phone);
    }


//    public void Client() {
//        this.nameBank = nameBank;
//    }
}