import java.util.HashMap;
import java.util.Map;

class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;

    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [ID=" + productId + ", Name=\"" + productName 
                + "\", Category=\"" + category + "\", Price=$" + price + "]";
    }
}

class ProductInventory {
    private Map<Integer, Product> productMap = new HashMap<>();

    public boolean addProduct(Product product) {
        if (productMap.containsKey(product.getProductId())) {
            System.out.println("Error: Product ID " + product.getProductId() + " already exists!");
            return false;
        }
        productMap.put(product.getProductId(), product);
        System.out.println("Added: " + product.getProductName());
        return true;
    }

    public Product searchProduct(int productId) {
        return productMap.get(productId);
    }

    public boolean removeProduct(int productId) {
        Product removed = productMap.remove(productId);
        if (removed != null) {
            System.out.println("Successfully removed: " + removed.getProductName());
            return true;
        } else {
            System.out.println("Product ID " + productId + " not found to remove.");
            return false;
        }
    }

    public void displayAllProducts() {
        if (productMap.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\n--- Current Inventory (HashMap) ---");
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            System.out.println("Key [" + entry.getKey() + "] -> " + entry.getValue());
        }
    }
}

public class Que8 {
	public static void main(String[] args) {
        ProductInventory inventory = new ProductInventory();

        inventory.addProduct(new Product(101, "Wireless Mouse", "Electronics", 29.99));
        inventory.addProduct(new Product(102, "Mechanical Keyboard", "Electronics", 89.50));
        inventory.addProduct(new Product(103, "Office Chair", "Furniture", 199.00));

        inventory.addProduct(new Product(101, "Gaming Mouse", "Electronics", 49.99));

        inventory.displayAllProducts();

        System.out.println("\n--- Searching for Product ID 102 ---");
        Product p = inventory.searchProduct(102);
        if (p != null) {
            System.out.println("Found: " + p);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\n--- Removing Product ID 101 ---");
        inventory.removeProduct(101);

        inventory.displayAllProducts();
    }
}