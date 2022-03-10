/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

/**
 *
 * @author javie
 */
public class Personas {
    private String nombre;
    private int Edad;
    
    //constructor
    public Personas() {//Esta vacio porque no retornara valores
        
}
    
    //Metodos a heredar
    
    public void setNombre (String nombre){
   this.nombre = nombre; 
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.Edad = edad;
    }
    public int getEdad(){
        return Edad;
    }
}
