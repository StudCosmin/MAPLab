package person;

import interfaces.Information;

public class Manager extends Person implements Information {
    private int yearsOfExperience;

    public Manager(String firstName, String lastName, int age, int salary, int yearsOfExperience) {
        super(firstName, lastName, age, salary);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setyearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void showDetails() {

    }
}
