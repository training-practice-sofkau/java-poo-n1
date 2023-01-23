package co.com.sofka.mycalendar.jornada;

/**
 * Clase abstracta para indicar la jornada
 */
public abstract class CualJornada {

    private Jornada jornada;

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
}
