package ca.nl.cna.sheham.assignments.InvoiceProject;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDate;

/**
 * A class to generate invoices and view catalogs
 */
public class InvoicePrinter {

    public static void main(String[] args) {
        System.out.println("Retro Computers Services\n");
        Scanner input = new Scanner(System.in);
        char c;
        Catalog catalog = new Catalog();
        ArrayList<InvoiceItem> itemList = new ArrayList<>();

        do {
            System.out.print("""
                    A. Create New Invoice
                    B. Print Product Catalog
                    C. Print Service Catalog
                    D. Print Demo Invoice
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
                Invoice.printAsciiInvoice(invoice);
            } else if (c == 'B') {
                catalog.printProducts();
            } else if (c == 'C') {
                catalog.printServices();
            } else if (c == 'D'){
                Address address = new Address("123 Real Street", "St John's", "NL");
                Customer customer = new Customer("Tosh Baylor", address);

                InvoiceItem intelPentium = new InvoiceItem(catalog.getProduct("CP001"), 1 );
                InvoiceItem asusMboard = new InvoiceItem(catalog.getProduct("MB002"), 1 );
                InvoiceItem seagateHdd = new InvoiceItem(catalog.getProduct("HD003"), 1 );
                InvoiceItem kingstonRam = new InvoiceItem(catalog.getProduct("RM004"), 2 );
                InvoiceItem atiGraphics = new InvoiceItem(catalog.getProduct("VC005"), 1 );
                InvoiceItem powerSupply = new InvoiceItem(catalog.getProduct("PS007"), 1 );
                InvoiceItem metalCase = new InvoiceItem(catalog.getProduct("FN013"), 1 );
                InvoiceItem compAssembly = new InvoiceItem(catalog.getService("CA"), 1 );

                ArrayList<InvoiceItem> invoiceList = new ArrayList<>();
                invoiceList.add(intelPentium);
                invoiceList.add(asusMboard);
                invoiceList.add(seagateHdd);
                invoiceList.add(kingstonRam);
                invoiceList.add(atiGraphics);
                invoiceList.add(powerSupply);
                invoiceList.add(metalCase);
                invoiceList.add(compAssembly);

                Invoice invoice = new Invoice(invoiceList, 7, customer, LocalDate.now().plusWeeks(1));
                Invoice.printAsciiInvoice(invoice);
            }
        } while (c != 'Q');
        System.out.println("\nThank you for shopping!");
    }
}




