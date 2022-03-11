/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Breny
 */
public class Deportistas extends Doctor{
private String Equipo;
private String Deporte;


//constructor 
public Deportistas(){
    
}

public String getnombre2(){
    return "Roberto Carlos";
}
 public int getedad2(){
        return 55;
    }
    
 public void setEquipo(String Equipo){
     this.Equipo = Equipo;
 }
 public String getEquipo(){
     return Equipo;
 }
 public void setDeporte(String Deporte){
    this.Deporte = Deporte;  
 }
 public String getDeporte(){
     return Deporte;
 }
}
