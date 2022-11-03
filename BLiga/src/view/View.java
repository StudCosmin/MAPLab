package view;

import controller.Controller;

public class View {
    private Controller controller;

    // constructor
    public View(Controller controller) {
        this.controller = controller;
    }

    // asks the user for role (user / admin)
    public int pickUserRole() {
        System.out.println("============");
        // Cod
        System.out.println("============\n");
        return 0;
    }

    // special menu for user
    public void showUserMenu() {
        System.out.println("============");
        // Cod
        System.out.println("============\n");
    }

    // special menu for admin
    public void showAdminMenu() {
        System.out.println("============");
        // Cod
        System.out.println("============\n");
    }

    // main view function encapsulating the other view functions
    public void showMenu() {
        System.out.println("============");
        // Cod
        System.out.println("============\n");
    }
}
