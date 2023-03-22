package composicion3;
import java.util.Scanner;

public class Libro {
    private String nombre,autor;
    private Capitulo capitulo1, capitulo2;
    
    public Libro(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
        
        
        capitulo1= creaCapitulo("1");
        capitulo2= creaCapitulo("2");
    }
    
    private Capitulo creaCapitulo(String msg ) {
    	Scanner sc=new Scanner(System.in);
        String nombreCap, numPaginas;
        System.out.println("Cual es nombre del capítulo "+ msg +"?");
        nombreCap=sc.nextLine();
        System.out.println("Cuantas página tiene el capítulo "+msg+"?");
        numPaginas=sc.nextLine();
        
        return new Capitulo(nombreCap,numPaginas,msg);
    }
    
    public Libro() {
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Capitulo getCapitulo1() {
        return capitulo1;
    }

    public void setCapitulo1(Capitulo capitulo1) {
        this.capitulo1 = capitulo1;
    }

    public Capitulo getCapitulo2() {
        return capitulo2;
    }

    public void setCapitulo2(Capitulo capitulo2) {
        this.capitulo2 = capitulo2;
    }
    
    public String getInformacion(){
        String msg="Datos Libro:\n";
        msg+="Nombre libro: "+this.getNombre()+"\n";
        msg+="Nombre autor: "+this.getAutor()+"\n\n";
        msg+=this.capitulo1.getInformacion()+"\n";
         msg+=this.capitulo2.getInformacion()+"\n";
        return msg;   
    }
}
