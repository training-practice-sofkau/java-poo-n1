package co.com.sofka.mycalendar.jornada;

import java.time.LocalTime;

public class Manana implements Jornada{
    int hora, minutos;
    @Override
    public LocalTime horaInicial() {
        return LocalTime.of(hora, minutos);
    }

    @Override
    public LocalTime horaFinal() {
        return LocalTime.of(hora, minutos);
    }

    public Manana(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }
}
