package InterfazGráfica.Logica;

import java.time.LocalDate;
import java.time.LocalTime;

public class InicioCorrecto {

    public static void saludar(String usuario){
        System.out.println("Bienvenido, " + usuario + ".");
        String ingreso = LocalDate.now() + "   -   " + LocalTime.now()
                + "   -   " + usuario;
        EscribirLosLogIn.escribir(ingreso);
    }
}
