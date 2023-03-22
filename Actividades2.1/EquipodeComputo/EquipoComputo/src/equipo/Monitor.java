package equipo;

public class Monitor {
    private String marca;
    private int resolucion;
    private int refresco;

    public Monitor(String marca, int resolucion, int refresco) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.refresco = refresco;
    }
    
    public Monitor() {
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public int getRefresco() {
        return refresco;
    }

    public void setRefresco(int refresco) {
        this.refresco = refresco;
    }
}
