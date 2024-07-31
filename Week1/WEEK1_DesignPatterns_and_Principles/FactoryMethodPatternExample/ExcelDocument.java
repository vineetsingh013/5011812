public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening the  Excel document");
    }

    @Override
    public void save() {
        System.out.println("Saving the Excel document");
    }

    @Override
    public void close() {
        System.out.println("Closing the Excel document");
    }
}
