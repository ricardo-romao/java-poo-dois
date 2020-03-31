package br.com.ciandt.mshen;

public class CalculadoraCientifica extends Calculadora {

    public int soma(int num1, int num2) {
	return num1 + num2;
    }

    public int subtração(int num1, int num2) {
	return num1 - num2;
    }

    public int multiplicação(int num1, int num2) {
	return num1 * num2;
    }

    public int divisão(int num1, int num2) {
	return num1 / num2;
    }

    public double raizQuadrada(int num) {
	return Math.sqrt(num);
    }

    public double potencia(int numero, int elevado) {
	return Math.pow(numero, elevado);
    }
}
