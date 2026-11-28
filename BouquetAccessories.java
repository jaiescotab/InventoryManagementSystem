package Java.InventoryManagementSystem;

public class BouquetAccessories extends Product {
    private String accessorySpec; // e.g., "2m Warm LED", "Ferrero 8-pc Box", "6-inch Mini Bear"

    public BouquetAccessories(String id, String name, double unitPrice, int quantity, int reorderLevel, String accessorySpec) {
        super(id, name, unitPrice, quantity, reorderLevel);
        setAccessorySpec(accessorySpec);
    }

    public String getAccessorySpec() {
        return accessorySpec;
    }

    public void setAccessorySpec(String accessorySpec) {
        if (accessorySpec == null || accessorySpec.trim().isEmpty()) {
            throw new IllegalArgumentException("Accessory specification cannot be empty.");
        }
        this.accessorySpec = accessorySpec.trim();
    }

    @Override
    public String getCategoryName() {
        return "BouquetAccessories";
    }

    @Override
    public String getCategoryDetails() {
        return "Spec: " + accessorySpec;
    }

    @Override
    public String getHandlingWarning() {
        return "Store add-ons in a cool, dry bin away from water buckets.";
    }

    @Override
    public String getCategoryFieldPrompt() {
        return "New Accessory Spec (e.g., 2m Warm LED / 6-inch Bear): ";
    }

    @Override
    public void updateCategoryField(String newValue) {
        setAccessorySpec(newValue);
    }
}
