package equipo;

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
