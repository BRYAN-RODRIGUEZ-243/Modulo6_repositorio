package helpers;

/**
 *
 * @author Jessel
 */
public class Doctor {
    private String nombre;
    private String especialidad;
    private int edad;
    private int experiencia;
    //Constructor
    public Doctor( ){
        
    }
    //Metodos seters
    public void setnombre (String nombre){
   this.nombre = nombre; 
    }
    
    public void setedad(int edad){
        this.edad = edad;
    }
    public void setexperiencia(int NuevaExperiencia){
        experiencia = NuevaExperiencia;
    }
    public void setespecialidad(String NuevaEspecialidad){
        especialidad = NuevaEspecialidad;
    }
    
    
    //Metodos geters
    public String getnombre(){
        return nombre;
    }
    
    public int getedad(){
        return edad;
    }
    
    public int getexperiencia(){
        return experiencia; 
    }
    
    
    public String getEspecialidad(){
        return especialidad;
}
    }