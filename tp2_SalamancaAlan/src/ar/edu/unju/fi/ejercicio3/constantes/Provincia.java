package ar.edu.unju.fi.ejercicio3.constantes;

public enum Provincia {
	JUJUY(718971, 19), SALTA(820500, 120), TUCUMAN(300200, 30), CATAMARCA(430900, 180), 
	LARIOJA(780900, 40), SANTIAGODELESTERO(970300, 127);
	
	private int cantidadPoblacion;
	private int superficie;
	
	private Provincia(int cantidadPoblacion, int superficie) {
		this.cantidadPoblacion = cantidadPoblacion;
		this.superficie = superficie;
	}
	
	public float densidadPoblacional(){
		float calculo;
		
		calculo = (float)this.cantidadPoblacion / (float)this.superficie;
		return calculo;
	}

	public int getCantidadPoblacion() {
		return cantidadPoblacion;
	}

	public void setCantidadPoblacion(int cantidadPoblacion) {
		this.cantidadPoblacion = cantidadPoblacion;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

}
