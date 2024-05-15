package ca.nl.cna.sheham.assignments.Fall2023.Assignment5;

/**
 * A class for an individual product. Contains the ID, description, and its price.
 */
public class Product {
    private int id;
    private String description;
    private Double price;

    /**
     * The constructor for an object of Product class.
     *
     * @param id          The ID of the product. Cannot be negative.
     * @param description The description of the product. Name is sufficient.
     * @param price       Price of the product. Cannot be negative.
     */
    public Product(int id, String description, Double price) {
        this.id = id;
        this.description = description;
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be a positive number!");
        }
    }

    /**
     * Fetches the ID of the product and returns it.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the product to a new value.
     *
     * @param id Cannot be negative
     */
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must be a positive number!");
        }
    }

    /**
     * Fetches the description of the product and returns it.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the product to a new string.
     *
     * @param description The new description of the product
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Fetches the price of the product and returns it.
     *
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product to a new value. It cannot be negative.
     *
     * @param price New price of the product
     */
    public void setPrice(Double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be a positive number!");
        }
    }
}
