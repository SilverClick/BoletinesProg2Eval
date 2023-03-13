
package boletin24;
import com.gonzalo.boletin24.metodos.Libros;
import com.gonzalo.boletin24.metodos.Metodos;
import com.gonzalo.datos.PedirDatos;
import java.util.ArrayList;

public class Boletin24 {

    
    public static void main(String[] args) {
         ArrayList <Libros> listaLibros= new ArrayList<>();
       Metodos obj=new Metodos();
        int op;
        do{
          op=PedirDatos.pedirInt("**** MENU **** \n 1--> ENGADIR Libro \n 2--> AMOSAR Libro \n "
                  + "3-->VENDER Libro \n 4--> ACTUALIZAR \n 5-->Buscar Libro \nTeclea una opcion : ");
          try{
         switch(op){
             case 1:obj.engadir(listaLibros);;
             break;
             case 2:obj.amosarLibro(listaLibros);
             break;
             case 3:obj.venderLibro(listaLibros);
             break;
             case 4:obj.darDeBajaLibro(listaLibros);
            break;
             case 5:obj.buscarLibro(listaLibros);
             break;
       
    }
         }catch(ExcepcionLibro ex){
              System.out.println(" ERROR EN LA LIBRERIA ");
         }
        }while(op<=5);
   
       
}
}
    
    

