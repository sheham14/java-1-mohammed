package ca.nl.cna.sheham.assignments.InvoiceProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A class for the store catalog. Plays the role of a database.
 */
public class Catalog {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_MAGENTA = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BG_BLACK = "\u001B[40m";
    public static final String ANSI_BG_RED = "\u001B[41m";
    public static final String ANSI_BG_GREEN = "\u001B[42m";
    public static final String ANSI_BG_YELLOW = "\u001B[43m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";
    public static final String ANSI_BG_MAGENTA = "\u001B[45m";
    public static final String ANSI_BG_CYAN = "\u001B[46m";
    public static final String ANSI_BG_WHITE = "\u001B[47m";

    ArrayList<Product> productArrayList;
    ArrayList<Service> serviceArrayList;

    /**
     * Simple constructor that builds a standard product list
     */
    public Catalog() {
        this.productArrayList = new ArrayList<>();
        this.buildProductList();
        this.serviceArrayList = new ArrayList<>();
        this.buildServiceList();
    }

    /**
     * Gets a product using its ID
     * @param id
     * @return product
     */
    public Product getProduct(String id){
        for (Product product: productArrayList) {
            if(Objects.equals(product.getId(), id)){
                return product;
            }
        }
        return null;
    }

    /**
     * Gets the Service using its ID
     * @param id
     * @return Service
     */
    public Service getService(String id){
        for (Service service : serviceArrayList){
            if (Objects.equals(service.getId(), id)) {
                return service;
            }
        }
        return null;
    }

    /**
     * Gets the Product list
     * @return product list
     */
    public List<Product> getProductList(){
        return productArrayList;
    }

    /**
     * Gets the Service list
     * @return service list
     */
    public List<Service> getServiceList(){
        return serviceArrayList;
    }

    /**
     * This builds the product list
     */
    private void buildProductList(){
        productArrayList.add(new Product("CP001", "Intel Pentium III Processor", 120));
        productArrayList.add(new Product("MB002", "ASUS P3B Motherboard", 150.0));
        productArrayList.add(new Product("HD003", "Seagate Barracuda 20GB HDD", 100.0));
        productArrayList.add(new Product("RM004", "Kingston ValueRAM 128MB SDRAM", 30.0));
        productArrayList.add(new Product("VC005", "ATI Rage 128 Pro Graphics Card", 70.0));
        productArrayList.add(new Product("CD006", "Sony CD-RW Drive", 45.0));
        productArrayList.add(new Product("PS007", "Generic 350W Power Supply", 35.0));
        productArrayList.add(new Product("CS008", "Creative Sound Blaster Live! Sound Card", 50.0));
        productArrayList.add(new Product("MN009", "Dell 17-inch CRT Monitor", 80.0));
        productArrayList.add(new Product("KY010", "Logitech PS/2 Keyboard", 20.0));
        productArrayList.add(new Product("MS011", "Microsoft Intellimouse", 15.0));
        productArrayList.add(new Product("FN012", "Case Fan 80mm", 10.0));
        productArrayList.add(new Product("FN013", "Large metal case", 70.0));
    }

    /**
     * This builds the service list
     */
    private void buildServiceList(){
        serviceArrayList.add(new Service(Service.Services.DEFRAGMENT_HARD_DRIVE));
        serviceArrayList.add(new Service(Service.Services.GENERAL_REPAIR));
        serviceArrayList.add(new Service(Service.Services.COMPUTER_ASSEMBLE));
    }

    /**
     * This prints the product list
     */
    public void printProducts() {
        System.out.println(ANSI_YELLOW + "Retro Computers Products Catalog\n" + ANSI_RESET);
        for (Product product : productArrayList) {
            System.out.println(ANSI_BLUE + "Product ID: " + ANSI_RED + product.getId());
            System.out.println(ANSI_BLUE + "Description: " + ANSI_RED +  product.getDescription());
            System.out.println(ANSI_BLUE + "Price: $" + ANSI_RED +  product.getPrice());
            System.out.println(ANSI_WHITE + "--------------------------" + ANSI_RESET);
        }
    }

    /**
     * This prints the services list
     */
    public void printServices() {
        System.out.println("\u001B[33m" + "Retro Computers Services Catalog\n" + "\u001B[34m");
        for (Service service : serviceArrayList) {
            System.out.println(ANSI_BLUE + "Service ID: " + ANSI_RED +  service.getId());
            System.out.println(ANSI_BLUE + "Description: " + ANSI_RED +  service.getDescription());
            System.out.println(ANSI_BLUE + "Price: $" + ANSI_RED +  service.getPrice());
            System.out.println(ANSI_WHITE +  "--------------------------" + ANSI_RESET);
        }
    }
}

