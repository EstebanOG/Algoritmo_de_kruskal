package monticulo;

public class MonticuloMinimo extends Monticulo {

	public MonticuloMinimo(int tamanioMaximo) {
		super(tamanioMaximo);
		this.nodo[0] = Integer.MIN_VALUE;
	}

	@Override
	protected boolean condicion(int hijo, int padre) {
		return this.nodo[hijo] >= this.nodo[padre];
	}
	
}
