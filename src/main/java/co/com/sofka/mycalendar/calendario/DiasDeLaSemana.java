package co.com.sofka.mycalendar.calendario;
public enum DiasDeLaSemana {
    Lunes(new Dia()),
    Martes(new Dia()),
    Miercoles(new Dia()),
    Jueves(new Dia()),
    Viernes(new Dia());
    private final Dia actividades;
    DiasDeLaSemana(Dia actividades){
        this.actividades=actividades;
    }
    public Dia getActividades(){
        return actividades;
    }
}
