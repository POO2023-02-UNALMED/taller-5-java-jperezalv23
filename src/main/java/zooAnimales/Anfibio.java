package zooAnimales;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	int ranas;
	int salamandras;
	String colorPiel;
	boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		Anfibio.listado.add(this);
	}
	
	public Anfibio() {
		super();
		Anfibio.listado.add(this);
	}
	
	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}

	public ArrayList<Anfibio> getListado() {
		return listado;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas++;
		return rana;
	}
	
	public static Anfibio crearSalamandras(String nombre, int edad, String genero) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		Anfibio.salamandras++;
		return salamandra;
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
}

	
