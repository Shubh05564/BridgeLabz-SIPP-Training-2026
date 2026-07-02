abstract class WarehouseItem {

    protected String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    public abstract void display();
}