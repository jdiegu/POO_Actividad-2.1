/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipocomputo;

/**
 *
 * @author benja
 */
public class Puerto {
     private String nombre;
    private String tipo;

    public Puerto(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public Puerto() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
