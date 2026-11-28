package Java.InventoryManagementSystem;

import java.util.ArrayList;

public class InventoryManager {

    private ArrayList<Product> products;

    public InventoryManager() {

        products = new ArrayList<>();

    }

    public ArrayList<Product> getProducts() {

        return new ArrayList<>(products);

    }

    public Product findProductById(String id) {

        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException(
                    "Product ID cannot be empty."
            );
        }

        for (Product product : products) {

            if (product.getId().equalsIgnoreCase(id)) {
                return product;
            }

        }

        return null;
    }

    public ArrayList<Product> searchProductsByName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Product name cannot be empty."
            );
        }

        ArrayList<Product> searchResults =
                new ArrayList<>();

        for (Product product : products) {

            if (product.getName()
                    .toLowerCase()
                    .contains(name.toLowerCase())) {

                searchResults.add(product);

            }

        }

        return searchResults;
    }

    public void addProduct(Product product) {

        if (product == null) {
            throw new IllegalArgumentException(
                    "Product cannot be null."
            );
        }

        if (findProductById(product.getId()) != null) {
            throw new IllegalArgumentException(
                    "Product ID already exists."
            );
        }

        products.add(product);

    }

    public boolean updateProduct(
            String id,
            Product updatedProduct) {

        if (updatedProduct == null) {
            throw new IllegalArgumentException(
                    "Updated product cannot be null."
            );
        }

        Product existingProduct =
                findProductById(id);

        if (existingProduct != null) {

            int index =
                    products.indexOf(existingProduct);

            products.set(index, updatedProduct);

            return true;
        }

        return false;
    }

    public void viewProducts() {

        if (products.isEmpty()) {

            System.out.println(
                    "No products found."
            );

            return;
        }

        for (Product product : products) {

            System.out.println(
                    "ID: " + product.getId()
                    + " | Name: " + product.getName()
                    + " | Variant: " + product.getProductVariant()
                    + " | Color: " + product.getProductColor()
                    + " | Quantity: " + product.getQuantity()
                    + " | Price: " + product.getUnitPrice()
            );

        }
    }
}

    // Delete Product

    // Stock In

    // Stock Out

    // Low-stock alerts

    // Sort Products

    // Summary Report

    // Transaction History

    // Recursive Method

    // Preloaded Sample Data

}