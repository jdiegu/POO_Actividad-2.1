package equipo;
import jopi.JOPI;

public class EquipoComputo {
    
    Almacenamiento creaAlmacenamiento(){
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
    }
    
}
