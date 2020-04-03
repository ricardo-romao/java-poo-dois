package br.com.ciandt.gian73;

public class CalculadoraCientifica extends Calculadora {

    public int som(int num1, int num2) {
	return num1 + num2;
    }

    public int sub(int num1, int num2) {
	return num1 - num2;
    }

    public int mult(int num1, int num2) {
	return num1 * num2;
    }

    public int div(int num1, int num2) {
	return num1 / num2;
    }

    public double raizQuadrada(int num) {
	return Math.sqrt(num);
    }

    public double potencia(int numero, int elevado) {
	return Math.pow(numero, elevado);
    }
}
