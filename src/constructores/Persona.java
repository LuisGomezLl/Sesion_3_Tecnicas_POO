/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author USER
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    
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

    public Persona(){}
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
          
    public String getTextoImprimir(){
    return "Nombre : "+this.nombre + "\n Edad : "+this.getEdadComoTexto();
        
    }
    
    public String getEdadComoTexto(){
        String Edadtexto = Constructores.ConvertirATexto(edad);
        return Edadtexto;
    }
    
    
    
    
}
