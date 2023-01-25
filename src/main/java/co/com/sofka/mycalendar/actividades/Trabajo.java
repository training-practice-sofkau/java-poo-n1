package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.interfaces.Laborable;
import co.com.sofka.mycalendar.jornada.Jornada;
import co.com.sofka.mycalendar.jornada.Noche;

import java.time.LocalDate;

public class Trabajo extends Actividad implements Laborable {

    public Trabajo(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        titulo.isBlank();
    }

    @Override
    public void setJornada(Jornada jornada) {

        if(jornada.nombreJornada().equals(new Noche().nombreJornada()))
            System.out.println("No se puede asignar la jornada "+ jornada.nombreJornada()+ " a la actividad: '" + this.titulo() + "' por que la actividad es laborable");
        else {
            super.setJornada(jornada);
        }
    }

    @Override
    public boolean esValido() {
        return false;
    }
}