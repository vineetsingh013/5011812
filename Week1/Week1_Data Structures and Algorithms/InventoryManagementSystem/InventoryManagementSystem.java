public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        Product product1 = new Product("P001", "Laptop", 10, 1500.00);
        Product product2 = new Product("P002", "Smartphone", 50, 800.00);
        Product product3 = new Product("P003", "Tablet", 30, 600.00);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        product2.setQuantity(45);
        inventory.updateProduct(product2);

        System.out.println("\nInventory after update:");
        inventory.displayInventory();

        inventory.deleteProduct("P001");

        System.out.println("\nInventory after deletion:");
        inventory.displayInventory();
    }
}
