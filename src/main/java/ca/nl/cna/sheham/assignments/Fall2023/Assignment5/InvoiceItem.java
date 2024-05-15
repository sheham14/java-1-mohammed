package ca.nl.cna.sheham.assignments.Fall2023.Assignment5;

/**
 * A class for an invoice item. Contains a product with its quantity.
 */
public class InvoiceItem {
    private Product product;
    private int quantity;

    /**
     * The constructor of the invoice item object.
     *
     * @param product  An object of Product class
     * @param quantity The number of the product bought
     */
    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity must be a positive number!");
        }

    }

    /**
     * Fetches the product object and returns it.
     *
     * @return product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the product object to a new instance of Product class.
     *
     * @param product The new instance of the product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Fetches the quantity of the product bought and returns it.
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product to a new value.
     *
     * @param quantity Must be a positive number
     */
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity must be a positive number!");
        }
    }

    /**
     * Calculates the total cost of the product by multiplying its price and quantity.
     *
     * @return product price * quantity
     */
    public double getItemTotal() {
        return product.getPrice() * quantity;
    }
}
