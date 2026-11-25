package Java.InventoryManagementSystem;

public abstract class Product {

 // Encapsulation
    private String id;
    private String name;
    private double unitPrice;
    private int quantity;
    private int reorderLevel;

// Constructor
public Product(String id, String name, double unitPrice, int quantity, int reorderLevel) {
    this.id = id;
    this.name = name;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
    this.reorderLevel = reorderLevel;
}

// Getters
public String getId() {
    return id;
}

public String getName() {
    return name;
}

public double getUnitPrice() {
    return unitPrice;
}

public int getQuantity() {
    return quantity;
}

public int getReorderLevel() {
    return reorderLevel;
}

// Setters
public void setId(String id) {
    this.id = id;
}

// Validation

// Abstraction
public abstract String abstractMethod1();
public abstract String abstractMethod2();
}
