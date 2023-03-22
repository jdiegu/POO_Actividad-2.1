package tecnm;
import jopi.JOPI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import salida.JOPIS;
import salida.Menu;
public class Tecnm {

    public Carrera creaCarrera(){
        Carrera nvaCarrera=new Carrera();
        nvaCarrera.setNombre(JOPI.cadena("Nombre de la carrera a dar alta?"));
        nvaCarrera.setCve(JOPI.cadena("Clave de la carrera a dar de alta?"));
        nvaCarrera.setTotAlumn(JOPI.enteroCorto("Numero de alumnos que tiene la carrera?"));
        
        //captura de fecha creacion
        String fechaComoTexto = JOPI.cadena("Fecha creacion dd/mm/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = sdf.parse(fechaComoTexto);
        } catch (ParseException ex) {
            Logger.getLogger(Tecnm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        nvaCarrera.setFechCrea(fecha); // asigna fecha creacion al objeto Carrera
        //fin de captura fecha creacion
        
        return nvaCarrera;
    }
    
    public void menuOpciones(Campus tec){
        String opciones[]={"Agregar", "Muestra", "Consultar", "SALIR"};
        String opElegida="";
        
        while(!(opElegida=Menu.menuDesplegable(opciones, "Nombre campus "+tec.getNombre())).equalsIgnoreCase("SALIR")){
            switch (opElegida) {
                case "Agregar":tec.agregaCarrera(creaCarrera());
                    break;
                case "Muestra":String nombreConsultar=JOPI.cadena("Nombre de la carrera a consultar?");
                                String datosCarrera=tec.muestraCarrera(nombreConsultar);
                                if (datosCarrera!=null) {
                                    JOPIS.mensaje(opElegida);
                                } else {
                                    JOPIS.mensaje("No existe esa carrera");
                                }
                break;                        
                case "Consultar": tec.consultaCarreras();
                break;
            }
        }
    }
    
    public Campus creaCampus(String nombCampus, int numCarreras){
        Campus campus = new Campus(nombCampus, numCarreras);
        return campus;
    }
}