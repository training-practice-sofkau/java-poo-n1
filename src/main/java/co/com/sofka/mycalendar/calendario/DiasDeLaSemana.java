package co.com.sofka.mycalendar.calendario;

import java.time.LocalDate;

public enum DiasDeLaSemana {
    /**
     * Acá encontramos todos los días de la semana
     */
    Lunes,
    Martes,
    Miercoles,
    Jueves,
    Viernes,
    Sabado,
    Domingo;
    /**
     * Acá encontramos los atributos que tendrán los días de la semana.
     */
    private Calendario actividades;
    private LocalDate fecha;
    /**
     * Nos permite obtener el calendario que contiene las actividades de cada día.
     * @return nos devuelve un objeto Calendario con las actividades a realizar en un día.
     */
    public Calendario getActividades(){
        return actividades;
    }

    /**
     * Nos permite crear actividades en el día.
     * @param actividades nos indica las actividades que se harán en ese día-
     */
    public void setActividades(Calendario actividades) {
        this.actividades = actividades;
    }
    /**
     * Nos permite asignarle una fecha a cada día.
     * @param fecha nos indica la fecha del día.
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    /**
     * Nos permite obtener la fecha del día.
     * @return nos devuelve la fecha en un LocalDate del día.
     */
    public LocalDate getFecha() {
        return fecha;
    }
}
