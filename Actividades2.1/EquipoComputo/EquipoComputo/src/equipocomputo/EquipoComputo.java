/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipocomputo;
import jopi.JOPI;
import salida.JOPIS;
/**
 *
 * @author benja
 */
public class EquipoComputo {
 public Almacenamiento creaAlmacenamiento(){
        String tipo;
        int capacidad;
        tipo = JOPI.cadena("Tipo de almacenamiento?");
        capacidad = JOPI.entero("Cual es su capacidad?");
        
        return new Almacenamiento(tipo, capacidad);
    }
    
    
    
    public Motherboard creaMotherboard(){
        String modelo;
        byte ram;
        float velocidad;
        
        modelo = JOPI.cadena("Cual es el modelo de la MotherBoard?");
        ram = JOPI.byteEntero("Cuanta RAM tiene la MotherBoard?");
        velocidad = JOPI.flotante("Cual es la velocidad de la MotherBoard?");
        
        return new Motherboard(modelo, ram, velocidad, creaAlmacenamiento());
    }
    
    public static void main(String[] args) {
        
        EquipoComputo computo = new EquipoComputo();
        Motherboard madre = new Motherboard();
        madre = computo.creaMotherboard();
        salida.JOPIS.mensaje(madre.getInformacion());
//System.out.println(madre.getInformacion());   
    }
    
}
