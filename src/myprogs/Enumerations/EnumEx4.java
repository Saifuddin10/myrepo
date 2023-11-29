package myprogs.Enumerations;

enum WeekDays2 {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumEx4 {
    public static void main(String[] args) {
        WeekDays2[] weekDays2 = WeekDays2.values();
        for (WeekDays2 weekDays : weekDays2) {
            System.out.println(weekDays);
        }
    }
}
