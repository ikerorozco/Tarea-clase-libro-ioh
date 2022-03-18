/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.composicion.libro.componentes;

/**
 *
 * @author ikero
 */
public class Editorial {
    String nombreEdit;
    int numEdicion;

    public Editorial() {
    }

    public Editorial(String nombreEdit, int numEdicion) {
        this.nombreEdit = nombreEdit;
        this.numEdicion = numEdicion;
    }

    public String getNombreEdit() {
        return nombreEdit;
    }

    public void setNombreEdit(String nombreEdit) {
        this.nombreEdit = nombreEdit;
    }

    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreEdit=" + nombreEdit + ", numEdicion=" + numEdicion + '}';
    }
    
    public void abrirLibro(){
        
        System.out.println("Has abierto el libro");
        
    }
}
