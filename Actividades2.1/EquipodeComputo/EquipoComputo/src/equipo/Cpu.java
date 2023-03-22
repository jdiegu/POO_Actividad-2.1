package equipo;
public class Cpu {
    private String modelo;
    private double velocidad;
    private boolean graficos;

    public Cpu(String modelo, double velocidad, boolean graficos) {
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.graficos = graficos;
    }

    public Cpu() {
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isGraficos() {
        return graficos;
    }

    public void setGraficos(boolean graficos) {
        this.graficos = graficos;
    }
    
    
    
}
