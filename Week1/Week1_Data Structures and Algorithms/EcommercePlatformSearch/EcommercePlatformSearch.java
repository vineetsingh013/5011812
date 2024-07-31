public class EcommercePlatformSearch {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics"),
                new Product("P003", "Tablet", "Electronics"),
                new Product("P004", "Headphones", "Accessories"),
                new Product("P005", "Keyboard", "Accessories")
        };

        // Linear Search
        String searchName = "Tablet";
        Product result = LinearSearch.linearSearch(products, searchName);
        System.out.println("Linear Search Result: " + (result != null ? result : "Product not found"));

        // Binary Search
        result = BinarySearch.binarySearch(products, searchName);
        System.out.println("Binary Search Result: " + (result != null ? result : "Product not found"));
    }
}
