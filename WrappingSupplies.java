package Java.InventoryManagementSystem;

public class WrappingSupplies extends Product {

    // Category-Specific Fields
    private String wrapType;
    private String color;

    // Constructor
    public WrappingSupplies(String id, String name, double unitPrice, int quantity, int reorderLevel,
                            String wrapType, String color) {
        super(id, name, unitPrice, quantity, reorderLevel);
        setWrapType(wrapType);
        setColor(color);
    }

    // Getters
    public String getWrapType() {
        return wrapType;
    }

    // Setters
    public void setWrapType(String wrapType) {
        if (wrapType != null && !wrapType.trim().isEmpty()) {
            this.wrapType = wrapType.trim();
        } else {
            throw new IllegalArgumentException("Wrap type cannot be null or blank.");
        }
    }

    public void setColor(String color) {
        if (color != null && !color.trim().isEmpty()) {
            this.color = color.trim();
        } else {
            throw new IllegalArgumentException("Color cannot be null or blank.");
        }
    }

    // Override Abstract Method 1
    @Override
    public String getProductVariant() {
        return wrapType;
    }

    // Override Abstract Method 2
    @Override
    public String getProductColor() {
        return color;
    }

    // Additional Polymorphic Methods
    @Override
    public double calculateHandlingCost(int units) {
        return units * 0.50;
    }

    @Override
    public int getExtraFieldCount() {
        return 2;
    }

    @Override
    public String getExtraFieldPrompt(int fieldIndex) {
        if (fieldIndex == 0) {
            return "New wrap style (Matte/Satin/Kraft) [" + wrapType + "]: ";
        }
        return "New color [" + color + "]: ";
    }

    @Override
    public void setExtraFieldValue(int fieldIndex, String rawValue) {
        if (fieldIndex == 0) {
            setWrapType(rawValue);
        } else {
            setColor(rawValue);
        }
    }
}
