package gestion;

public class Zoologico {
	String nombre;
	String ubicacion;
	Zona[] zonas;
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
	
	public Zona[] getZonas() {
		return zonas;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public void setZonas(Zona[] zonas) {
		this.zonas = zonas;
	}
	
	
}
