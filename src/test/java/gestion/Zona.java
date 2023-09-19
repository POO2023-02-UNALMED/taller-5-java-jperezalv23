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

}
