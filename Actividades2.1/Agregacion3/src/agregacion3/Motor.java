
package agregacion3;

public class Motor {
    private String numValvulas, fabricante;
    private float costo;

    public Motor(String numValvulas, String fabricante, float costo) {
        this.numValvulas = numValvulas;
        this.fabricante = fabricante;
        this.costo = costo;
    }

    public Motor() {
    }
        
    public String getNumValvulas() {
        return numValvulas;
    }

    public void setNumValvulas(String numValvulas) {
        this.numValvulas = numValvulas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
    public String getInformacion(){
        String msg="Datos motor:\n";
        msg+="Fabricante: "+this.getFabricante()+"\n";
        msg+="Num. Valvulas: "+this.getNumValvulas()+"\n";
        msg+="Costo: "+this.getCosto()+"\n";
        return msg;   
    }
}
