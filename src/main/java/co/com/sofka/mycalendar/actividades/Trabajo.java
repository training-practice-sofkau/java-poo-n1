package co.com.sofka.mycalendar.actividades;

import co.com.sofka.mycalendar.Programable;

import java.time.LocalDate;

public class Lectura extends Actividad implements Programable {

    public Lectura(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if(titulo.isBlank()){
            throw new IllegalArgumentException("El titulo no es valido");
        }
        if(fechaInicial.compareTo(fechaFinal)<0) {
            System.out.printl("La fecha final"+fechaFinal+"es anterior a la fecha inicial"+fechaInicial);
            throw new IllegalArgumentException("La fecha final es anterior a la fecha inicial");
        }
        else if(fechaFinal.compareTo(fechaInicial)>0) {
            System.out.printl("La fecha inicial"+fechaInicial+"es posterior a la fecha final"+fechaFinal);
            throw new IllegalArgumentException("La fecha inicial es posterior a la fecha final");
    }

    public Lectura(String titulo, LocalDate fechaFinal){
        this(titulo, LocalDate.now(), fechaFinal);
    }

    @Override
    public void agregarRepeticion(int repeticiones) {
            if (repeticiones<0){
                throw newIllegalArgumentException ("El número no puede ser negativo")
            }
            this.repeticiones=repeticiones;
    }
}
