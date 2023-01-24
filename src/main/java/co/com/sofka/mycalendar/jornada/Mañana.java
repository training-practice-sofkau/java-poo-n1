package co.com.sofka.mycalendar.jornada;

public class Mañana implements Jornada {

    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(8, 0);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(12, 0);
    }

}
