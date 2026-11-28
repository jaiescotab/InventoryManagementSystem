package Java.InventoryManagementSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StockTransaction {
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private final int sequenceNumber;
    private final String type;
    private final String productId;
    private final int quantity;
    private final String timestamp;

    public StockTransaction(int sequenceNumber, String type, String productId, int quantity) {
        this.sequenceNumber = sequenceNumber;
        this.type = type;
        this.productId = productId;
        this.quantity = quantity;
        this.timestamp = LocalDateTime.now().format(FMT);
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public String getType() {
        return type;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return String.format("#%-4d | %-12s | %-6s | qty: %-4d | %s",
                sequenceNumber, type, productId, quantity, timestamp);
    }
}
