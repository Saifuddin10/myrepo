package myprogs.Enumerations;

enum Restaurants {
    DOMINOS, KFC, PIZZAHUT, BURGRRKING, PANINOS
}

public class EnumEx2 {
    public static void main(String[] args) {
        Restaurants rs;
        rs = Restaurants.DOMINOS;
        switch (rs) {
            case DOMINOS:
                System.out.println("I Am " + rs.DOMINOS);
                break;
            case KFC:
                System.out.println("I Am " + rs.KFC);
                break;
            case PIZZAHUT:
                System.out.println("I Am " + rs.PIZZAHUT);
                break;
            case BURGRRKING:
                System.out.println("I Am " + rs.BURGRRKING);
                break;
            case PANINOS:
                System.out.println("I Am " + rs.PANINOS);
                break;
        }
    }
}
