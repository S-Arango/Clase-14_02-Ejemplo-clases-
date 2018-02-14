/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase;

/**
 *
 * @author ESTUDIANTE
 */
public class Cancion {
    //Variables
    public String titulo;
    public String autor; 
    
    //Metodos
    public void sonar(){
        System.out.println("Sonando: " + this.titulo + " - " + this.autor);
    }
}
