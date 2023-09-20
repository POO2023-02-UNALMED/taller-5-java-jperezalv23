package zooAnimales;

public class Mamifero extends Animal{
	private Mamifero[] listado;
	int caballos;
	int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		
	}
	
	public Mamifero() {
		
	}
	
	public Mamifero[] getListado() {
		return listado;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public boolean getPelaje() {
		return pelaje;
	}
	
	public void setListado(Mamifero[] listado) {
		this.listado = listado;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
}
