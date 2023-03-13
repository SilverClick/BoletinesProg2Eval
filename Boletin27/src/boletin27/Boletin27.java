
package boletin27;
import boletin27.Libros.Libros;
import com.gonzalo.datos.PedirDatos;
import java.io.File;
import java.util.ArrayList;

public class Boletin27 {

    
    public static void main(String[] args) {
         File e = new File("boletin27.txt");
        ArrayList<Libros> aux= new ArrayList();
        Metodos obxM = new Metodos();
        int opcion;
        
        do{
            opcion = PedirDatos.getInt("1 -> Engadir\n2 -> Consultar precio\n3 -> Amosar ficheiro\n4 -> Borrar\n5 -> Modificar precio");
            
            switch(opcion){
                case 1:
                    obxM.engadir(e, aux, PedirDatos.getInt("Cantos libros queres engadir?"));
                    break;
                case 2:
                    obxM.consultar(aux, PedirDatos.getString("Teclee o título do libro a consultar"));
                    break;
                case 3:
                    obxM.amosar(e);
                    break;
                case 4:
                    obxM.borrar(e, aux);
                    break;
                case 5:
                    obxM.modificarPrecio(e, aux, PedirDatos.getString("Teclee o título do libro a modificar"));
                    break;
                default:
                    System.out.println("Saíndo do programa");
            }
                    
        }while(opcion>0 && opcion<6);
    }
    
}

    }
    
}
