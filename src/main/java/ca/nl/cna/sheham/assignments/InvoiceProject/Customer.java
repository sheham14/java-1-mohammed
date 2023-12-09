package ca.nl.cna.sheham.assignments.InvoiceProject;

/**
 * Class for a customer
 */
public class Customer {
    private String name;

    private Address address;

    /**
     * Constructor for the customer
     *
     * @param name    Name of the customer
     * @param address Address of the customer
     */
    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Gets the name of the customer
     *
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * Sets the name of the customer to a new one
     *
     * @param name The new name
     */

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the address of the customer
     *
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the customer address to a new one
     *
     * @param address The new address
     */
    public void setAddress(Address address) {
        this.address = address;
    }
}
