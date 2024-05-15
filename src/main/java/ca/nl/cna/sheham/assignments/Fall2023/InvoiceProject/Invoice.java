package ca.nl.cna.sheham.assignments.Fall2023.InvoiceProject;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Class for the invoice
 */
public class Invoice {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private ArrayList<InvoiceItem> itemList;
    private int invoiceNum;
    private Customer customer;
    private LocalDate dueDate;

    /**
     * Constructor for the invoice class
     * @param itemList The list of items
     * @param invoiceNum The invoice number
     * @param customer The customer
     * @param dueDate The due date of payment
     */
    public Invoice(ArrayList<InvoiceItem> itemList, int invoiceNum, Customer customer, LocalDate dueDate) {
        this.itemList = itemList;
        this.invoiceNum = invoiceNum;
        this.customer = customer;
        this.dueDate = dueDate;
    }

    /**
     * Gets the item list
     * @return Item list
     */
    public ArrayList<InvoiceItem> getItemList() {
        return itemList;
    }

    /**
     * Gets the invoice number
     * @return invoice number
     */
    public int getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * Gets the customer
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gets the due date
     * @return due date
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Calculates the invoice total
     * @return invoice total
     */
    public double getInvoiceTotal() {
        double total = 0.00;
        for (InvoiceItem item : itemList) {
            total += item.itemTotal();
        }
        return total;
    }

    /**
     * Calculates the total tax on the invoice
     * @return total tax
     */
    public double getInvoiceTax() {
        double totalTax = 0.00;
        for (InvoiceItem item : itemList) {
            totalTax += item.itemTax();
        }
        return totalTax;
    }

    /**
     * Sets the invoice number to a new one
     * @param invoiceNum The new invoice number
     */
    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    /**
     * Sets the due date of the invoice to a new one
     * @param dueDate
     */
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * The method the formats the invoice and prints it with all the details
     * @param invoice The invoice
     */
    public static void printAsciiInvoice(Invoice invoice) {
        System.out.println(ANSI_YELLOW + "Retro Computers Invoice\n" + ANSI_RESET);

        // Prints the company details
        System.out.println(ANSI_BLUE + "**************" + ANSI_YELLOW +  "Retro Computers" + ANSI_BLUE + "**************" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "123 Tech Street, Tech City, TC 12345" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Phone: " + ANSI_YELLOW + "(123) 456-7890 " + ANSI_BLUE + "Email:" + ANSI_YELLOW + "info@retrocomputers.com" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "********************************************\n" + ANSI_RESET);

        // Invoice number and date
        System.out.println(ANSI_YELLOW + "Invoice Number: " + invoice.getInvoiceNum() + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Date: " + LocalDate.now() + ANSI_RESET);

        // Customer details
        Customer customer = invoice.getCustomer();
        System.out.println(ANSI_BLUE + "\n**************" + ANSI_YELLOW +  "Customer Information" + ANSI_BLUE + "**************" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Name: " + ANSI_YELLOW + customer.getName() + ANSI_RESET);
        Address address = customer.getAddress();
        System.out.println(ANSI_BLUE + "Address: " + ANSI_YELLOW + address.getStreet() + ", " + address.getCity() +
                ", " + address.getProvince() + ANSI_RESET);
        System.out.println(ANSI_BLUE + "**************************************************\n" + ANSI_RESET);

        // The invoice items
        ArrayList<InvoiceItem> itemList = invoice.getItemList();
        System.out.println(ANSI_BLUE + "**************" + ANSI_YELLOW + "Items" + ANSI_BLUE + "**************" + ANSI_RESET);

        int maxDescriptionWidth = 0;
        int maxQuantityWidth = 0;
        int maxUnitPriceWidth = 0;
        int maxSubtotalWidth = 0;

        for (InvoiceItem item : itemList) {
            int descriptionWidth = item.getItem().getDescription().length();
            int quantityWidth = String.valueOf(item.getQuantity()).length();
            int unitPriceWidth = String.valueOf(item.getItem().getPrice()).length();
            int subtotalWidth = String.valueOf(item.itemTotal()).length();

            maxDescriptionWidth = Math.max(maxDescriptionWidth, descriptionWidth);
            maxQuantityWidth = Math.max(maxQuantityWidth, quantityWidth);
            maxUnitPriceWidth = Math.max(maxUnitPriceWidth, unitPriceWidth);
            maxSubtotalWidth = Math.max(maxSubtotalWidth, subtotalWidth);
        }

        System.out.printf(ANSI_BLUE + "%-" + (maxDescriptionWidth + 5) + "s%-"
                        + (maxQuantityWidth + 10) + "s%-"
                        + (maxUnitPriceWidth + 10) + "s%-"
                        + (maxSubtotalWidth + 10) + "s%n",
                "Description", "Quantity", "Unit Price ($)", "Subtotal ($)" + ANSI_RESET);

        // Print each item in columns
        for (InvoiceItem item : itemList) {
            System.out.printf( ANSI_YELLOW + "%-" + (maxDescriptionWidth + 5) + "s%-"
                            + (maxQuantityWidth + 10) + "s%-"
                            + (maxUnitPriceWidth + 10) + "s%-"
                            + (maxSubtotalWidth + 10) + "s%n",
                    item.getItem().getDescription(), item.getQuantity(),
                    item.getItem().getPrice(), item.itemTotal() + ANSI_RESET);
        }

        double subtotal = invoice.getInvoiceTotal();
        double taxes = invoice.getInvoiceTax();
        double totalAmountDue = subtotal + taxes;

        // Print calculations
        System.out.println(ANSI_BLUE + "********************************************" + ANSI_RESET);
        System.out.printf(ANSI_BLUE + "%-" + (maxDescriptionWidth + 5) + "s%-"
                        + (maxQuantityWidth + 5) + "s%-"
                        + (maxUnitPriceWidth + 5) + "s%-"
                        + (maxSubtotalWidth + 5) + "s%n",
                "", "", "Subtotal: $", subtotal);
        System.out.printf("%-" + (maxDescriptionWidth + 5) + "s%-"
                        + (maxQuantityWidth + 5) + "s%-"
                        + (maxUnitPriceWidth + 5) + "s%-"
                        + (maxSubtotalWidth + 5) + "s%n",
                "", "", "Taxes (15%): $", taxes);
        System.out.printf("%-" + (maxDescriptionWidth + 5) + "s%-"
                        + (maxQuantityWidth + 5) + "s%-"
                        + (maxUnitPriceWidth + 5) + "s%-"
                        + (maxSubtotalWidth + 5) + "s%n",
                "", "", "Total Amount Due: $", totalAmountDue);

        // Payment terms, including the due date
        System.out.println(ANSI_BLUE + "********************************************" + ANSI_RESET);
        System.out.println(ANSI_RED + "Payment Terms: Due on " + invoice.getDueDate() + ANSI_RESET);
    }
}



