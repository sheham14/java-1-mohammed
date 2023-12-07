package ca.nl.cna.sheham.assignments.InvoiceProject;

import ca.nl.cna.sheham.assignments.Assignment6.CardDeck;

import java.util.Scanner;

public class InvoicePrinter {
    public static void main(String[] args) {
        System.out.println("\u001B[33m" + "Retro Computers Services\n" + "\u001B[0m");
        Scanner input = new Scanner(System.in);
        char c;
        Catalog catalog = new Catalog();

        do{
            System.out.print("\u001B[0m" + """
                    A. Create New Invoice
                    B. Print Product Catalog
                    C. Print Service Catalog
                    Q. Exit
                    """);
            c = Character.toUpperCase(input.next().charAt(0));
            if (c == 'A'){
                System.out.println("""
                         
                        """);
            } else if(c == 'B'){
                catalog.printProducts();
            } else if(c == 'C'){
                catalog.printServices();
            }
        }while(c != 'Q');
        System.out.println("\nThank you for shopping!");

    }
}