package InterfazGráfica.Logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirLosLogIn {
    
    public static void escribir(String ingreso){
        String nombreArchivo = "src/login.log";

        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(ingreso);
            bufferedWriter.newLine(); // supongo que este añade un \n
            bufferedWriter.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }


    /* PREGUNTAS
   ¿Para qué sirve el parámetro true del fileWriter?
   R/: Para que no sobreescriba lo existente, sino que escriba debajo.
     */
}
