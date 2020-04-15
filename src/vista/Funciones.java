
package vista;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.Pelicula;

public class Funciones {
    
    ArrayList<Pelicula> lista = new ArrayList();
    
    public void llenar(){
        
        Pelicula batman = new Pelicula("Batman"," Christopher Nolan ", 2008 ," Superheroe justiciero ");
        Pelicula corazon = new Pelicula("Corazon Valiente"," Mel Gibson",1995,"Independencia de Escocia");
        Pelicula fyf = new Pelicula("Rapido & Furioso 8"," F. Gary Gray",2017,"Accion carros");
        Pelicula forest = new Pelicula("Forest Gump"," Robert Zemeckis",1994,"Drama historia moderna Estados Unidos");
        Pelicula sherk = new Pelicula("Sherk"," Andrew Adamson",2001,"Romance del ogro y la princesa");
        Pelicula simpson = new Pelicula("Los Simpson"," Matt Groening",2008,"La familia amarilla");
        Pelicula titanic = new Pelicula("Titanic"," James Cameron",1998,"Romance en el naufragio de la embarcacion 'Titanic'");
        Pelicula transformer = new Pelicula("Transformers 5"," Michael Bay",2017,"La guerra de autobots y decepticons");
        Pelicula spiderman = new Pelicula("Spiderman"," Sam Raimi",2002,"El hombre araña");
        Pelicula masacre = new Pelicula("La Masacre De Texas"," Tobe Hooper",1974,"Asesino serial de texas");
        
        
        lista.add(batman);
        lista.add(corazon);
        lista.add(fyf);
        lista.add(forest);
        lista.add(sherk);
        lista.add(simpson);
        lista.add(titanic);
        lista.add(transformer);
        lista.add(spiderman);
        lista.add(masacre);
        
    }
    
    public void buscar(String nombrePeli){
         
        Iterator it = lista.iterator();
        
        while(it.hasNext()){
            Pelicula pelicula = (Pelicula)it.next();
            if ( nombrePeli.equalsIgnoreCase(pelicula.getNombre()) ) {
                JOptionPane.showMessageDialog(null, "Nombre: "+pelicula.getNombre()+ "\nDirector: " + pelicula.getDirector()+ "\nAño: " + pelicula.getAño() + "\nReseñe: " + pelicula.getReseña());
                
            }
        
        }
        
        
    }
    
    public void vender(int cantidad , String nombre ){
        Iterator it = lista.iterator();
        while(it.hasNext()){
            Pelicula pelicula = (Pelicula)it.next();
            if ( nombre.equalsIgnoreCase(pelicula.getNombre()) ) {
                JOptionPane.showMessageDialog(null, pelicula.getNombre() + pelicula.getDirector() + pelicula.getAño() + pelicula.getReseña());
                pelicula.setEntrada(cantidad + pelicula.getEntrada());
            }
            
        }
        
    }
    
    public void totalD(String nombre) {
        Iterator it = lista.iterator();
        while (it.hasNext() ){
           Pelicula pelicula = (Pelicula)it.next();
           if (nombre.equalsIgnoreCase(pelicula.getNombre())){
               JOptionPane.showMessageDialog(null, pelicula.getNombre());
           }
        } 
       
    }
 }

