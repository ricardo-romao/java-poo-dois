package br.com.ciandt.mshen;

public class Subtracao implements OperacaoMatematica {

    @Override
    public int calcula(int num1, int num2) {
	return num1 - num2;
    }

}
