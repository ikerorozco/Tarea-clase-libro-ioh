/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.composicion.libro.componentes;

/**
 *
 * @author ikero
 */
public class Autor {
    String nombre;
    int edad;

    public Autor() {
    }

    public Autor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
public void cambiarPagina(){
    
    System.out.println("has cambiado de pagina");
    
}
}
