package Electro;
import Electro.Electrodomesticos;
public class Lavadora extends Electrodomesticos  {
	
	
	private int carga;
	
	public Lavadora(int precio_base, String color, String consumo, int peso, int carga) {
		super(precio_base, color, consumo, peso);
		this.carga = carga;
	}

	
	public int getCarga() {
		return carga;
	}

	
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	
	

}
