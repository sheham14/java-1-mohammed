package ca.nl.cna.sheham.assignments.Fall2023.Assignment5;

/**
 * A class for an invoice that contains 3 instances of an invoice item.
 */
public class Invoice {

    private InvoiceItem item1;
    private InvoiceItem item2;
    private InvoiceItem item3;

    /**
     * The constructor for the invoice object containing the three invoice item instances.
     *
     * @param item1 The first item in the invoice
     * @param item2 The second item in the invoice
     * @param item3 The third item in the invoice
     */
    public Invoice(InvoiceItem item1, InvoiceItem item2, InvoiceItem item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    /**
     * Fetches the first item of the invoice and returns it.
     *
     * @return item1
     */
    public InvoiceItem getItem1() {
        return item1;
    }

    /**
     * Sets the first item to a new instance of InvoiceItem class.
     *
     * @param item1 The new InvoiceItem instance
     */
    public void setItem1(InvoiceItem item1) {
        this.item1 = item1;
    }

    /**
     * Fetches the second item of the invoice and returns it.
     *
     * @return item2
     */
    public InvoiceItem getItem2() {
        return item2;
    }

    /**
     * Sets the second item to a new instance of InvoiceItem class.
     *
     * @param item2 The new InvoiceItem instance
     */
    public void setItem2(InvoiceItem item2) {
        this.item2 = item2;
    }

    /**
     * Fetches the third item of the invoice and returns it.
     *
     * @return item3
     */
    public InvoiceItem getItem3() {
        return item3;
    }

    /**
     * Sets the third item to a new instance of InvoiceItem class.
     *
     * @param item3 The new InvoiceItem instance
     */
    public void setItem3(InvoiceItem item3) {
        this.item3 = item3;
    }

    /**
     * Calculates the total of the invoice by adding the totals of each invoice item.
     *
     * @return total of item1 + item2 + item3
     */
    public double getInvoiceTotal() {
        return item1.getItemTotal() + item2.getItemTotal() + item3.getItemTotal();
    }
}
