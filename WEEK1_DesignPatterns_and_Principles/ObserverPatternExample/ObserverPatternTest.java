public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("MobileApp1");
        Observer mobileApp2 = new MobileApp("MobileApp2");
        Observer webApp1 = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        System.out.println("Setting stock price to 100.0");
        stockMarket.setStockPrice(100.0);

        stockMarket.removeObserver(mobileApp2);

        System.out.println("\nSetting stock price to 200.0");
        stockMarket.setStockPrice(200.0);
    }
}

