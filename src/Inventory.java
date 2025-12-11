import java.util.ArrayList;
public class Inventory {
    private Supplier supplier;
    private ArrayList<Product> products = new ArrayList<>();

    public Inventory(Supplier supplier) {
        this.supplier = supplier;
    }

    public void addProduct(Product p) {
        products.add(p);
    }
    public void printInventory() {
        System.out.println("\n--- Inventory ---");
        supplier.printInfo();

        for (Product p : products) {
            p.printInfo();
        }
    }

}
