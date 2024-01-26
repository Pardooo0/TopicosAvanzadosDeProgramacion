/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.calentamientodeeventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
        JLabel miEtiqueta = new JLabel("");

        //Configuracion del JFrame
        miVentana.setBounds(800, 300, 300, 400);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(null);
        miVentana.addMouseMotionListener(new MouseMotionListener() {
            
            @Override
            public void mouseDragged(MouseEvent e) {
                miEtiqueta.setText(" " + e.getX() + " " + e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                miEtiqueta.setText("" + e.getX() + " " + e.getY());
            }

        });

        //Configuracion del label
        miEtiqueta.setBounds(80, 100, 200, 200);

        //Configuracion del JButtom "Boton"
        miBoton.setBounds(80, 148, 120, 24);
        miBoton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                miEtiqueta.setText("Ocurrio MouseClicked " + e.getButton());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                miEtiqueta.setText("Ocurrio MousePressed " + e.getButton());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                miEtiqueta.setText("Ocurrio MouseReleased ");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                miEtiqueta.setText("Ocurrio MouseEntered " + e.getX() + " " + e.getY());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                miEtiqueta.setText("Ocurrio MouseExited " + e.getX() + " " + e.getY());
            }
        });
        miVentana.add(miBoton);
        miVentana.add(miEtiqueta);
        miVentana.setVisible(true);

        //Armar la GUI
        miVentana.add(miBoton);

        //presentar la GUI
        miVentana.setVisible(true);

    }

}
