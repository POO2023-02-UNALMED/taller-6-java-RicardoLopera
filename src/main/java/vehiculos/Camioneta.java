package vehiculos;

public class Camioneta extends Vehiculo {

	boolean volco;
	private static int nCamionetas;
	
	public Camioneta (String placa,int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		nCamionetas++;
	}
	
	public boolean isVolco() {
		return volco;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public static int getnCamionetas() {
		return nCamionetas;
	}
	
	public static void setnCamionetas(int nCamionetas) {
		Camioneta.nCamionetas = nCamionetas;
	}
}
