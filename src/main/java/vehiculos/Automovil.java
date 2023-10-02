package vehiculos;

public class Automovil extends Vehiculo {
	
	private int puestos;
	protected static int nAutomoviles = 0;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		nAutomoviles++;
	}
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int Puestos) {
		this.puestos = puestos;
	}
	
	public static int getnAutomoviles() {
		return nAutomoviles;
	}
	
	public static void setnAutomoviles(int nAutomoviles) {
		Automovil.nAutomoviles = nAutomoviles;
		
	}
}
