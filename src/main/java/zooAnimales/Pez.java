package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
		
	}
	
	public Pez() {
		super();
		Pez.listado.add(this);
		
	}
	
	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}

	public ArrayList<Pez> getListado() {
		return listado;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		Pez.salmones++;
		return salmon;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		Pez.salmones++;
		return bacalao;
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}

}
