package myprogs.Collections;

import java.util.ArrayList;

public class Restaurant {
    public ArrayList<String> menuItems;
    public ArrayList<Double> prices;
    public ArrayList<Integer> ratings;
    public ArrayList<Integer> itemCount;

    public Restaurant() {
        this.menuItems = new ArrayList<String>();
        this.prices = new ArrayList<Double>();
        this.ratings = new ArrayList<Integer>();
        this.itemCount = new ArrayList<Integer>();
    }

    public Restaurant(ArrayList<String> menuItems, ArrayList<Double> prices,
                      ArrayList<Integer> ratings, ArrayList<Integer> itemCount) {
        this.menuItems = menuItems;
        this.prices = prices;
        this.ratings = ratings;
        this.itemCount = itemCount;
    }
}
