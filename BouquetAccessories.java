package Java.InventoryManagementSystem;

public class BouquetAccessories extends Product {
    
    private String accessoryType;
    private String accessoryColor;

    public BouquetAccessories(String id, String name, double unitPrice, int quantity, int reorderLevel,
                              String accessoryType, String accessoryColor) {
        super(id, name, unitPrice, quantity, reorderLevel);
        setAccessoryType(accessoryType);
        setAccessoryColor(accessoryColor);
    }

    public String getAccessoryType() {
        return accessoryType;
    }

    public void setAccessoryType(String accessoryType) {
        if (accessoryType != null && !accessoryType.isBlank()) {
            this.accessoryType = accessoryType.trim();
        } else {
            throw new IllegalArgumentException("Accessory type cannot be null or blank.");
        }
    }

    public String getAccessoryColor() {
        return accessoryColor;
    }

    public void setAccessoryColor(String accessoryColor) {
        if (accessoryColor != null && !accessoryColor.isBlank()) {
            this.accessoryColor = accessoryColor.trim();
        } else {
            throw new IllegalArgumentException("Accessory color cannot be null or blank.");
        }
    }

    @Override
    public String getProductVariant() {
        return accessoryType;
    }

    @Override
    public String getProductColor() {
        return accessoryColor;
    }
}
