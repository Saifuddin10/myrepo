package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Restaurant {
    public void addItems(String menuItems, Double price, Integer ratings, Integer itemCount) {
        this.menuItems.add(menuItems);
        this.prices.add(price);
        this.ratings.add(ratings);
        this.itemCount.add(itemCount);
    }

    public void itemsLIst(ArrayList<String> menuItems, ArrayList<Double> prices,
                          ArrayList<Integer> ratings, ArrayList<Integer> itemCount) {
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
        for (int i = 0; i < no; i++) {
            System.out.println("Enter your item " + (i+1) + " details");
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
        admin.itemsLIst(admin.menuItems, admin.prices, admin.ratings, admin.itemCount);
    }
}

