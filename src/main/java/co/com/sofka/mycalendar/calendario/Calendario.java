package co.com.sofka.mycalendar.calendario;
import co.com.sofka.mycalendar.actividades.Actividad;
import java.util.ArrayList;
import java.util.List;
public class Calendario {
    /**
     * Acá encontramos los atributos de la clase Calendario
     */
    private final int cantidadHoras=11;
    private List<Actividad> actividadList;
    /**
     * Constructor vacío
     */
    public Calendario() {
        this.actividadList=new ArrayList<Actividad>();
    }
    /**
     * Constructor inicializando los atributos.
     * @param actividadList nos indica las actividades que tendrá el día
     * @param cantidadHoras nos indica la cantidad de horas disponibles por día
     */
    public Calendario(List<Actividad> actividadList,int cantidadHoras){
        this.actividadList=actividadList;
    }
    public void agregarActividad(Actividad actividad){
        actividadList.add(actividad);
    }


}
