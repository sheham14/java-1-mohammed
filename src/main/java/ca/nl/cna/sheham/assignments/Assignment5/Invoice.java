package ca.nl.cna.sheham.assignments.Assignment5;

public class Invoice {

    private InvoiceItem item1;
    private InvoiceItem item2;
    private InvoiceItem item3;

    public InvoiceItem getItem1() {
        return item1;
    }

    public void setItem1(InvoiceItem item1) {
        this.item1 = item1;
    }

    public InvoiceItem getItem2() {
        return item2;
    }

    public void setItem2(InvoiceItem item2) {
        this.item2 = item2;
    }

    public InvoiceItem getItem3() {
        return item3;
    }

    public void setItem3(InvoiceItem item3) {
        this.item3 = item3;
    }

    public double getInvoiceTotal() {return item1.getItemTotal() + item2.getItemTotal() + item3.getItemTotal();}
}
