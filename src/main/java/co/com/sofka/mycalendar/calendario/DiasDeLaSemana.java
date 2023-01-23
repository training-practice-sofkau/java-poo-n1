package co.com.sofka.mycalendar.calendario;
public enum DiasDeLaSemana {
    Lunes(new Calendario()),
    Martes(new Calendario()),
    Miercoles(new Calendario()),
    Jueves(new Calendario()),
    Viernes(new Calendario());
    private final Calendario actividades;
    DiasDeLaSemana(Calendario actividades){
        this.actividades=actividades;
    }
    public Calendario getActividades(){
        return actividades;
    }
}
