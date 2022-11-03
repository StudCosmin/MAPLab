package person;

import interfaces.Information;

public class Player extends Person implements Information {
    private String position;
    private String dexterity;


    public Player(String firstName, String lastName, int age, int salary, String position, String dexterity) {
        super(firstName, lastName, age, salary);
        this.position = position;
        this.dexterity = dexterity;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDexterity() {
        return dexterity;
    }

    public void setDexterity(String dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public void showDetails() {
        System.out.println("============");
        System.out.println("Name: " + this.getLastName());
        System.out.println("Surname" + this.getFirstName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Position: " + this.getPosition());
        System.out.println("Dexterity: " + this.getDexterity());
        System.out.println("============\n");
    }
}
