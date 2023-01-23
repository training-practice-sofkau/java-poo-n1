package co.com.sofka.mycalendar.actividades;
import co.com.sofka.mycalendar.jornada.Jornada;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Actividad {
    /**
     * Aquí tenemos los atributos de la clase abstracta Actividad
     */
    private String titulo;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private Jornada jornada;
    private LocalTime duracion;

    /**
     * Constructor vacío.
     */
    public Actividad() {
    }
    /**
     * Constructor del objeto Actividad.
     * @param titulo nos indica el título de la actividad.
     * @param fechaInicial nos indica la fecha de inicio de la actividad.
     * @param fechaFinal nos indica la fecha final de la actividad.
     * @param duracion nos indica la cantidad de horas que tomará la actividad
     */
    public Actividad(String titulo, LocalDate fechaInicial, LocalDate fechaFinal, LocalTime duracion) {
        this.titulo = titulo;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.duracion=duracion;
    }

    /**
     * Nos permite cambiar la fecha inicial o final de la actividad.
     * @param fechaInicial nos indica la nueva fecha inicial de la actividad.
     * @param fechaFinal nos indica la nueva fecha final de la actividad.
     */
    public void cambiarFechas(LocalDate fechaInicial, LocalDate fechaFinal){
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }

    /**
     * Nos permite cambiar la fecha inicial de la actividad.
     * @param fechaInicial nos indica la nueva fecha inicial de la actividad.
     */
    public void cambiarFechaInical(LocalDate fechaInicial){
        this.fechaInicial = fechaInicial;
    }

    /**
     * Nos permite cambiar la fecha final
     * @param fechaFinal
     */
    public void cambiarFechaFinal(LocalDate fechaFinal){
        this.fechaFinal = fechaFinal;
    }

    public String titulo() {
        return titulo;
    }

    public LocalDate fechaInicial() {
        return fechaInicial;
    }

    public LocalDate fechaFinal() {
        return fechaFinal;
    }

    public Jornada jornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
}
