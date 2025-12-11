public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void printInfo() {
        System.out.println(" Product name: " + name + " price; " + price + " Quantity; " + quantity);
    }

    public void comparePrice(Product other) {
        if (this.price > other.price) {
            System.out.println(this.name + " is more expensive than " + other.name);
        } else if (this.price < other.price) {
            System.out.println(this.name + " is cheaper than " + other.name);
        } else {
            System.out.println(this.name + " and " + other.name + " have the same price ");
        }
    }
}
