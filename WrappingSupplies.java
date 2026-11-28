package Java.InventoryManagementSystem;
public class WrappingSupplies extends Product {

    private String wrapType;
    private String wrapColor;

    public WrappingSupplies(String id, String name, double unitPrice, int quantity, int reorderLevel,
                            String wrapType, String wrapColor) {
        super(id, name, unitPrice, quantity, reorderLevel);
        setWrapType(wrapType);
        setWrapColor(wrapColor);
    }

    public String getWrapType() {
        return wrapType;
    }

    public void setWrapType(String wrapType) {
        if (wrapType != null && !wrapType.isBlank()) {
            this.wrapType = wrapType.trim();
        } else {
            throw new IllegalArgumentException("Wrap type cannot be null or blank.");
        }
    }

    public String getWrapColor() {
        return wrapColor;
    }

    public void setWrapColor(String wrapColor) {
        if (wrapColor != null && !wrapColor.isBlank()) {
            this.wrapColor = wrapColor.trim();
        } else {
            throw new IllegalArgumentException("Wrap color cannot be null or blank.");
        }
    }

    @Override
    public String getProductVariant() {
        return wrapType;
    }

    @Override
    public String getProductColor() {
        return wrapColor;
    }
}