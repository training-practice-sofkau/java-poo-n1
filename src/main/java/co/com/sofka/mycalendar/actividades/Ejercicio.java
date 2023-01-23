package co.com.sofka.mycalendar.actividades;

import java.time.LocalDate;

public class Ejercicio extends Actividad{
    private String tipo;
    public Ejercicio(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, String tipo) {
        super(titulo, fechaInicial, fechaFinal);
        this.tipo = tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

}
