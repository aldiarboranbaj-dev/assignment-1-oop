import java.util.Scanner; // ← обязательно

public class Main {
    public static void main(String[] args) {
        Supplier supplier = new Supplier("TechSupplies", "+7777777777");

        Product product1 = new Product("Mouse", 13000, 20, "Mouse", "Logitech g102");
        Product product2 = new Product("Mouse", 84000, 15, "Mouse", "Logitech superlight 2");
        Product product3 = new Product("Headphones", 35000, 10, "Headphones", "Sony");
        Product product4 = new Product("Headphones", 26000, 8, "Headphones", "razer barracuda");
        Product product5 = new Product("Laptop", 350000, 5, "Laptop", "HP");
        Product product6 = new Product("Keyboard", 25000, 10, "Keyboard", "Logitech");
        Inventory inventory = new Inventory(supplier);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.addProduct(product4);
        inventory.addProduct(product5);
        inventory.addProduct(product6);

        inventory.printInventory();

        System.out.println("\n--- Price comprasion ---");
        product1.comparePrice(product2);
        product2.comparePrice(product3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name to search:");
        String searchName = scanner.nextLine();
        inventory.searchByName(searchName);

        System.out.println("Sort inventory by price ascending? (yes/no):");
        String sort = scanner.nextLine();
        inventory.sortByPrice(sort.equalsIgnoreCase("yes"));
        inventory.printInventory();
        // ---------- DATABASE CRUD DEMO ----------
        System.out.println("\n--- DATABASE CRUD ---");

        // CREATE (INSERT)
        InventoryDB.addProduct(product1);
        InventoryDB.addProduct(product2);

        // READ (SELECT)
        System.out.println("\n--- Products from DB ---");
        for (Product p : InventoryDB.getAllProducts()) {
            p.printInfo();
        }

        // UPDATE
        InventoryDB.updateProductPrice(1, 9999);

        // DELETE
        InventoryDB.deleteProduct(2);

    }
}