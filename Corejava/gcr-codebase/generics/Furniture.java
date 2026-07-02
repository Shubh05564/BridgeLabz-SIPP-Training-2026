class Furniture extends WarehouseItem {

    Furniture(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Furniture: " + name);
    }
}