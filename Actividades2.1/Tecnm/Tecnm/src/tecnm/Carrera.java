package tecnm;

import java.util.Date;

public class Carrera {
    private String nombre, cve;
    private Date fechCrea;
    private short totAlumn;
    
    public Carrera(String nombre, String cve, Date fechCrea, short totAlumn){
        this.nombre = nombre;
        this.cve = cve;
        this.fechCrea = fechCrea;
        this.totAlumn = totAlumn;
    }
    
    public Carrera() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCve() {
        return cve;
    }

    public void setCve(String cve) {
        this.cve = cve;
    }

    public Date getFechCrea() {
        return fechCrea;
    }

    public void setFechCrea(Date fechCrea) {
        this.fechCrea = fechCrea;
    }

    public short getTotAlumn() {
        return totAlumn;
    }

    public void setTotAlumn(short totAlumn) {
        this.totAlumn = totAlumn;
    }
    
}
