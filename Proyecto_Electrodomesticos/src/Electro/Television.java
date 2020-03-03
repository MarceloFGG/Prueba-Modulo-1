package Electro;

public class Television extends Electrodomesticos {
	
	private int res;
	private boolean sint;
	
	public Television(int precio_base, String color, String consumo, int peso, int res, boolean sint) {
		super(precio_base, color, consumo, peso);
		this.res = res;
		this.sint = sint;
	}

	
	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public boolean getSint() {
		return sint;
	}

	public void setSint(boolean sint) {
		this.sint = sint;
	}

	
	
}
