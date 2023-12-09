package ca.nl.cna.sheham.assignments.InvoiceProject;

/**
 * A class for a products. Inherits from the BillableItem class
 */
public class Product extends BillableItem{

    public Product(String id, String description, double price) {
        super(id, description, price);
    }
}
