package gestion;
import java.util.Arraylist;

public class Zoologico {
	String nombre;
	String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		
	}
	
	public Zoologico() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public List<Zona> getZonas() {
		return zonas;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	
	public int cantidadTotalAnimales() {
		cont = 0;
		for (int i = 0; i < zonas.size(); i++) {
			Zona temporal = zonas.get(i);
			cont += temporal.cantidadAnimales();
			
		}
		
		return cont;
	}
	
	
	
}
