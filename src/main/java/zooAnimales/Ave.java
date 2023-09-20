package zooAnimales;

public class Ave extends Animal{
	private Ave[] listado;
	int halcones;
	int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		
	}
	
	public Ave() {
		
	}
	
	public void setListado(Ave[] listado) {
		this.listado = listado;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public Ave[] getListado() {
		return listado;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	
}
