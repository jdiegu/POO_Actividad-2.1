package tecnm;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import salida.JOPIS;
public class Campus {
    private String nombre;
    private Carrera vCarreras[];
    private int ultima;
    
    public Campus(String nombre, int numCarreras){
        vCarreras=new Carrera[numCarreras];
        ultima=-1;
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void agregaCarrera(Carrera nvaCarrera){
        if (ultima<=vCarreras.length) {
            vCarreras[++ultima]=nvaCarrera;
        } else {
            JOPIS.mensaje("No se pueden agregar mas carreras");
        }
    }
    
    public String muestraCarrera(String nomCarrera){
        int pos=buscar(nomCarrera);
        String datosCarrera=null;
        if (pos!=-1) {
            datosCarrera="Datos de la carrera\n";
            datosCarrera+="Nombre: "+nomCarrera+"\n";
            datosCarrera+="Alumnos inscritos: "+vCarreras[pos].getTotAlumn();
            
            //Recupera una fecha creada con Date:
            datosCarrera+="Fecha Creacion: "+vCarreras[pos].getFechCrea().toString();
            
            //Otra forma de recuperar una fecha creada con Date:
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
            datosCarrera+="Fecha Creacion: "+dateFormat.format(vCarreras[pos].getFechCrea()+"\n");
        }
        return datosCarrera;
    }
    
    public int buscar(String nomCarrera){
        int k=0;
        while(k<=ultima){
            if (vCarreras[k].getNombre().equalsIgnoreCase(nomCarrera)) {
                return k;
            }
        }
        return -1;
    }
    
    public void consultaCarreras(){
        String informacion="Datos de las carreras ofrecidas\n";
        for (int i = 0; i <= ultima; i++) {
            informacion+="Nombre: "+vCarreras[i].getNombre()+"\n";
            
            //Recupera una fecha creada con Date:
            informacion+="Fecha Creacion: "+vCarreras[i].getFechCrea().toString()+"\n";
            
            //Otra forma de recuperar una fecha creada con Date:
            DateFormat dateFormat=new SimpleDateFormat("dd/MM/yy");
            informacion+="Fecha Creacion: "+dateFormat.format(vCarreras[i].getFechCrea())+"\n";
            
            informacion+="Alumnos inscritos: "+vCarreras[i].getTotAlumn()+"\n\n\n";
        }
        JOPIS.mensaje(informacion);
    }
    
}
