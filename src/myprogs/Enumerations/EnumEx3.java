package myprogs.Enumerations;

enum WeekDays1 {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumEx3 {
    public static void main(String[] args) {
        WeekDays1 weekDays = WeekDays1.SATURDAY;
        if (weekDays == WeekDays1.SUNDAY || weekDays == WeekDays1.SATURDAY) {
            System.out.println("It is WeekEnd");
        } else {
            System.out.println("It is Weekday " + weekDays);
        }
    }
}
