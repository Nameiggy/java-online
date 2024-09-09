package enums;

public enum DayWeek {
    MONDAY("Понедельник"), TUESDAY("Вторник"),WEDNESDAY("Среда"),
    THURSDAY("Четверг"),FRIDAY("Пятница"),SATURDAY("Суббота"),SUNDAY("Воскресенье");

    private final String translation;

    DayWeek (String translation){
        this.translation=translation;
    }

    @Override
    public String toString() {
        return "DayWeek{" + this.name() +
                "translation='" + translation + '\'' +
                '}';
    }
}
