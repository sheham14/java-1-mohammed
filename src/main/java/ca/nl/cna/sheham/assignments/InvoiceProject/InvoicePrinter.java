package ca.nl.cna.sheham.assignments.InvoiceProject;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDate;

public class InvoicePrinter {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BG_BLACK = "\u001B[40m";
    public static final String ANSI_BG_RED = "\u001B[41m";
    public static final String ANSI_BG_GREEN = "\u001B[42m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";
    public static final String ANSI_BG_MAGENTA = "\u001B[45m";
    public static final String ANSI_BG_CYAN = "\u001B[46m";
    public static final String ANSI_BG_WHITE = "\u001B[47m";

    public static void main(String[] args) {
        System.out.println(ANSI_YELLOW + "Retro Computers Services\n" + ANSI_RESET);
        Scanner input = new Scanner(System.in);
        char c;
        Catalog catalog = new Catalog();
        ArrayList<InvoiceItem> itemList = new ArrayList<>();

        do {
            System.out.print(ANSI_RESET + """
                    A. Create New Invoice
                    B. Print Product Catalog
                    C. Print Service Catalog
                    Q. Exit
                    """);
            c = Character.toUpperCase(input.next().charAt(0));

            if (c == 'A') {
                System.out.print("Enter Customer Name: ");
                input.nextLine();
                String name = input.nextLine();

                System.out.print("Enter Customer Street: ");
                String street = input.nextLine();

                System.out.print("Enter Customer City: ");
                String city = input.nextLine();

                System.out.print("Enter Customer Province: ");
                String province = input.nextLine();

                Address address = new Address(street, city, province);
                Customer customer = new Customer(name, address);

                do {
                    System.out.print("Enter Item ID: ");
                    String id = input.nextLine();
                    BillableItem item = catalog.getProduct(id);
                    if(item == null){
                        item = catalog.getService(id);
                    }

                    System.out.print("Enter Quantity: ");
                    int quantity = input.nextInt();
                    InvoiceItem invoiceItem = new InvoiceItem(item, quantity);
                    itemList.add(invoiceItem);

                    System.out.print("Add another item? (Y/N): ");
                    c = Character.toUpperCase(input.next().charAt(0));
                    input.nextLine();
                } while (c != 'N');

                Invoice invoice = new Invoice(itemList, 1, customer, LocalDate.now().plusWeeks(1));
                printAsciiInvoice(invoice);
            } else if (c == 'B') {
                catalog.printProducts();
            } else if (c == 'C') {
                catalog.printServices();
            }
        } while (c != 'Q');
        System.out.println("\nThank you for shopping!");
    }

    public static void printAsciiInvoice(Invoice invoice) {
        System.out.println(ANSI_YELLOW + "Retro Computers Invoice\n" + ANSI_RESET);

        // Retro Computers company information
        System.out.println(ANSI_BLUE + "**************" + ANSI_YELLOW +  "Retro Computers" + ANSI_BLUE + "**************" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "123 Tech Street, Tech City, TC 12345" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Phone: " + ANSI_YELLOW + "(123) 456-7890 " + ANSI_BLUE + "Email:" + ANSI_YELLOW + "info@retrocomputers.com" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "********************************************\n" + ANSI_RESET);

        // Invoice number and date
        System.out.println(ANSI_YELLOW + "Invoice Number: " + invoice.getInvoiceNum() + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Date: " + LocalDate.now() + ANSI_RESET);

        // Customer information
        Customer customer = invoice.getCustomer();
        System.out.println(ANSI_BLUE + "\n**************" + ANSI_YELLOW +  "Customer Information" + ANSI_BLUE + "**************" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Name: " + ANSI_YELLOW + customer.getName() + ANSI_RESET);
        Address address = customer.getAddress();
        System.out.println(ANSI_BLUE + "Address: " + ANSI_YELLOW + address.getStreet() + ", " + address.getCity() +
                ", " + address.getProvince() + ANSI_RESET);
        System.out.println(ANSI_BLUE + "**************************************************\n" + ANSI_RESET);

        // List of products and services
        ArrayList<InvoiceItem> itemList = invoice.getItemList();
        System.out.println(ANSI_BLUE + "**************" + ANSI_YELLOW + "Items" + ANSI_BLUE + "**************" + ANSI_RESET);

        // Find the maximum width for each column
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

        // Print column headers
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

        // ... (previous code)

        // List of products and services
//        ArrayList<InvoiceItem> itemList = invoice.getItemList();
//        System.out.println(ANSI_BLUE + "************** Items **************" + ANSI_RESET);

        // ... (previous code)

        // Calculation of subtotal, taxes (15%), and the total amount due
        double subtotal = invoice.getInvoiceTotal();
        double taxes = invoice.getInvoiceTax();
        double totalAmountDue = subtotal + taxes;

        // Print calculations
        System.out.println(ANSI_CYAN + "********************************************" + ANSI_RESET);
        System.out.printf(ANSI_BLUE + "%-" + (maxDescriptionWidth + 5) + "s%-"
                        + ANSI_YELLOW + (maxQuantityWidth + 5) + "s%-"
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




