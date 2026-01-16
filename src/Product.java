public class Product extends item {
    private String category;
    private String brand;
    private int quantity;

    public Product(String name, double price, int quantity, String category, String brand) {
        super(name, price);
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
    }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }


    @Override
        public void printInfo() {
            System.out.println("Product: " + getName() +
                    ", Brand: " + brand +
                    ", Category: " + category +
                    ", Price: " + getPrice() +
                    ", Quantity: " + quantity);
        }

        public void comparePrice(Product other) {
        if (getPrice() > other.getPrice()) {
            System.out.println(getName() + " is more expensive than " + other.getName());
        } else if (getPrice() < other.getPrice()) {
            System.out.println(getName() + " is cheaper than " + other.getName());
        } else {
            System.out.println(getName() + " and " + other.getName() + " have the same price");
        }
    }
}
