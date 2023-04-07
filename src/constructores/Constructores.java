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
public class Constructores {

    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String[] args) {
        
            Persona persona = new Persona();         
            Persona JuanPersona = new Persona("Juan : ",25);
            
            imprimir(persona.getTextoImprimir());
            imprimir(JuanPersona.getTextoImprimir());
                     
    }
    */
    
    public static void main(String[] args) {
        
            Empleado empleado = new Empleado("Manuel",20,"Finanzas");         
            Empleado empleadocopia = Empleado.copiaEmpleado(empleado);
            empleadocopia.setDepartamento("Ventas");
            
            
            imprimir(empleado.getTextoImprimir());
            imprimir(empleadocopia.getTextoImprimir());
                     
    }
    

    
    public static void imprimir(String texto){
    
        System.out.println(texto);
    
    
    }
    
    public static String ConvertirATexto(int entero){
        
        return String.valueOf(entero);
    
    
    }
    
    
    
    
    
}
