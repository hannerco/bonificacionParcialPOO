package InterfazGráfica.Ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class VentanaLogIn extends  Ventana{

    public static void main(String[] args) {
        ventanaLogIn = new VentanaLogIn();
    }



    // Labels
    static JLabel lblTitulo, lblUsuario, lblContraseña, lblErrorSaludo;

    // Botón
    static JButton btnIngresar;

    // Campo de texto
    static JTextField txtUsuario, txtContraseña;

    // Ventanas
    public static VentanaLogIn ventanaLogIn;
    static VentanaBienvenida ventanaBienvenida;

    public void actionPerformed(ActionEvent e){
        if (e.getSource().equals(btnIngresar)){

            String username = txtUsuario.getText();
            String password = txtContraseña.getText();

            if (InterfazGráfica.Logica.Usuarios.validarUsuario(username, password)){
                InterfazGráfica.Logica.InicioCorrecto.saludar(username);
                lblUsuario.setText("");
                lblContraseña.setText("");
                ventanaBienvenida.setVisible(true);
                this.setVisible(false);


            } else {
                lblErrorSaludo.setText("Los datos ingresados no coinciden");
            }

        }
    }

    public VentanaLogIn(){
        super();
        this.setTitle("Log in");
        agregarComponentes();
        setVisible(true);


        ventanaBienvenida = new VentanaBienvenida();


    }


    public void agregarComponentes(){
        agregarLabels();
        agregarBotones();

    }


    public void agregarLabels(){
        // Crearlos

        lblTitulo = new JLabel("Log in", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("constantia",Font.BOLD,36));
        lblTitulo.setBounds(0,0,500,100);

        // Crear fuente para usuario y contraseña
        Font fuenteUsuarioContraseña = new Font("Arial", Font.ROMAN_BASELINE,20);

        lblUsuario = new JLabel("Usuario: ");
        lblUsuario.setBounds(150, 150, 300, 20);
        lblUsuario.setFont(fuenteUsuarioContraseña);
        txtUsuario = new JTextField();
        txtUsuario.setBounds(150, 185, 200, 30);


        lblContraseña = new JLabel("Contraseña: ");
        lblContraseña.setBounds(150, 245, 300, 20);
        lblContraseña.setFont(fuenteUsuarioContraseña);
        txtContraseña = new JTextField();
        txtContraseña.setBounds(150, 280, 200, 30);


        lblErrorSaludo = new JLabel("", SwingConstants.CENTER);
        // Aparecerá: Los datos ingresados no coinciden
        lblErrorSaludo.setBounds(0,350, 500, 20);




        // Agregarlos
        add(lblTitulo);
        add(lblUsuario);
        add(txtUsuario);
        add(lblContraseña);
        add(txtContraseña);
        add(lblErrorSaludo);

    }


    public void agregarBotones(){
        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(200,400,100,50);
        btnIngresar.addActionListener(this);

        add(btnIngresar);

    }


}
