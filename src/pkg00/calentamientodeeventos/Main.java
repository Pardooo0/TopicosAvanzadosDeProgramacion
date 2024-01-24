/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.calentamientodeeventos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 *
 * @author Alumno LMC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion e instanciacion de componentes de GUI
        JFrame miVentana = new JFrame("Mi primera ventana");
        JButton miBoton = new JButton("Clickeame");
        JLabel miEtiqueta = new Jlabel();

        //Configuracion del JFrame
        miVentana.setBounds(800, 300, 300, 400);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(null);

        //Configuracion del JButtom "Boton"
        miBoton.setBounds(80, 148, 120, 24);
        miVentana.add(miBoton);
        miVentana.setVisible(true);
        
        //Armar la GUI
        miVentana.add(miBoton);
        
        //presentar la GUI
        miVentana.setVisible(true);

    }

}
