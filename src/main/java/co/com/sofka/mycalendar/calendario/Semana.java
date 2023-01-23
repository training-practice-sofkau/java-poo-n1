package co.com.sofka.mycalendar.calendario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Semana {
    private final List<DiasDeLaSemana> diasDeLaSemanaList;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    public Semana(LocalDate fechaInicio,LocalDate fechaFinal) {
        this.fechaInicio=fechaInicio;
        this.fechaFinal=fechaFinal;
        this.diasDeLaSemanaList=new ArrayList<>();
        for (DiasDeLaSemana dia:DiasDeLaSemana.values()){
            this.diasDeLaSemanaList.add(dia);
        }
    }
    public Semana() {
        this.diasDeLaSemanaList=new ArrayList<>();
        for (DiasDeLaSemana dia:DiasDeLaSemana.values()){
            this.diasDeLaSemanaList.add(dia);
        }
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public List<DiasDeLaSemana> getDiasDeLaSemanaList() {
        return diasDeLaSemanaList;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
