package ca.nl.cna.sheham.assignments.InvoiceProject;

/**
 * A class for an invoice line item
 */
public class InvoiceItem {
    public static final double TAX = 0.15;
    private BillableItem item;
    private int quantity;

    /**
     * Constructor for the invoice item
     *
     * @param item     The item
     * @param quantity The quantity of the item
     */
    public InvoiceItem(BillableItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    /**
     * Gets the item
     *
     * @return item
     */
    public BillableItem getItem() {
        return item;
    }

    /**
     * Sets the item to a new one
     *
     * @param item the new item
     */
    public void setItem(BillableItem item) {
        this.item = item;
    }

    /**
     * Gets the quantity
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the item to a new one
     *
     * @param quantity The new quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Calculates the total price of the item by multiplying unit price and quantity
     *
     * @return Total price
     */
    public double itemTotal() {
        return item.getPrice() * quantity;
    }

    /**
     * Calculates the total tax on the item
     *
     * @return total tax
     */
    public double itemTax() {
        return quantity * (item.getPrice() * TAX);
    }

    /**
     * Prints the item in a formatted way
     *
     * @return The formatted invoice information
     */
    @Override
    public String toString() {
        return "Item: " + item.getDescription() + ", Quantity: " + quantity +
                ", Total: $" + itemTotal() + ", Tax: $" + itemTax();
    }
}
