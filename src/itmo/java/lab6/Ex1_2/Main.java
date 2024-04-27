package itmo.java.lab6.Ex1_2;

public class Main {
    public static void main(String[] args) {
        Additional bankEmployee1 = new BankEmployee("Самый плохой банк", "Петр", "Петров", "123456789");
        Additional clien1 = new Client("Самый лучший банк", "Иван", "Иванов", "987654321");

        printPhone(bankEmployee1);
        printPhone(clien1);
    }

    public static void printPhone(Additional additional) {
        additional.printPhone();
    }
}
