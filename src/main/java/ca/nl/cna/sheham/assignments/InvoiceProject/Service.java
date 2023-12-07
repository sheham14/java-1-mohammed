package ca.nl.cna.sheham.assignments.InvoiceProject;

public class Service extends BillableItem{
    private final ServiceType serviceType;

    public Service(ServiceType serviceType) {
        super(serviceType.getId(), serviceType.getDescription(), serviceType.getPrice());
        this.serviceType = serviceType;
    }

    public String getId() {
        return serviceType.getId();
    }

    public String getDescription() {
        return serviceType.getDescription();
    }

    public double getPrice() {
        return serviceType.getPrice();
    }
}