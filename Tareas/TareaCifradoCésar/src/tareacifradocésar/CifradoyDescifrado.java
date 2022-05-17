/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacifradocésar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Marely Medina
 */
public class CifradoyDescifrado extends JFrame {
 private JLabel Palabra;
    private JTextField Cuadro;
    private JTextField Cuadro1;
    private JTextField Cuadro2;
    private JButton Boton;
    private JTextField Resultado;
   private JLabel Mensaje;
    private JLabel Cifrado;
   private String Texto;
   private float desplazamiento;

    public CifradoyDescifrado() throws HeadlessException {
        int opcion=0;    
       String op="";
        setTitle("Cifrado y Descifrado de Mensaje Cesar");
         op =JOptionPane.showInputDialog(null, "\nSeleccionar una opción" 
                +"\n1.\tCifrar" 
               +"\n2.\tDescifrar"
                 +"\nNO SUPE COMO METER EL CODIGO A LA INTERFAZ BIEN", JOptionPane.QUESTION_MESSAGE);
              
         
              
        opcion = Integer.parseInt(op);
        switch (opcion) {
            case 1:{
            setTitle("Cifrado de Mensaje");
         setSize(600, 500);
         setLayout(new FlowLayout(FlowLayout.CENTER));
         {Palabra = new JLabel("tipo de desplazamiento");
         Cuadro = new JTextField(5);}
        Cuadro1= new JTextField(" ", 40);
         setLayout(new FlowLayout(FlowLayout.TRAILING));
        Boton  = new JButton("Cifrar");
        Boton.setBackground(Color.GREEN);
        Boton.setOpaque(true);
        Resultado = new JTextField("MENSAJE CIFRADO:\n", 40);
        this.getContentPane().add(Palabra);
        this.getContentPane().add(Cuadro);
        this.getContentPane().add(Cuadro1);
        this.getContentPane().add(Boton);
        this.getContentPane().add(Resultado);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
                 @Override
                 public void windowClosing(WindowEvent e) {
                  System.exit(0);
                 }
             
         });
         this.Boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            
                try {
                    Scanner l= new Scanner(System.in);
               System.out.println("Dame la frase");
               String pa=l.nextLine();
               System.out.println("Cuantas posiciones se va a recorrer ");
               int re=l.nextInt();
               
               
               String abc="abcdefghijklmnñopqrstuvwxyz";
               String palabra ="";
               char v[]=abc.toCharArray();
               for (int i = abc.length()+re ; i < abc.length(); i++) {
            palabra +=v[i];
            }
               palabra +=0;
               for (int i = re; i < abc.length()-re ; i++) {
            palabra+= v[i];            
        }String palabra1="";
               char v1[ ]= palabra.toCharArray();
               for (int i = 0; i < palabra.length(); i++) {
                   int c=0;
                   for (int j = i+1; j < palabra.length()-1; j++) {
                       if (v1[i]==v1[j]&& v1[i] !='0'){
                       c++;
                       v1[j]='0';
                       }
                       
                   }
            if (c>=1){
            palabra1+= v1[i]; 
            }else if (v1[i] != '0'){
            palabra1+=v1[i];
            }
        }
               String cifrado="";
               char v3[]=pa.toCharArray();
               char v4[]=palabra1.toCharArray();
               for (int i = 0; i < pa.length(); i++) {
                   if(v3[i]!=' '){
                   for (int j = 0; j < 27; j++) {
                       if (v3[i]==v[j]) {
                           cifrado+=v4[j];
                           break;
                       }
                       
                   }            
        }else {
                           cifrado+=" ";
                           }
                                          
    }
                    Resultado.setText(cifrado);
                
                
                
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "INtroduce un valor Númerico", "Error de captira !!!", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
            
        });
            

            }break;
            
            case 2:{
             setTitle("Cifrado de Mensaje");
         setSize(600, 500);
         setLayout(new FlowLayout(FlowLayout.CENTER));
         {Palabra = new JLabel("tipo de desplazamiento");
         Cuadro = new JTextField(5);}
        Cuadro1= new JTextField(" ", 40);
         setLayout(new FlowLayout(FlowLayout.TRAILING));
        Boton  = new JButton("Descifrar");
        Boton.setBackground(Color.GREEN);
        Boton.setOpaque(true);
        Resultado = new JTextField("MENSAJE DESCIFRADO:\n", 40);
        this.getContentPane().add(Palabra);
        this.getContentPane().add(Cuadro);
        this.getContentPane().add(Cuadro1);
        this.getContentPane().add(Boton);
        this.getContentPane().add(Resultado);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
                 @Override
                 public void windowClosing(WindowEvent e) {
                  System.exit(0);
                 }
             
         });
         this.Boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            
                try {
                    Scanner l= new Scanner(System.in);
               System.out.println("Dame la frase");
               String pa=l.nextLine();
               System.out.println("Cuantas posiciones se va a recorrer ");
               int re=l.nextInt();
               
               
               String abc="abcdefghijklmnñopqrstuvwxyz";
               String palabra ="";
               char v[]=abc.toCharArray();
               for (int i = abc.length()-re ; i < abc.length(); i++) {
            palabra +=v[i];
            }
               palabra +=0;
               for (int i =0; i < abc.length()-re ; i++) {
            palabra+= v[i];            
        }String palabra1="";
               char v1[ ]= palabra.toCharArray();
               for (int i = 0; i < palabra.length(); i++) {
                   int c=0;
                   for (int j = i+1; j < palabra.length()-1; j++) {
                       if (v1[i]==v1[j]&& v1[i] !='0'){
                       c++;
                       v1[j]='0';
                       }
                       
                   }
            if (c>=1){
            palabra1+= v1[i]; 
            }else if (v1[i] != '0'){
            palabra1+=v1[i];
            }
        }
               String descifrado="";
               char v3[]=pa.toCharArray();
               char v4[]=palabra1.toCharArray();
               for (int i = 0; i < pa.length(); i++) {
                   if(v3[i]!=' '){
                   for (int j = 0; j < 27; j++) {
                       if (v3[i]==v[j]) {
                           descifrado+=v4[j];
                           break;
                       }
                       
                   }            
        }else {
                           descifrado+=" ";
                           }
                                          
    }
                    Resultado.setText(descifrado);
                
                
                
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "INtroduce un valor Númerico", "Error de captira !!!", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            
            
        });

            }break;
            
            default:
                throw new AssertionError();
        }
           
            
        
    }
}
