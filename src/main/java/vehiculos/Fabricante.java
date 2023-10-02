package vehiculos;
import java.util.ArrayList;

public class Fabricante {

	String nombre;
	Pais pais;
	
	public Fabricante (String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	public static Fabrica fabricaMayorVentas() {
		Arraylist<Fabrica> listado = Vehiculo.arrayFabricantes;
		int n = listado.size();
		int maxcount = 0;
		Fabricante fabricanteMasRepetido = null;
		for (int i = 0; i<n ; i++) {
			int count = 0;
			for (int j = 0; j<n;j++) {
				if (listado.get(i) == listado.get(j)) {
					count++;
				}
			}
			if (count > maxcount) {
				maxcount = count;
				fabricanteMasRepetido = listado.get(i);
			}
		}
		return fabricanteMasRepetido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
