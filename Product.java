public abstract class Product {

    private String id;
    private String name;
    private double unitPrice;
    private int quantity;
    private int reorderLevel;

public Product(String id, String name, double unitPrice, int quantity, int reorderLevel) {
    setId(id);
    setName(name);
    setUnitPrice(unitPrice);
    setQuantity(quantity);
    setReorderLevel(reorderLevel);
}

public String getId() {
    return id;
}
public void setId(String id) {
    if (id != null && !id.isBlank()) {
        this.id = id;
    } else {
        throw new IllegalArgumentException("ID cannot be null or blank.");
    }
}
public String getName() {
    return name;
}
public void setName(String name) {
    if (name != null && !name.isBlank()) {
        this.name = name;
    } else {
        throw new IllegalArgumentException("Name cannot be null or blank.");
    }
}
public double getUnitPrice() {
    return unitPrice;
}
public void setUnitPrice(double unitPrice) {
    if (unitPrice >= 0) {
        this.unitPrice = unitPrice;
    } else {
        throw new IllegalArgumentException("Unit price cannot be negative.");
    }
}
public int getQuantity() {
    return quantity;
}
public void setQuantity(int quantity) {
    if (quantity >= 0) {
        this.quantity = quantity;
    } else {
        throw new IllegalArgumentException("Quantity cannot be negative.");
    }
}

public int getReorderLevel() {
    return reorderLevel;
}
public void setReorderLevel(int reorderLevel) {
    if (reorderLevel >= 0) {
        this.reorderLevel = reorderLevel;
    } else {
        throw new IllegalArgumentException("Reorder level cannot be negative.");
    }
}
// Abstraction
public abstract String getProductVariant();
public abstract String getProductColor();
}
