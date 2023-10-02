package vehiculos;

public class Camion extends Vehiculo {

	int ejes;
	private static int nCamiones;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80,nombre,precio, peso, "4X2",fabricante);
		this.ejes = ejes;
		nCamiones++;
	}
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static int getnCamiones() {
		return nCamiones;
	}
	
	public static void setnCamiones(int nCamiones) {
		Camion.nCamiones = nCamiones;
		
	}
}
