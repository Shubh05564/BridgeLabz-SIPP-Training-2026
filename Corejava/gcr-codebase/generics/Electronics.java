class Electronics extends WarehouseItem {

    Electronics(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Electronics: " + name);
    }
}