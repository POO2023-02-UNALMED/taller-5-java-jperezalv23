package zooAnimales;

public class Pez extends Animal {
	private Pez[] listado;
	int salmones;
	int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		
	}
	
	public Pez() {
		
	}
	
	public void setListado(Pez[] listado) {
		this.listado = listado;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public Pez[] getListado() {
		return listado;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	

}
