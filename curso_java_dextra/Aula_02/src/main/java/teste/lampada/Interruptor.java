package teste.lampada;

public class Interruptor {

	// Associando Lampada em Interruptor.
	Lampada lampada;

	
	public Interruptor(Lampada lampada){
		this.lampada = lampada; //
	}
		
	public void apertar() {
		
		if (lampada.estaLigada()){
			lampada.desligar();
		} else {
			lampada.ligar();
		}

	}

}
