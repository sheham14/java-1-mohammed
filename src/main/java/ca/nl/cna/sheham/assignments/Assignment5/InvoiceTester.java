package ca.nl.cna.sheham.assignments.Assignment5;
import java.util.Scanner;

public class InvoiceTester {

    public static void main(String[] args) {
        Product bread = new Product(1, "Bread", -2.99);
        Product milk = new Product(2, "Milk", 4.99);
        Product eggs = new Product(3, "Eggs", 3.99);
        InvoiceItem invoiceBread = new InvoiceItem(bread, 2);
        InvoiceItem invoiceMilk = new InvoiceItem(milk, 3);
        InvoiceItem invoiceEggs = new InvoiceItem(eggs, 4);
        Invoice groceryInvoice = new Invoice(invoiceBread, invoiceMilk, invoiceEggs);

        System.out.printf("Product: %s, Price: %s, Quantity: %s\nProduct: %s, Price: %s, Quantity: %s\nProduct: %s, Price: %s, Quantity: %s\n Total: %.2f",
                groceryInvoice.getItem1().getProduct().getDescription(),
                groceryInvoice.getItem1().getProduct().getPrice(),
                groceryInvoice.getItem1().getQuantity(),
                groceryInvoice.getItem2().getProduct().getDescription(),
                groceryInvoice.getItem2().getProduct().getPrice(),
                groceryInvoice.getItem2().getQuantity(),
                groceryInvoice.getItem3().getProduct().getDescription(),
                groceryInvoice.getItem3().getProduct().getPrice(),
                groceryInvoice.getItem3().getQuantity(),
                groceryInvoice.getInvoiceTotal());

    }


}
