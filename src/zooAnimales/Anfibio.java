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
	
	public Anfibio() {
		
	}
	
	public void setListado(Anfibio[] listado) {
		this.listado = listado;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public Anfibio[] getListado() {
		return listado;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}
}
