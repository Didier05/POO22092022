/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Marely Medina
 */
public class VentanaSWING extends JFrame {
private JTextField Cuadro;
private JButton Boton;
private JTextField Resultado;
    
    public VentanaSWING() throws HeadlessException {
        setTitle("Conversion de °C   a  °F");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        Cuadro = new JTextField(5);  
        ImageIcon icono = new ImageIcon(System.getProperty("user.dir")+"/src/ico/fes/swing/carro.png");        
        Boton  = new JButton(icono);
        Boton.setBackground(Color.GREEN);
        Boton.setOpaque(true);
        Boton.setToolTipText("Click para convertir en °F");
        Resultado = new JTextField("", 10);
        this.getContentPane().add(Cuadro);
        this.getContentPane().add(Boton);
        this.getContentPane().add(Resultado);
        this.setVisible(true);
        
        this.addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
          System.exit(0);
            }
        });
        
        this.Boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            float gradosFarenheit=0.0f;
            float Celsius=0.0f;
                try {
                    Celsius= Float.parseFloat(Cuadro.getText());
                    gradosFarenheit= (Celsius *(9.0f/5.0f))+32.0f;
                    Resultado.setText(gradosFarenheit + "°F");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "INtroduce un valor Númerico", "Error de captira !!!", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
            
        });
        
        
    }
    
    
}
