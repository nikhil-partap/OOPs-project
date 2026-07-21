public class FoodItem {

    int itemId;
    String itemName;
    double price;

    static String cafeteriaName = "UCampus Cafeteria";
    static double serviceCharge = 10.0;
    static int totalFoodItems = 0;

    void addFoodItem(int id, String name, double price) {
        this.itemId = id;
        this.itemName = name;
        this.price = price;
        totalFoodItems++;
    }

    double calculateFinalPrice() {
        return price + (price * serviceCharge / 100);
    }

    void displayItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Item Name: " + itemName);
        System.out.println("Original Price: " + price);
        System.out.println("Final Price: " + calculateFinalPrice());
    }

    static void changeServiceCharge(double newCharge) {
        serviceCharge = newCharge;
    }

    static void displayCafeteriaDetails() {
        System.out.println("Cafeteria Name: " + cafeteriaName);
        System.out.println("Current Service Charge: " + serviceCharge);
        System.out.println("Total Food Items: " + totalFoodItems);
    }

    public static void main(String[] args) {
        FoodItem item1 = new FoodItem();
        FoodItem item2 = new FoodItem();
        FoodItem item3 = new FoodItem();

        item1.addFoodItem(101, "Veg Sandwich", 80);
        item2.addFoodItem(102, "Cold Coffee", 120);
        item3.addFoodItem(103, "Paneer Wrap", 150);

        FoodItem.displayCafeteriaDetails();
        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();

        FoodItem.changeServiceCharge(15);
        System.out.println("After Updating Service Charge");
        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();
    }
}
