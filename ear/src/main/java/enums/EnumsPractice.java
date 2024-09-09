package enums;

@SuppressWarnings("ALL")
public class EnumsPractice {
    public static void main(String[] args) {
        System.out.println("Season.WINTER = " + Season.WINTER);
        System.out.println("Season.valueOf(\"winter\") = " + Season.valueOf("WINTER"));
        Season [] season = Season.values();
        for (Season season1: season){
            System.out.println(season1+" ");
        }
        System.out.println();

        Season season1 =Season.SPRING;
        switch (season1){
            case FALL :
                System.out.println("Y NAS OSEN");
            break;
            case SPRING :
                System.out.println("Y NAS VESNA");
                break;
            default:
                System.out.println("y nas ne vesna ne osen");
        }

        System.out.println("Cofee.AMERICANO = " + Cofee.AMERICANO);


        System.out.println("DayWeek.MONDAY = " + DayWeek.MONDAY);
        System.out.println("DayWeek.TUESDAY = " + DayWeek.TUESDAY);
        System.out.println("DayWeek.WEDNESDAY = " + DayWeek.WEDNESDAY);
        System.out.println("DayWeek.THURSDAY = " + DayWeek.THURSDAY);
        System.out.println("DayWeek.FRIDAY = " + DayWeek.FRIDAY);
        System.out.println("DayWeek.SATURDAY = " + DayWeek.SATURDAY);
        System.out.println("DayWeek.SUNDAY = " + DayWeek.SUNDAY);
    }
}
