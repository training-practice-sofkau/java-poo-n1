package co.com.sofka.mycalendar;

import java.util.List;

public enum Semana {
    I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII;
    public List<DiaSemana> semana;

    public void agregarDia(DiaSemana dia) {
        if (!semana.contains(dia)) {
            semana.add(dia);
        } else {
            System.out.println("Ese día ya existe");
        }
    }
}
/* Me di cuenta tarde de que se trabaja con fechas enteras y no solo la hora.
* Luego a la hora de trabajar lo que pensaba hacer, diseñé esta lógica con días y cantidad de semanas
* Muy poco tiempo tuvimos, para lo tostados que estamos :( */
