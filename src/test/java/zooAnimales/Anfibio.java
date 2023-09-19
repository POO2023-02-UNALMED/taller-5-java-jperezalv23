package zooAnimales;

public class Anfibio extends Animal{
	Anfibio[] listado;
	int ranas;
	int salamandras;
	String colorPiel;
	boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
}
