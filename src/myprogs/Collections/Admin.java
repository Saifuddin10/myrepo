package myprogs.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Restaurant {
    public void addItems(String menuItems, Double prices, Integer ratings, Integer itemCount) {
        this.menuItems.add(menuItems);
        this.prices.add(prices);
        this.ratings.add(ratings);
        this.itemCount.add(itemCount);
    }

    //Admin Related
    public void removeItems(String item) {
        int index = menuItems.indexOf(item);
        if (index >= 0) {
            this.menuItems.remove(index);
            this.prices.remove(index);
            this.ratings.remove(index);
            this.itemCount.remove(index);
        }
    }

    //user related
    public void removeItemsFromOrder(List<String> orderedItems, List<Double> orderedItemPrices,
                                     List<Integer> orderedItemRatings, List<Integer> orderedItemCount, String removeItem) {
        int index = orderedItems.indexOf(removeItem);
        if (index >= 0) {
            orderedItems.remove(index);
            orderedItemPrices.remove(index);
            orderedItemRatings.remove(index);
            orderedItemCount.remove(index);
        }
    }

    public void itemsLIst(List<String> menuItems, List<Double> prices,
                          List<Integer> ratings, List<Integer> itemCount) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " : " + prices.get(i) + " Rs : "
                    + ratings.get(i) + " star : " + itemCount.get(i) + " items");
        }
    }

    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items you are going to add : ");
        int no = sc.nextInt();
        sc.nextLine();
        //admin adding items in restaurant
        for (int i = 0; i < no; i++) {
            System.out.println("Enter your item " + (i + 1) + " details");
            System.out.println("Enter the Item name : ");
            String menuItem = sc.nextLine();
            System.out.println("Enter the price : ");
            double price = sc.nextDouble();
            System.out.println("Enter the rating : ");
            int ratings = sc.nextInt();
            System.out.println("Entre the item count : ");
            int itemCount = sc.nextInt();
            sc.nextLine();
            admin.addItems(menuItem, price, ratings, itemCount);
        }
//        System.out.println("Enter the item you want to remove : ");
//        String removeItems = sc.nextLine();
//        admin.removeItems(removeItems);
        admin.itemsLIst(admin.menuItems, admin.prices, admin.ratings, admin.itemCount);
        System.out.println("How many items you want to order : ");
        int orderCount = sc.nextInt();
        sc.nextLine();
        List<String> mItems = new ArrayList<>();
        List<Integer> givenRating = new ArrayList<>();
        List<Double> givenPrices = new ArrayList<>();
        List<Integer> givenItemCount = new ArrayList<>();
        while (orderCount > admin.menuItems.size()){
            System.out.println("Please Enter valid order count : ");
            orderCount = sc.nextInt();
            sc.nextLine();
        }
//        if (orderCount > admin.menuItems.size()) {
//            System.out.println("Please Enter valid order count : ");
//            orderCount = sc.nextInt();
//            sc.nextLine();
//        }
        // user giving order
        for (int i = 0; i < orderCount; i++) {
            System.out.println("Please choose Item : " + (i + 1));
            String givenItem = sc.nextLine();
            mItems.add(givenItem);
            int index = admin.menuItems.indexOf(givenItem);
            givenRating.add(admin.ratings.get(index));
            givenPrices.add(admin.prices.get(index));
            givenItemCount.add(admin.itemCount.get(index));
        }
        System.out.println("Your order details are : ");
        admin.itemsLIst(mItems, givenPrices, givenRating, givenItemCount);
        System.out.println("Do you want to cancel any order");
        System.out.println("If yes enter cancel, No enter continue");
        String confirmation = sc.nextLine();
        if (confirmation.equalsIgnoreCase("cancel")) {
            System.out.println("Enter Item name to cancel : ");
            String itemName = sc.nextLine();
            admin.removeItemsFromOrder(mItems, givenPrices, givenRating, givenItemCount, itemName);
        }
        System.out.println("After cancelling, your order details are : ");
        admin.itemsLIst(mItems, givenPrices, givenRating, givenItemCount);
        int totalOrderAmount = generateOrderAmount(mItems, givenPrices, givenItemCount);
        System.out.println("Your order amount : " + totalOrderAmount + "Rs.");
    }

    private static int generateOrderAmount(List<String> mItems, List<Double> givenPrices, List<Integer> givenItemCount) {
        int totalAmount = 0;
        double discountAmount = 0;
        for (int i = 0; i < mItems.size(); i++) {
            totalAmount += (int) (givenItemCount.get(i) * givenPrices.get(i));
        }
        if (totalAmount > 100) {
            discountAmount = totalAmount * (0.02);
            totalAmount = (int) (totalAmount - discountAmount);
        }
        return totalAmount;
    }
}