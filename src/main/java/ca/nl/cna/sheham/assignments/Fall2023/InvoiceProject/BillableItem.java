package ca.nl.cna.sheham.assignments.Fall2023.InvoiceProject;

/**
 * A class for a billable item
 */
public abstract class BillableItem {

    private String id;
    private String description;
    private double price;

    /**
     * Constructor of the billable item
     *
     * @param id          ID of the item
     * @param description Description of the item
     * @param price       The price of the item. Must be a positive number
     */
    public BillableItem(String id, String description, double price) {

        this.id = id;
        this.description = description;
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be a positive number!");
        }
    }

    /**
     * Gets the ID of an item
     *
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID to a new one
     *
     * @param id The new ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the price of the product
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the item to a new value. Must be positive
     *
     * @param price The new price
     */
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be a positive number!");
        }
    }

    /**
     * Gets the description of the product
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the product to a new one
     *
     * @param description The new description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
