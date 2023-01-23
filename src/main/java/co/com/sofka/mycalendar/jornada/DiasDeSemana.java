package co.com.sofka.mycalendar.jornada;

import co.com.sofka.mycalendar.Laborable;

public enum DiasDeSemana implements Laborable {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    @Override
    public boolean esValido() {



        return false;
    }
}
