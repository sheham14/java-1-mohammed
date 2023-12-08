package ca.nl.cna.sheham.assignments.InvoiceProject;

public class Service extends BillableItem {

    /**
     * Simple constructor for the service class.
     * @param service One of the options from the Services enum.
     */
    public Service(Service.Services service){
        super(service.getId(), service.getDescription(), service.getPrice());
    }

    /**
     * Enum to store all the services being offered. Gets around not using DB or files.
     */
    public enum Services{
        COMPUTER_ASSEMBLE("CA", "Computer Assembly", 125.00),
        GENERAL_REPAIR("GR", "General Repair (per hour)", 27.50),
        DEFRAGMENT_HARD_DRIVE("DH", "Defragment Hard Drive", 25.00);

        private final String id;
        private final String description;
        private final double price;

        /**
         * Simple constructor for the enum to represent the service.
         * @param description Description of the service.
         * @param price Unit price of the service.
         */
        Services(String id, String description, double price) {
            this.id = id;
            this.description = description;
            this.price = price;
        }

        /**
         * getID.
         * @return The string ID for the service.
         */
        public String getId() {
            return id;
        }

        /**
         * getDescription.
         * @return The description of the service.
         */
        public String getDescription() {
            return description;
        }

        /**
         * getPrice.
         * @return The price of the service.
         */
        public double getPrice() {
            return price;
        }

    }

}