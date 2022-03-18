/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.composicion.libro;

import tarea.composicion.libro.componentes.Autor;
import tarea.composicion.libro.componentes.Editorial;
import tarea.composicion.libro.componentes.Libro;

/**
 *
 * @author ikero
 */
public class TareaComposicionLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1= new Libro();
        libro1.setAutor(new Autor("Malorie", 43));
        libro1.setEditorial(new Editorial("Salamandra", 4));
        
        System.out.println(libro1);
        libro1.cerrarLibro();
        
    }
    
}
