package zooAnimales;
import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		totalAnimales++;
		
	}
	
	public Animal() {
		
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}
	
	public void setZona(Zona[] zona) {
		this.zona = zona;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}
	
	public Zona[] getZona() {
		return zona;
	}
	
}
