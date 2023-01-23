package co.com.sofka.mycalendar.jornada;
import java.time.LocalTime;

public class Tarde implements Jornada{
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(13, 0);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(18, 0);
    }
}
