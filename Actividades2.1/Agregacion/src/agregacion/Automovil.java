package agregacion;

public class Automovil {
    private String marca,modelo;
    private float precio;
    private Motor motor;

    public Automovil(String marca, String modelo, float precio, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.motor = motor;
    }

    public Automovil() {
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
      public String getInformacion(){
        String msg="Datos auto:\n\n";
        msg+="Marca: "+this.getMarca()+"\n";
        msg+="Modelo: "+this.getModelo()+"\n";
        msg+="Precio: "+this.getPrecio()+"\n";
        msg+=this.getMotor().getInformacion();
        return msg;   
    }
    
}
