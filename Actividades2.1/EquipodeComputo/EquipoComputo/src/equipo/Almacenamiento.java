package equipo;
public class Almacenamiento {
    private String tipo;
    private int capacidad;

    public Almacenamiento(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }
    
    public Almacenamiento() {
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public String getInformacion(){
        String msg="Datos Almacenamiento:\n";
        msg+="Tipo de almacenamiento: "+this.getTipo()+"\n";
        msg+="Capacidad de almacenamiento: "+this.getCapacidad();
        return msg;   
    }
}
