package vehiculos;
import java.util.ArrayList;

public class Vehiculo {

	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	protected static int cantidadVehiculos;
	static ArrayList <Fabricante> arrayFabricantes = new ArrayList<Fabricante>();
	static ArrayList <Pais> arrayPaises = new ArrayList<Pais>();
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante ) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		arrayFabricantes.add(fabricante);
		Pais pais = fabricante.getPais();
		arrayPaises.add(pais);
		cantidadVehiculos++;
	}
	
	public String vehiculoPorTipo() {
		
		int automoviles = Automovil.getnAutomoviles();
		int camionetas = Camioneta.getnCamionetas();
		int camiones = Camion.getnCamiones();
		
		String cadena = "Automoviles:"+ automoviles +"\n"+ "Camionetas:"+ camionetas+"\n" + "Camiones:"+ camiones +"\n";
		
		return cadena;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
}
