import InterfazGráfica.Logica.InicioCorrecto;
import InterfazGráfica.Logica.Usuarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite usuario:\t ");
        String username = input.nextLine();

        System.out.println("Digite clave:\t ");
        String password = input.nextLine();

        if (Usuarios.validarUsuario(username, password)){
            InicioCorrecto.saludar(username);
        } else {
            System.out.println("Usuario o clave incorrecta");
        }

    }
}