package Aula02;

public class Ponto {
	
	// Inicializando com valor fixo.
	double x = 0.0;
	// Inicializado com valor padrão.
	double y;
	
	/**
	 * Contrutor para coordX e coordY.
	 * @param coordX
	 * @param coordY
	 */
	
	public Ponto(double coordX, double coordY){
		this.x = coordX;
		this.y = coordY;
	}
	
	public Ponto(double coordX) {
		x = coordX;
		y = 0;
	}
	
	/**
	 * Metodo descolar que recebe dois parametros double.
	 * @param deltax
	 * @param deltay
	 */
	
	public void deslocar(double deltax, double deltay) {
		x += deltax;
		y += deltay;
		
	}
	
	public void zerar() {
		x = 0;
		y = 0;
	}
	
	/**
	 * Exemplo de metodo com retorno.
	 * 
	 * @return
	 */
	
	public boolean isYMenorQueZero() {
		if (y < 0)
			return true;
		return false;
	}

}