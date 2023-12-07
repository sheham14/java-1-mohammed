package ca.nl.cna.sheham.assignments.InvoiceProject;

public abstract class BillableItem {

    private String id;
    private String description;
    private double price;

    public BillableItem(String id, String description, double price){

        this.id = id;
        this.description = description;
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be a positive number!");
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be a positive number!");
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

}
