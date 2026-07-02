public class Main {

    public static void displayItems(java.util.List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            item.display();
        }
    }

    public static void main(String[] args) {

        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("Laptop"));
        electronics.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceries = new Storage<>();
        groceries.addItem(new Groceries("Rice"));
        groceries.addItem(new Groceries("Sugar"));

        Storage<Furniture> furniture = new Storage<>();
        furniture.addItem(new Furniture("Chair"));
        furniture.addItem(new Furniture("Table"));

        displayItems(electronics.getItems());
        displayItems(groceries.getItems());
        displayItems(furniture.getItems());
    }
}