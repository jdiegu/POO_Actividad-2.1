package composicion3;
import JOPI.jopi;
import javax.swing.JOptionPane;


public class Composicion {
    public void crea() {
       
        Libro obLibro=new Libro(jopi.cad("Nombre?"),jopi.cad("Autor?"));
        
        JOptionPane.showMessageDialog(null,obLibro.getInformacion());
        
    }
    
}
