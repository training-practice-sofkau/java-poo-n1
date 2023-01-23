package co.com.sofka.mycalendar.Enums;

public enum Journeys {
    MORNING("Mañana"),
    LATE("Tarde"),
    NIGHT("Noche");

    private final String Journeys;

    Journeys(String Journeys) {
        this.Journeys = Journeys;
    }

    public String getWeekdays() {
        return Journeys;
    }

    @Override
    public String toString() {
        return this.Journeys;
    }
}
