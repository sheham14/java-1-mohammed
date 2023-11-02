package ca.nl.cna.sheham.assignments.Assignment5;

public class Product {
    private int id;
    private String description;
    private Double price;

    public Product(int id, String description, Double price) {
        this.id = id;
        this.description = description;
        this.price = price;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be a positive number!");
        }
    }

}
