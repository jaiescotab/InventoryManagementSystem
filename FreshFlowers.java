package Java.InventoryManagementSystem;

public class FreshFlowers extends Product{
    
    private String flowerType;
    private String flowerColor;

    public FreshFlowers(String id, String name, double unitPrice, int quantity, int reorderLevel, String flowerType, String flowerColor) {
        super(id, name, unitPrice, quantity, reorderLevel);
        setFlowerType(flowerType);
        setFlowerColor(flowerColor);
    }
    public String getFlowerType() {
        return flowerType;
    }
    public void setFlowerType(String flowerType) {
        if (flowerType != null && !flowerType.isBlank()) {
            this.flowerType = flowerType;
        } else {
            throw new IllegalArgumentException("Flower type cannot be null or blank.");
        }
    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            throw new IllegalArgumentException("Flower color cannot be null or blank.");
        }
    }
    @Override
    public String getProductVariant() {
        return flowerType;
    }
    @Override
    public String getProductColor() {
        return flowerColor;
    }
}
