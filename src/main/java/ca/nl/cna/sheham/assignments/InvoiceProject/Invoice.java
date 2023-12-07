package ca.nl.cna.sheham.assignments.InvoiceProject;

import java.util.ArrayList;

public class Invoice {
  private ArrayList<InvoiceItem> itemList;

  private int invoiceNum;

    public Invoice(ArrayList<InvoiceItem> itemList, int invoiceNum) {
        this.itemList = itemList;
        this.invoiceNum = invoiceNum;
    }

    public ArrayList<InvoiceItem> getItemList() {
        return itemList;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public double getInvoiceTotal(){
        double total = 0.00;
        for(InvoiceItem item : itemList){
            total += item.itemTotal();
        }
        return total;
    }

    public double getInvoiceTax(){
        double totalTax = 0.00;
        for(InvoiceItem item : itemList){
            totalTax += item.itemTax();
        }
        return totalTax;
    }
}
