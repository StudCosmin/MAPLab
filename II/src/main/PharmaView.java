package main;

public class PharmaView {

    public void showMenu() {
        System.out.println("1. Adauga medicament");
        System.out.println("2. Sterge medicament");
        System.out.println("3. Vezi medicamentele");
        System.out.println();
    }

    public void viewDetails(int id, String name, int price) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
