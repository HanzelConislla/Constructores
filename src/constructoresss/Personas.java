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
public class Personas {
    private String nombre;
    private int edad;
    
    public Personas(){}

    public Personas(String nombre, int edad) {
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
    public String getTextoImprime(){
        return "Nombre : "
                + this.nombre
                + "\n Edad: "
                + getEdadComoTexto()
                +"\n---------------";
    }
    public String getEdadComoTexto(){
        String edadTexto = Constructoresss.convertirATexto(edad);
        return edadTexto;
    }
}
