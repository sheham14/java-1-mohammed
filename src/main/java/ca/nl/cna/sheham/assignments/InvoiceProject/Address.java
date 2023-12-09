package ca.nl.cna.sheham.assignments.InvoiceProject;

/**
 * A class to store customer address details
 */
public class Address {

    private String street;
    private String city;
    private String province;

    /**
     * Constructor for the address
     *
     * @param street   The street the customer lives on
     * @param city     The city the customer lives in
     * @param province The province the customer lives in
     */
    public Address(String street, String city, String province) {
        this.street = street;
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the street
     *
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street to a new one
     *
     * @param street The new street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the city of the customer
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the customer to a new one
     *
     * @param city The new city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the province of the customer
     *
     * @return city
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the province of the customer to a new one
     *
     * @param province The new city
     */
    public void setProvince(String province) {
        this.province = province;
    }
}
