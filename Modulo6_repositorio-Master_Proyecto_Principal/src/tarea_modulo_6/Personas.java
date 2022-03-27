package tarea_modulo_6;

import helpers.Doctor;
import helpers.Deportistas;
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

        //Objetos
        Doctor miDoctor = new Doctor();
        Deportistas ic = new Deportistas();
        //Clase Doctor
        miDoctor.setnombre("Jessel Serrano");
        miDoctor.setedad(25);
        miDoctor.setexperiencia(3);

        miDoctor.setespecialidad("NeuroCirujano");
        System.out.println("Nombre Doctor:"+miDoctor.getnombre());
        System.out.println("Edad: "+miDoctor.getedad()); 
        System.out.println("Años de experiencia:"+miDoctor.getexperiencia());
        System.out.print("Especialidad:"+miDoctor.getEspecialidad()+"\n");

        //Clase Deportista
        //Clase Deportista
     ic.setDeporte("Futbol");
        ic.setEquipo("Brasil");
        System.out.println("\nNombre :"+ic.getnombre2());
        System.out.println("Edad:"+ic.getedad2());
        System.out.println("Deporte:"+ic.getDeporte());
        System.out.println("Nombre Equipo:"+ic.getEquipo()+"\n");
        

    }

}