package sEcuaciones;
import JOPI.jopi;

public class Ecuacion {
	private Termino term1;
	private Termino term2;
	private int varInd;

	public Ecuacion() {
		this.term1 = creaTermino(1);
		this.term2 = creaTermino(2);
		this.varInd = jopi.ent("Termino Independiente ?");
	}
	
	public Termino creaTermino(int a) {
		int coef = jopi.ent("Coeficiente de termino "+a+" ?");
		char incog = jopi.car("Incognita de termino "+a+" ?");
		
		return new Termino(coef,incog);
	}
	
	
	
	
	public Termino getTerm1() {
		return term1;
	}
	public void setTerm1(Termino term1) {
		this.term1 = term1;
	}
	public Termino getTerm2() {
		return term2;
	}
	public void setTerm2(Termino term2) {
		this.term2 = term2;
	}
	public int getVarInd() {
		return varInd;
	}
	public void setVarInd(int varInd) {
		this.varInd = varInd;
	}
	
}
