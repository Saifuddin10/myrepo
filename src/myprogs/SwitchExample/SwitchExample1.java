package myprogs.SwitchExample;

public class SwitchExample1 {
    public static void main(String[] args) {
        int day = 7;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Today is Monday";
                break;
            case 2:
                dayName = "Today is Tuesday";
                break;
            case 3:
                dayName = "Today is Wednesday";
                break;
            case 4:
                dayName = "Today is Thursday";
                break;
            case 5:
                dayName = "Today is Friday";
                break;
            case 6:
                dayName = "Today is Saturday";
                break;
            case 7:
                dayName = "Today is Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println(dayName);

    }
}
