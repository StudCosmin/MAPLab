package main;

public class PharmaController {
    private Pharma model;
    private PharmaView view;

    public PharmaController(Pharma model, PharmaView view) {
        this.model = model;
        this.view = view;
    }

    public void setPharmaName(String name) {
        model.setName(name);
    }

    public void setPharmaId(int id) {
        model.setId(id);
    }

    public void setPharmaPrice(int price) {
        model.setPrice(price);
    }

    public String getPharmaName() {
        return model.getName();
    }

    public int getPharmaId() {
        return model.getId();
    }

    public int getPharmaPrice() {
        return model.getPrice();
    }

    public void updateView() {
        view.viewDetails(model.getId(), model.getName(), model.getPrice());
    }
}
