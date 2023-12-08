package ca.nl.cna.sheham.assignments.InvoiceProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Invoice {

    private ArrayList<InvoiceItem> itemList;
    private int invoiceNum;
    private Customer customer;
    private LocalDate dueDate;

    public Invoice(ArrayList<InvoiceItem> itemList, int invoiceNum, Customer customer, LocalDate dueDate) {
        this.itemList = itemList;
        this.invoiceNum = invoiceNum;
        this.customer = customer;
        this.dueDate = dueDate;
    }

    public ArrayList<InvoiceItem> getItemList() {
        return itemList;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getInvoiceTotal() {
        double total = 0.00;
        for (InvoiceItem item : itemList) {
            total += item.itemTotal();
        }
        return total;
    }

    public double getInvoiceTax() {
        double totalTax = 0.00;
        for (InvoiceItem item : itemList) {
            totalTax += item.itemTax();
        }
        return totalTax;
    }

    // You might want to add setters for invoiceNum and dueDate
    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String generateInvoice() {
        StringBuilder invoice = new StringBuilder();

        // Retro Computers company information
        invoice.append("Retro Computers\n");
        // Add address, contact information, etc.

        // Invoice number and date
        invoice.append("Invoice Number: ").append(getInvoiceNum()).append("\n");
        invoice.append("Date: ").append(getDueDate()).append("\n");

        // Customer information
        Customer customer = getCustomer();
        invoice.append("Customer Name: ").append(customer.getName()).append("\n");
        invoice.append("Customer Address: ").append(customer.getAddress().getStreet())
                .append(", ").append(customer.getAddress().getCity()).append(", ")
                .append(customer.getAddress().getProvince()).append("\n");

        // List of products and services
        invoice.append("\nItems:\n");
        for (InvoiceItem item : getItemList()) {
            invoice.append("Description: ").append(item.getItem().getDescription()).append("\n");
            invoice.append("Quantity: ").append(item.getQuantity()).append("\n");
            invoice.append("Unit Price: $").append(item.getItem().getPrice()).append("\n");
            invoice.append("Subtotal: $").append(item.itemTotal()).append("\n");
            invoice.append("--------------------------\n");
        }

        // Calculation of subtotal, taxes, and total amount due
        double subtotal = getInvoiceTotal();
        double taxes = getInvoiceTax();
        double total = subtotal + taxes;
        invoice.append("\nSubtotal: $").append(subtotal).append("\n");
        invoice.append("Taxes (15%): $").append(taxes).append("\n");
        invoice.append("Total Amount Due: $").append(total).append("\n");

        // Payment terms, including the due date (one week from the current date)
        LocalDate currentdate = LocalDate.now();
        LocalDate dueDate = currentdate.plusWeeks(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        invoice.append("\nPayment Terms: Due by ").append(dueDate.format(formatter)).append("\n");

        return invoice.toString();
    }
}


