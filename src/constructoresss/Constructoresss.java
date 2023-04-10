/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructoresss;

/**
 *
 * @author hanze
 */
public class Constructoresss {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        /**
     * @param args the command line arguments
     */
     /*public static void main(String[] args) {
        /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        Persona persona = new Persona();
        Persona juanpersona = new Persona("Juan", 25);
        
        imprimir (persona.getTextoImprime());
        imprimir (juanpersona.getTextoImprime());
         //System.out.println("Nombre:" + (persona.getNombre()));
         
        
    } */   
    public static void main(String[] args) {
        
        Empleados empleados = new Empleados(" Manuel ",20, "Finanza" );
        
        Empleados empleadosCopia = Empleados.copiaEmpleados(empleados);
        //ctrl + space
        empleadosCopia.setDepartamento("ventas");
        
        imprimir (empleados.getTextoImprime());
        imprimir (empleadosCopia.getTextoImprime());
         //System.out.println("Nombre:" + (persona.getNombre()));    
    } 
    
    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    
    public static String convertirATexto(int entero)
    {
        return String.valueOf(entero);
    }
    
    
}
