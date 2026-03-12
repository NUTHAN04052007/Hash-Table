import java.util.HashMap;

public class FlashSaleInventoryManager {

    public static void main(String[] args) {

        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Laptop", 5);
        inventory.put("Phone", 10);
        inventory.put("Headphones", 3);

        String product = "Laptop";

        if (inventory.containsKey(product)) {

            int stock = inventory.get(product);

            if (stock > 0) {

                inventory.put(product, stock - 1);

                System.out.println(product + " purchased successfully!");
                System.out.println("Remaining stock: " + inventory.get(product));

            } else {

                System.out.println(product + " is out of stock!");

            }

        } else {

            System.out.println("Product not found");

        }
    }
}