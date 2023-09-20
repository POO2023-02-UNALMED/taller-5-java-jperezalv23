package zooAnimales;

public class Ave extends Animal{
	private ArrayList<Ave> listado;
	int halcones;
	int aguilas;
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
	
	public void setListado(arrayList<Ave> listado) {
		this.listado = listado;
	}

	public arrayList<Ave> getListado() {
		return listado;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
	public String getColorPlumas() {
		return colorPlumas;
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
