/**
 * classe trapezio
 * @author Alessio
 *
 */
public class AreaTrapezio {
private float baseMax;
private float baseMin;
private float altezza;
/**
 * costruttore della classe
 * @param BMax
 * @param bMin
 * @param h
 */
	public AreaTrapezio(float BMax, float bMin, float h) {
	this.baseMax = BMax;
	this.baseMin = bMin;
	this.altezza = h;
	//ciao
}
	/**
	 * get Base Maggiore
	 * @return
	 */
	public float getBaseMax() {
		return baseMax;
	}
	/**
	 * 
	 * get Base Minore
	 * @return
	 */
	public float getBaseMin() {
		return baseMin;
	}
	/**
	 * get Altezza
	 * @return
	 */
	public float getAltezza() {
		return altezza;
	}
	/**
	 * metodo calcola area
	 * @param BMax
	 * @param bMin
	 * @param h
	 * @return
	 */
	public float calcolaArea(float BMax, float bMin, float h) {
		return ((BMax+bMin)*h)/2;
	}
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		AreaTrapezio t= new AreaTrapezio(11, 20, 6);
        System.out.println(t.calcolaArea(11, 20, 6));
	}

}

