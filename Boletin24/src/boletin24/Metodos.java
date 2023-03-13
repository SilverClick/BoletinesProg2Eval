
package boletin24;
import boletin24.ExcepcionLibro;
import com.gonzalo.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Metodos {
   public ArrayList<Libros> engadir(ArrayList<Libros>lista){
 Libros li= new Libros(PedirDatos.pedirString("autor :"),PedirDatos.pedirString( "titulo :"),
         PedirDatos.pedirString("ISBN :"),PedirDatos.pedirFloat("Precio :"),PedirDatos.pedirInt("numUnid :"));
 lista.add(li);
 //otra opcion de hacerlo:
 //lista.add(new Xogador(PedirDatos.pedirString("nome :"),PedirDatos.pedirInt( "dorsal :")));
 return lista;
   }
   public void venderLibro(ArrayList<Libros>lista)throws ExcepcionLibro{
        if(lista==null){
           throw new ExcepcionLibro();
        }
   String libroVender= PedirDatos.pedirString(" Introduce o libro a vender");
      Iterator it= lista.iterator();
      Libros li;
    while(it.hasNext()){
        li=(Libros)it.next();
        if(li.getTitulo().equalsIgnoreCase(libroVender))
           li.setNumUnid(li.getNumUnid()-1);
             
          }
    }
   public void amosarLibro(ArrayList<Libros>lista) throws ExcepcionLibro{
       if(lista.isEmpty()==true){
           throw new ExcepcionLibro();
                   }
       ordenar(lista);
    System.out.println(lista);
   
   }
   public void ordenar(ArrayList<Libros>lista){
  Collections.sort( lista);  
       
     
   }
   public void darDeBajaLibro(ArrayList<Libros>lista) throws ExcepcionLibro{
         if(lista.isEmpty()==true){
           throw new ExcepcionLibro();
        }
          Iterator it= lista.iterator();
      Libros li;
    while(it.hasNext()){
        li=(Libros)it.next();
        if(li.getNumUnid()==0)
           it.remove();
             
          }
    }
   public int buscarLibro(ArrayList<Libros>lista) throws ExcepcionLibro{
       if(lista.isEmpty()==true){
           throw new ExcepcionLibro();
        }
    String libroBuscar= PedirDatos.pedirString(" Que libro buscas? ");
    int atopado=0;//non se atopou
  for(Libros elemento:lista){
       if(libroBuscar.compareToIgnoreCase(elemento.getTitulo())==0){
           System.out.println(" Os datos do libro son :"+"autor: "+elemento.getAutor()+" titulo : "
             +elemento.getTitulo()+" Isbn : "+elemento.getIsbn()+" Precio : "+elemento.getPrecio()
                   +" Numero de unidades :"+elemento.getNumUnid());
           atopado=1;
       }
     
   }
if(atopado==0)
        System.out.println(" Ese libro no lo tenemos ");
return atopado;
}
   }
 

