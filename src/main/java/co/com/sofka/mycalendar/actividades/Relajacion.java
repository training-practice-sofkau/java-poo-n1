package co.com.sofka.mycalendar.actividades;
import co.com.sofka.mycalendar.Laborable;
import java.time.LocalDate;

public class Relajacion extends Actividad implements Laborable {
    public Relajacion(String titulo, LocalDate fechaInicial, LocalDate fechaFinal) {
        super(titulo, fechaInicial, fechaFinal);
        if (titulo.isBlank()) {
            throw new IllegalArgumentException("El titulo no es valido");
        }
    }

    @Override
    public boolean esValido() {
        return false;
    }
}


