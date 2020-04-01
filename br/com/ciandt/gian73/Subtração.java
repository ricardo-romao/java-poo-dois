package br.com.ciandt.gian73;

public class Subtração implements OperacaoMatematica {
    private double resultado;

    public double getResultado() {
	return resultado;
    }

    @Override
    public void calcula(int num1, int num2) {
	resultado = num1 - num2;
    }

}
