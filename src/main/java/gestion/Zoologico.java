package gestion;
import java.util.ArrayList;
public class Zoologico {
	String nombre;
	String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
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
	
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
	}
	
	
	public int cantidadTotalAnimales() {
		int cont = 0;
		for (int i = 0; i < zonas.size(); i++) {
			Zona temporal = zonas.get(i);
			cont += temporal.cantidadAnimales();
			
		}
		
		return cont;
	}
	
	
	
}
