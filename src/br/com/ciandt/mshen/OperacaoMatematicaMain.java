package br.com.ciandt.mshen;

import java.util.Scanner;

public class OperacaoMatematicaMain {

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
	    System.out.println(soma.calcula(num1, num2));
	    break;
	case "Subtração":
	    Subtracao subtrai = new Subtracao();
	    System.out.println(subtrai.calcula(num1, num2));
	    break;
	case "Multiplicação":
	    Multiplicacao multiplica = new Multiplicacao();
	    System.out.println(multiplica.calcula(num1, num2));
	    break;
	case "Divisão":
	    Divisao divide = new Divisao();
	    System.out.println(divide.calcula(num1, num2));
	    break;
	default:
	    break;
	}
    }
}
