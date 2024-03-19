package InterfazGráfica.Ventanas;

import javax.swing.*;
import java.awt.*;

public class VentanaBienvenida extends Ventana {


    static JLabel lblSaludo;
    public VentanaBienvenida(){
        super();
        this.setTitle("Home");
        agregarComponentes();

    }

    public void agregarComponentes(){
        agregarLabels();
    }

    public void agregarLabels(){
        lblSaludo = new JLabel("BIENVENIDO", SwingConstants.CENTER);
        lblSaludo.setFont(new Font("constantia",Font.BOLD,36));
        lblSaludo.setBounds(0,10,500,100);
        add(lblSaludo);
    }
}
