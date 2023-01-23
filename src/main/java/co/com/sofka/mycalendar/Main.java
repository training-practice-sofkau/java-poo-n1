package co.com.sofka.mycalendar;
import co.com.sofka.mycalendar.calendario.Semana;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    static Scanner sc=new Scanner(System.in);
    static Semana calendar=new Semana();
    public static void main(String[] args) {
        do{
        }while(menu()!=6);
    }

    /**
     * Muestra el menu a la persona para que use el programa.
     * @return devuelve la opción escogida por el usuario para que sea ejecutado.
     */
    public static int menu(){
        int op;
        System.out.println("\nMenu:"+
                "\n1) Crear actividad"+
                "\n2) Ver calendario"+
                "\n3) Ver semana"+
                "\n4) Crear semana de actividades"+
                "\n5) Cancelar actividad"+
                "\n6) Salir"+
                "\n\nSelecciona una opcion: ");
        op=sc.nextInt();
        seleccionMenu(op);
        return op;
    }

    /**
     * Nos maneja la selección del usuario y ejecuta el proceso correcto
     * @param op nos indica la selección del usuario
     */
    public static void seleccionMenu(int op){
        switch (op){
            case 1: creacionDeActividad();

        }

    }

    /**
     * Nos permite saber el número del día que la persona ingresa.
     * @param dia nos da el nombre del día.
     * @return nos devuelve el número del día.
     */
    public static int dia(DayOfWeek dia){
        switch (dia){
            case MONDAY: return 0;
            case TUESDAY: return 1;
            case WEDNESDAY: return 2;
            case THURSDAY: return 3;
            case FRIDAY: return 4;
            case SATURDAY: return 5;
            case SUNDAY: return 6;
        }
        return 0;
    }

    /**
     * Este método nos permite crear la actividad que el usuario desea.
     */
    public static void creacionDeActividad(){
        String [] actividad=new String[5];
        String [] fecha=new String[3];
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy");
        LocalDate date = LocalDate.of(2023,3,28);
        System.out.print("Ingrese el nombre de la actividad: ");
        sc.nextLine();
        actividad[0]=sc.nextLine();
        System.out.println("Ingrese la fecha inicial de la actividad: ");
        try{
            // Validar que el valor ingresado sea una fecha
            actividad[1]=sc.nextLine();
            formatoFecha.parse(actividad[1]);
        }catch(Exception e){
            System.out.println("Fecha de lanzamiento tiene un formato incorrecto, utilice (dd/MM/yyyy)");
        }
        fecha=actividad[1].split("/");
        date=LocalDate.of(Integer.parseInt(fecha[2]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[0]));
        calendar.getDiasDeLaSemanaList().get(dia(date.getDayOfWeek())).setFecha(date);
        System.out.println("Ingrese la fecha final de la actividad: ");
        try{
            // Validar que el valor ingresado sea una fecha
            actividad[2]=sc.nextLine();
            formatoFecha.parse(actividad[1]);
        }catch(Exception e){
            System.out.println("Fecha de lanzamiento tiene un formato incorrecto, utilice (dd/MM/yyyy)");
        }
        fecha=actividad[2].split("/");
        date=LocalDate.of(Integer.parseInt(fecha[2]),Integer.parseInt(fecha[1]),Integer.parseInt(fecha[0]));
        calendar.getDiasDeLaSemanaList().get(dia(date.getDayOfWeek())).setFecha(date);
    }
}
