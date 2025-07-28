package EnumDayOfWeek;

public class EnumDayOfWeek {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            printDayType(day);
        }
    }

    public static void printDayType(DayOfWeek day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println(day + " holiday");
                break;
            default:
                System.out.println(day + " working day");
                break;
        }
    }

    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
