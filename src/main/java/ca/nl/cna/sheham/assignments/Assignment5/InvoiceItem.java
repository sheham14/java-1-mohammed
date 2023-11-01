package ca.nl.cna.sheham.assignments.Assignment5;

public class InvoiceItem {
    private Product product;
    private int quantity;

    public InvoiceItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public double getItemTotal() {
        return product.getPrice() * quantity;
    }
}
