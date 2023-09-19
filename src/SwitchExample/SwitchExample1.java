package SwitchExample;

public class SwitchExample1 {
    public static void main(String[] args) {
        int day =5;
        String dayname;
        switch (day){
            case 1:
                dayname = "Today is Monday";
                break;
            case 2:
                dayname = "Today is Tuesday";
                break;
            case 3:
                dayname = "Today is Wednesday";
                break;
            case 4:
                dayname = "Today is Thursday";
                break;
            case 5:
                dayname = "Today is Friday";
                break;
            case 6:
                dayname = "Today is Saturday";
                break;
            case 7:
                dayname = "Today is Sunday";
                break;
            default:
            case 8:
                dayname = "Invalid day";
                break;
        }
        System.out.println(dayname);

    }
}
