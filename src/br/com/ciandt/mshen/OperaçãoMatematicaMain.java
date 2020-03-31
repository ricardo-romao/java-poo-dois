package br.com.ciandt.mshen;

import java.util.Scanner;

public class OperaçãoMatematicaMain {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite a operação matematica:");
	String operação = sc.next();

	System.out.println("Digite 2 numeros");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	switch (operação) {
	case "Soma":
	    Soma soma = new Soma();
	    soma.calcula(num1, num2);
	    System.out.println(soma.getResultado());
	    break;
	case "Subtração":
	    Subtração subtrai = new Subtração();
	    subtrai.calcula(num1, num2);
	    System.out.println(subtrai.getResultado());
	    break;
	case "Multiplicação":
	    Multiplicação multiplica = new Multiplicação();
	    multiplica.calcula(num1, num2);
	    System.out.println(multiplica.getResultado());
	    break;
	case "Divisão":
	    Divisão divide = new Divisão();
	    divide.calcula(num1, num2);
	    System.out.println(divide.getResultado());
	    break;
	default:
	    break;
	}
    }
}
