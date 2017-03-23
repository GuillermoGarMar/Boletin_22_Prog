/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol22;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Guille
 */
public class Bol22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Libreria li=new Libreria();
       
        int opcion;
         li.leerLineas();
         
         do{
             try{
                 
                 opcion=Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1 Engadir \n2 Consultar por titulo \n3 Visualizar \n4 Borrar libros a 0 \n5 Ordenar libros \n6 Consultar autor \n7 Modificar libro \n8 Salir"));
                 
             }catch(Exception ex){
                 System.out.println(ex.getMessage());
                 opcion=0;
             }
            switch(opcion){
            case 1: li.engadir();
                break;
            case 2:li.consultar();
                break;
            case 3:li.visualizar();
                break;
            case 4:li.borrarLibrosAcero();
                break;
            case 5:li.ordenar();
                break;
            case 6:li.consultarAutor();
                break;
            case 7:li.modificar();
             break;
            case 8:{li.escribirTexto("lib.txt");System.exit(0);}
            
    }
    
}while(opcion<8);
    }
    
}
