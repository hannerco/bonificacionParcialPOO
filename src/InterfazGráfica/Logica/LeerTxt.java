package InterfazGráfica.Logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerTxt {
    public static String leer(String nombreArchivo) {

        String linea = "";

        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            linea = bufferedReader.readLine();
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e){
            System.out.println("Error en lectura");
        }
        return linea;

    }

    /* Preguntas:
    ¿Por qué hago que solo lea la primera línea y no todas?
    R/: Porque el archivo que le pasaré será un csv con una sola línea

    ¿Cómo separa por línea si es usuarios.txt es un archivo CSV separado por punto y coma?
    R/: Lo de separar lo hace en la clase InterfazGráfica.Logica.Usuarios.java


     */
}
