package myprogs.Collections.maps;

import java.util.ArrayList;

public class RestaurantItems {

    private double prices;
    private int ratings;
    private int itemCount;


    public RestaurantItems(double prices, int ratings, int itemCount) {
        this.prices = prices;
        this.ratings = ratings;
        this.itemCount = itemCount;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public RestaurantItems() {
    }

    @Override
    public String toString() {
        return " prices : " + prices + " Rs. -" +
                " ratings : " + ratings + " - Star -" +
                " itemCount : " + itemCount ;
    }
}
