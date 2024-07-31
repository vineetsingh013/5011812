public class OrderSorting {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O001", "Alice", 300.50),
                new Order("O002", "Bob", 150.75),
                new Order("O003", "Charlie", 500.25),
                new Order("O004", "David", 450.00),
                new Order("O005", "Eve", 200.30)
        };

        Order[] bubbleSortedOrders = orders.clone();
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Orders sorted by Bubble Sort:");
        for (Order order : bubbleSortedOrders) {
            System.out.println(order);
        }

        Order[] quickSortedOrders = orders.clone();
        QuickSort.quickSort(quickSortedOrders, 0, quickSortedOrders.length - 1);
        System.out.println("\nOrders sorted by Quick Sort:");
        for (Order order : quickSortedOrders) {
            System.out.println(order);
        }
    }
}
