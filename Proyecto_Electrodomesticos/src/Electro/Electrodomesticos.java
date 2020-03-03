package Electro;

public class Electrodomesticos{

		
		private int precio_base;
		private String color;
		private String consumo;
		private int peso;

		
		
		public Electrodomesticos(int precio_base, String color, String consumo, int peso) {
			this.precio_base = precio_base;
			this.color = color;
			this.consumo = consumo;
			this.peso = peso;
		}

			public int getPrecio_base() {
			return precio_base;
		}


		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Electrodomesticos [precio_base=" + precio_base + ", color=" + color + ", consumo=" + consumo
					+ ", peso=" + peso + ", getPrecio_base()=" + getPrecio_base() + ", getColor()=" + getColor()
					+ ", getConsumo()=" + getConsumo() + ", getPeso()=" + getPeso() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}


		/**
		 * @param precio_base the precio_base to set
		 */
		public void setPrecio_base(int precio_base) {
			this.precio_base = precio_base;
		}


		/**
		 * @return the color
		 */
		public String getColor() {
			return color;
		}


		/**
		 * @param color the color to set
		 */
		public void setColor(String color) {
			this.color = color;
		}


		public String getConsumo() {
			return consumo;
		}


		
		public void setConsumo(String consumo) {
			this.consumo = consumo;
		}


		/**
		 * @return the peso
		 */
		public float getPeso() {
			return peso;
		}


		/**  
		 * @param peso the peso to set
		 */
		public void setPeso(int peso) {
			this.peso = peso;
		}

	
}
		
		
		
	


