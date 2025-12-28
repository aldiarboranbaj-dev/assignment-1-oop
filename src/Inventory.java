import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    private Supplier supplier;
    private List<Product> products = new ArrayList<>();

    public Inventory(Supplier supplier) {
        this.supplier = supplier;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void printInventory() {
        System.out.println("\n--- Inventory ---");
        supplier.printInfo();
        for (Product p : products) p.printInfo();
    }

    public void searchByName(String name) {
        List<Product> result = products.stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
        if (result.isEmpty()) System.out.println("No products found with name: " + name);
        else result.forEach(Product::printInfo);
    }

    public void sortByPrice(boolean ascending) {
        products.sort(ascending ? Comparator.comparingDouble(Product::getPrice)
                : Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
