public class ProductInventorySystem {
    private String name;
    private double price;
    private int quantity;

    // Default constructor
    ProductInventorySystem() {
        this.name = "Unknown";
        this.price = 1.0;
        this.quantity = 0;
    }

    // 2-arg constructor
    ProductInventorySystem(String name, double price) {
        this.name = name;
        setPrice(price);      // Use setter for validation
        this.quantity = 0;
    }

    // 3-arg constructor
    ProductInventorySystem(String name, double price, int quantity) {
        this.name = name;
        setPrice(price);      // use setters for logic reuse
        setQuantity(quantity);
    }

    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Setters with validation
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 1) {
            System.out.println("Invalid price, setting to ₹1.0");
            this.price = 1.0;
        } else {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Invalid quantity, setting to 0");
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    void viewDetails() {
        System.out.println("\n<---- Inventory Details ---->");
        System.out.println("Product Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    // main method for testing
    public static void main(String[] args) {
        ProductInventorySystem p1 = new ProductInventorySystem();
        ProductInventorySystem p2 = new ProductInventor	ySystem("Laptop", 0);         // triggers price validation
        ProductInventorySystem p3 = new ProductInventorySystem("TV", 30000, -4);     // triggers quantity validation

        p1.viewDetails();
        p2.viewDetails();
        p3.viewDetails();
    }
}
