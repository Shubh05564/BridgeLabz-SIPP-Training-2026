    class Groceries extends WarehouseItem {

        Groceries(String name) {
            super(name);
        }

        @Override
        public void display() {
            System.out.println("Groceries: " + name);
        }
    }