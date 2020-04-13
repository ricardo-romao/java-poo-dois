package br.com.ciandt.gian73;

public class Multiplicacao implements OperacaoMatematica {
    private int resultado;

    public int getResultado() {
	return resultado;
    }

    @Override
    public int calcula(int num1, int num2) {
	
	resultado = num1 * num2;
	return resultado;
    }
    
}
	