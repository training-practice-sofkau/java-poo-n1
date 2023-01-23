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
