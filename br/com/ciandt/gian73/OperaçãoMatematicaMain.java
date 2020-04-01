package br.com.ciandt.gian73;

import java.util.Scanner;

public class OperaçãoMatematicaMain {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite a operação matematica:");
	String operação = sc.next();

	System.out.println("Digite 2 numeros");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	switch (operação) {
	case "Som":
	    Soma som = new Soma();
	    som.calcula(num1, num2);
	    System.out.println(som.getResultado());
	    break;
	case "Sub":
	    Subtração subtrai = new Subtração();
	    subtrai.calcula(num1, num2);
	    System.out.println(subtrai.getResultado());
	    break;
	case "Mult":
	    Multiplicação multiplica = new Multiplicação();
	    multiplica.calcula(num1, num2);
	    System.out.println(multiplica.getResultado());
	    break;
	case "Div":
	    Divisão divide = new Divisão();
	    divide.calcula(num1, num2);
	    System.out.println(divide.getResultado());
	    break;
	default:
	    break;
	}
    }
}
