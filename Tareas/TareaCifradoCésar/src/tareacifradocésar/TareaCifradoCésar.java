/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacifradocésar;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author Marely Medina
 */
public class TareaCifradoCésar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
              
                
                CifradoyDescifrado vs= new CifradoyDescifrado();
              System.out.println(System.getProperty("user.dir")); 
               
               /*
              {  Scanner l= new Scanner(System.in);
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
    System.out.println("La palabra cifrada es: "+ cifrado);}
    
    
              
              //Codigo para descifrar 
              
              
              {Scanner l= new Scanner(System.in);
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
                           cifrado+=" ";
                           }
                                          
    }
    System.out.println("La palabra descifrada es: "+ descifrado);}
     */
     
}
}