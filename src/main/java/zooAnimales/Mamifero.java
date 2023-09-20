package zooAnimales;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
		
	}
	
	public Mamifero() {
		super();
		Mamifero.listado.add(this);
		
	}
	
	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}

	public ArrayList<Mamifero> getListado() {
		return listado;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public boolean getPelaje() {
		return pelaje;
	}
	
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new mamifero(nombre, edad, "pradera", genero, true, 4);
		Mamifero.caballos++;
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new mamifero(nombre, edad, "selva", genero, true, 4);
		Mamifero.leones++;
		return leon;
	}
	
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
}
