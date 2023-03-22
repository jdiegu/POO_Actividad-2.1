package composicion;

import javax.swing.JOptionPane;


public class Composicion {
    public static void main(String[] args) {
       
        Libro obLibro=new Libro("Como programar en Java","Deitel & Deitel");
        
        JOptionPane.showMessageDialog(null,obLibro.getInformacion());
        
    }
    
}
