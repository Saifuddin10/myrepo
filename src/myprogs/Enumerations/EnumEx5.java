package myprogs.Enumerations;

enum Restaurant {
    DOMINOS, KFC, PIZZAHUT, PANINOS, BURGERKING
}

public class EnumEx5 {
    public static void main(String[] args) {
        Restaurants r;
        System.out.println("All constants of enum type Restaurants are:");
        Restaurants rArray[] = Restaurants.values(); //returns an array of constants of type Restaurants
        for (Restaurants a : rArray) //using foreach loop
            System.out.println(a);

        r = Restaurants.valueOf("DOMINOS");
        System.out.println("It is " + r);
    }
}

