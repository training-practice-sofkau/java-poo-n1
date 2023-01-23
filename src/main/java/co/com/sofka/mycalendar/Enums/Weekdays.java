package co.com.sofka.mycalendar.Enums;

public enum Weekdays {
    MONDAY("Lunes"),
    TUESDAY("Martes"),
    WEDNESDAY("Miercoles"),
    THURSDAY("Jueves"),
    FRIDAY("Viernes"),
    SATURDAY("Sabado"),
    SUNDAY("Domingo");

    private final String weekdays;

    Weekdays(String weekdays) {
        this.weekdays = weekdays;
    }

    public String getWeekdays() {
        return weekdays;
    }

    @Override
    public String toString() {
        return this.weekdays;
    }
}
