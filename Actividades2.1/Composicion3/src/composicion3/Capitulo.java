package composicion3;

public class Capitulo {
private String Nombre, num_Paginas, numCap;

    public Capitulo(String Nombre, String num_Paginas,String numCap) {
        this.Nombre = Nombre;
        this.num_Paginas = num_Paginas;
        this.numCap=numCap;
    }

    public Capitulo() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNum_Paginas() {
        return num_Paginas;
    }

    public void setNum_Paginas(String num_Paginas) {
        this.num_Paginas = num_Paginas;
    }

    public String getNumCap() {
        return numCap;
    }

    public void setNumCap(String numCap) {
        this.numCap = numCap;
    }
    
    public String getInformacion(){
        String msg="Datos capítulo "+this.getNumCap()+":\n";
        msg+="Nombre capítulo: "+this.getNombre()+"\n";
        msg+="Num. hojas: "+this.getNum_Paginas()+"\n";
    return msg;   
    }
    
}
