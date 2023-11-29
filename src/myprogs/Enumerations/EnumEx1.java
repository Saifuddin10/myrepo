package myprogs.Enumerations;


enum WeekDays{
    SUNDAY, Monday, Tuesday, Wednesday, Thursday, Friday, SATURDAY
}

public class EnumEx1 {
    public static void main(String[] args) {
       WeekDays wk;
       wk = WeekDays.Monday;
        System.out.println("Today is " + wk);
    }
}
