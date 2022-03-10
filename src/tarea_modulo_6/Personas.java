/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_modulo_6;

import helpers.Doctor;

/**
 *
 * @author javie
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Clase Doctor
        Doctor miDoctor = new Doctor();
        miDoctor.setnombre("Jessel Serrano");
        miDoctor.setedad(25);
        miDoctor.setexperiencia(3);
        System.out.println("Nombre Doctor:"+miDoctor.getnombre());
        System.out.println("Edad: "+miDoctor.getedad()); 
        System.out.println("Años de experiencia:"+miDoctor.getexperiencia());
        System.out.print("Especialidad:"+miDoctor.getEspecialidad());
        
        
    }
    
}
