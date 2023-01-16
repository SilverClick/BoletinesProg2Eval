
package boletin18;

import javax.swing.JOptionPane;






public class Boletin18 {

    
    public static void main(String[] args) {
      ConversorTemperaturas obj1= new ConversorTemperaturas();
     try{
          float grados1=Float.parseFloat(JOptionPane.showInputDialog(null, " Introduce los grados centígrados a convertir en Fharenheit "));
         float grados2=Float.parseFloat(JOptionPane.showInputDialog(null, " Introduce los grados centígrados a convertir en Reamur "));
     obj1.centigradosAFharenheit(grados1);              
     obj1.centigradosAReamur(grados2);
     }catch(TemperaturaErradaExcepcion e){
         System.out.println(" A temperatura non pode ser menor de 80 graos centígrados "+e.toString());
     }
        System.out.println("fin do programa");
    }
    }
    

