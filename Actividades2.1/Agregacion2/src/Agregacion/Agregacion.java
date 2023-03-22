package Agregacion;
import java.util.Scanner;
public class Agregacion {
	
	public Motor creaMotor() {
		Scanner scn = new Scanner(System.in);
		
		Motor myMotor = new Motor();
		
		myMotor.setNumValvulas(scn.next());
		myMotor.setFabricante(scn.next());
		myMotor.setCosto(scn.nextFloat());
		return myMotor;
	}
	
	public Automovil creaAuto() {
	    Motor gasolina = creaMotor();
	    Automovil auto=new Automovil("Toyota","Corolla",345900F,gasolina);
	    
	    return auto;
	}
	
    public static void main(String[] args) {
	    Agregacion auto = new Agregacion();
	    Automovil mio = auto.creaAuto();
	    System.out.println(mio.getInformacion());
    }
    
}
