public class Main {
    public static void main(String[] args) {
        Supplier supplier = new Supplier("TechSupplies", "+7777777777");

        Product product1 = new Product("Laptop", 35000, 5);
        Product product2 = new Product("Mouse", 3000, 20);
        Product product3 = new Product("Keyboard", 10000, 10);

        Inventory inventory = new Inventory(supplier);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        inventory.printInventory();

        System.out.println("\n--- Price comprasion ---");
        product1.comparePrice(product2);
        product2.comparePrice(product3);
    }
}