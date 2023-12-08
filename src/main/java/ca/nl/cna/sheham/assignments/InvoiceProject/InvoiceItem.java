package ca.nl.cna.sheham.assignments.InvoiceProject;

public class InvoiceItem {
    public static final double TAX = 0.15;
    private BillableItem item;
    private int quantity;

    public InvoiceItem(BillableItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public BillableItem getItem() {
        return item;
    }

    public void setItem(BillableItem item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double itemTotal() {
        return item.getPrice() * quantity;
    }

    public double itemTax(){
        return quantity * (item.getPrice() * TAX);
    }

    @Override
    public String toString() {
        return "Item: " + item.getDescription() + ", Quantity: " + quantity +
                ", Total: $" + itemTotal() + ", Tax: $" + itemTax();
    }
}
