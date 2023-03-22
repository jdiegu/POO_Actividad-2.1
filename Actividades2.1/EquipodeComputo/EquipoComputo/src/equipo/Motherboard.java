package equipo;
import jopi.JOPI;
public class Motherboard {

    private String modelo;
    private byte ram;
    private float velocidad;
    private Cpu aCpu;
    private Almacenamiento aAlmacenamiento;

    //Como es compoicion, dentro del constructor se deberia construir a CPU y almacenamiento
    public Motherboard(String modelo, byte ram, float velocidad/*, Cpu aCpu*/, Almacenamiento aAlmacenamiento) {
        this.modelo = modelo;
        this.ram = ram;
        this.velocidad = velocidad;
        //Los this no son necesarios
        aCpu = creaCpu();
        this.aAlmacenamiento = aAlmacenamiento;
    }

    public Motherboard(){
    
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public byte getRam() {
        return ram;
    }

    public void setRam(byte ram) {
        this.ram = ram;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public Cpu getaCpu() {
        return aCpu;
    }

    public void setaCpu(Cpu aCpu) {
        this.aCpu = aCpu;
    }

    public Almacenamiento getaAlmacenamiento() {
        return aAlmacenamiento;
    }

    public void setaAlmacenamiento(Almacenamiento aAlmacenamiento) {
        this.aAlmacenamiento = aAlmacenamiento;
    }
    
    public Cpu creaCpu(){
        String modelo;
        double velocidad;
        boolean graficos;
        
        modelo = JOPI.cadena("Cual es el modelo del CPU?");
        velocidad = JOPI.flotante("Cual es la velocidad del CPU?");
        graficos =JOPI.booleano("Tiene tarjeta grafica incluida?");
        
        return new Cpu(modelo, velocidad, graficos);
    }
    
    public String getInformacion(){
        //Datos de la MOTHERBOARD
        String msg = "Datos de la MotherBoard\n";
        msg+="Modelo: "+this.getModelo()+"\n";
        msg+="RAM: "+this.getRam()+"\n";
        msg+="Velocidad: "+this.getVelocidad()+"\n";
        
        //Datos de la CPU
        msg+="Modelo del CPU: "+this.getaCpu().getModelo()+"\n";
        msg+="Velocidad del CPU: "+this.getaCpu().getVelocidad()+"\n";
        msg+="Tiene graficos: "+this.getaCpu().isGraficos()+"\n";
        
        //Datos del almacenamiento
        msg+=this.getaAlmacenamiento().getInformacion();
        
        return msg;
    }
}
