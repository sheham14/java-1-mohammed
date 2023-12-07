package ca.nl.cna.sheham.assignments.InvoiceProject;

public enum ServiceType {
    COMPUTER_ASSEMBLE("CA001","Computer Assemble", 125.0),
    DEFRAGMENT_HARD_DRIVE("DH001", "Defragment Hard Drive", 25.0),
    GENERAL_REPAIR("GR001","General Repair", 27.5);

    private final String id;
    private final String description;
    private final double price;

    ServiceType(String id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public String getId(){
        return id;
    }
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
