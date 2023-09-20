package gestion;
import zooAnimales.Animal;

public class Zona {
	String nombre;
	Zoologico[] zoo;
	Animal[] animales;
	public Zona(String nombre, Zoologico[] zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona() {
		
	}
	
	public Animal[] getAnimales() {
		return animales;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Zoologico[] getZoo() {
		return zoo;
	}
	
	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setZoo(Zoologico[] zoo) {
		this.zoo = zoo;
	}
	
	

}
