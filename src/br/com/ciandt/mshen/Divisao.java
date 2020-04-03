package br.com.ciandt.mshen;

public class Divisao implements OperacaoMatematica {

    @Override
    public int calcula(int num1, int num2) {
	return num1 / num2;
    }
}
