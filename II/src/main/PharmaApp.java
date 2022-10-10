package main;

public class PharmaApp {
    public static void main(String[] args) {
        Pharma model = retrievePharma();

        PharmaView view = new PharmaView();

        PharmaController controller = new PharmaController(model, view);

        view.showMenu();

        /*
            // ID: 1
            // Name: Algocalmin
            // Price: 20
         */
        controller.updateView();

        /*
            // ID: 2
            // Name: Paracetamol
            // Price: 15
         */
        controller.setPharmaId(2);
        controller.setPharmaName("Paracetamol");
        controller.setPharmaPrice(15);

        System.out.println();
        controller.updateView();

        // finished

    }

    private static Pharma retrievePharma() {
        Pharma pharma = new Pharma();
        pharma.setId(1);
        pharma.setName("Algocalmin");
        pharma.setPrice(20);
        return pharma;
    }
}
