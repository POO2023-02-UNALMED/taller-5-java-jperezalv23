package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
		
	}
	
	public Ave() {
		super();
		Ave.listado.add(this);
		
	}
	
	public void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public ArrayList<Ave> getListado() {
		return Ave.listado;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public static int getAguilas() {
		return aguilas;
	}
	
	public static int getHalcones() {
		return halcones;
	}
	
	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	
	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		Ave.halcones++;
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		Ave.aguilas++;
		return aguila;
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	
}
