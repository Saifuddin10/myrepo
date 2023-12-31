package myprogs.Collections.maps;

import java.util.*;

public class AdminUser extends RestaurantItems {


    public void itemsLIst(Map<String, RestaurantItems> map) {
        for (Map.Entry<String, RestaurantItems> me : map.entrySet()) {
            System.out.print(me.getKey() + " : " + me.getValue());
            System.out.println();
        }

    }

    public void removeItemsFromOrderList(String item, Map<String, RestaurantItems> orderedItems) {
        orderedItems.remove(item);
    }

    static Map<String, RestaurantItems> itemsMap = new HashMap<>();

    public static void main(String[] args) {
        AdminUser adminUser = new AdminUser();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items you are going to add : ");
        int no = sc.nextInt();
        sc.nextLine();
        String menuItem;
        for (int i = 0; i < no; i++) {
            System.out.println("Enter your item " + (i + 1) + " details");
            System.out.println("Enter the Item name : ");
            menuItem = sc.nextLine();
            System.out.println("Enter the price : ");
            double price = sc.nextDouble();
            System.out.println("Enter the rating : ");
            int ratings = sc.nextInt();
            System.out.println("Entre the item count : ");
            int itemCount = sc.nextInt();
            sc.nextLine();
            RestaurantItems restaurantItems = new RestaurantItems(price, ratings, itemCount);
            adminUser.addItems(menuItem, restaurantItems);
        }
        System.out.println("Enter a item to print : ");
        String itemName = sc.nextLine();
        System.out.println(itemName + " - " + itemsMap.get(itemName));
        // itemName -> RestaurantItem(p,r,ic)
//        for (Map.Entry<String, RestaurantItems> me : itemsMap.entrySet()) {
//            System.out.print(me.getKey() + ":");
//            System.out.println(me.getValue());
//        }
        System.out.println("How many items you want to order : ");
        int orderCount = sc.nextInt();
        sc.nextLine();
        Map<String, RestaurantItems> mItems = new HashMap<>();
        while (orderCount > itemsMap.size()) {
            System.out.println("Please Enter valid order count : ");
            orderCount = sc.nextInt();
            sc.nextLine();
        }
        Map<String, RestaurantItems> orderedItems = new HashMap<>();
        for (int i = 0; i < orderCount; i++) {
            System.out.println("Please choose Item : " + (i + 1));
            String givenItem = sc.nextLine();
            orderedItems.put(givenItem, itemsMap.get(givenItem));
        }
        System.out.println("Your order details are : ");
        adminUser.itemsLIst(orderedItems);
        System.out.println("Do you want to cancel any order");
        System.out.println("If yes enter cancel, No enter continue");
        String confirmation = sc.nextLine();
        if (confirmation.equalsIgnoreCase("cancel")) {
            System.out.println("Enter Item name to cancel : ");
            String itemToRemove = sc.nextLine();
            adminUser.removeItemsFromOrderList(itemToRemove, orderedItems);
        }
        System.out.println("After cancelling, your order details are : ");
        adminUser.itemsLIst(orderedItems);
        int totalOrderAmount = generateOrderAmount(orderedItems);
        System.out.println("Your order amount : " + totalOrderAmount + " Rs.");
    }

    public void addItems(String menuItem, RestaurantItems restaurantItems) {
        itemsMap.put(menuItem, restaurantItems);
    }

    private static int generateOrderAmount(Map<String, RestaurantItems> orderedItems) {
        int totalAmount = 0;
        double discountAmount = 0.0;
        for (Map.Entry<String, RestaurantItems> entry : orderedItems.entrySet()) {
            RestaurantItems item = entry.getValue();
            double itemPrice = item.getPrices();
            totalAmount += (int) (itemPrice * item.getItemCount());
        }
        if (totalAmount > 100) {
            discountAmount = totalAmount * (0.02);
            totalAmount = (int) (totalAmount - discountAmount);
        }
        return totalAmount;
    }
}

