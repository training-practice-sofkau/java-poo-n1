package co.com.sofka.mycalendar.calendario;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Semana {
    private List<DiasDeLaSemana> diasDeLaSemanaList;
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
}
