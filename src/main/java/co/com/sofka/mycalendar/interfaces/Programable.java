package co.com.sofka.mycalendar.interfaces;
public interface Programable {
     /**
      * Nos permite hacer que una actividad se repita cierta cantidad de veces.
      * @param repeticiones nos indica la cantidad de días que se repetirá la actividad.
      */
     public void agregarRepeticion(int repeticiones);

     /**
      * Nos permite hacer que una actividad se repita ciertos días.
      * @param dia nos indica el día que se repetirá la actividad.
      */
     public void agregarFrecuencia(String dia);
     /**
      * Nos permite hacer que una actividad se repita ciertos días.
      * @param dias nos indica los días que se repetirá la actividad.
      */
     public void agregarFrecuencia(String[] dias);
}
