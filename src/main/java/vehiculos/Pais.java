package vehiculos;
import java.util.ArrayList;

public class Pais {

	String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	public static Pais paisMasVendedor() {
		ArrayList<Pais> listado = Vehiculo.arrayPaises;
		int n = listado.size();
		int maxcount = 0;
		Pais paisMasRepetido = null;
		for (int i = 0; i<n;i++) {
			int count = 0;
			for (int j = 0; j<n;j++) {
				if (listado.get(i)== listado.get(j)) {
					count++;
				}
			}
			if (count > maxcount) {
				maxcount = count;
				paisMasRepetido = listado.get(i);
			}
		}
		return paisMasRepetido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
