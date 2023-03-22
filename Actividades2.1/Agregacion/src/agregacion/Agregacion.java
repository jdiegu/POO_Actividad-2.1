package agregacion;

public class Agregacion {
    public static void main(String[] args) {
    // Se crea primero el objeto de manera independiente
    // que va a ser parte del automóvil
    Motor gasolina=new Motor("4","Toyota Group", 5900.8F);
    
    //AGREGAR EL motor gasolina al auto
    // a travpes de los parámetros del constructor del Automóvil
    Automovil auto=new Automovil("Toyota","Corolla",345900F,gasolina);
    System.out.println(auto.getInformacion());
    }
    
}
