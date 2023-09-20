package gestion;
import zooAnimales.Animal;
import java.util.Arraylist;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<Animal>();
	public Zona(String nombre, Zoologico[] zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
		
	}
	
	public Zona() {
	
	}
	
	public List<Animal> getAnimales() {
		return animales;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
	
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public void agregarAnimales(Animal animal){
		animales.add(animal);
		
	}
	
	public int cantidadAnimales() {
		return animales.size();
		
	}

}
