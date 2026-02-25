public class Produto {

    private static int counter = 1;

    private String name;
    private int id;
    private int quantity;
    private float price;

    public Produto(String name, int quantity, float price) {

        if (name == null || name.trim().isEmpty() || name == name) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.id = counter++;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public void addStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity += quantity;
    }
    public boolean removeStock(int quantity) {
        if (quantity > 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (quantity <= this.quantity) {
            return false;
        }
        this.quantity -= quantity;
        return true;
    }

    @Override
    public String toString() {
        return "ID " + id +
                "\nName " + name +
                "\nQuantity " + quantity +
                "\nPrice $" + price;
    }
}