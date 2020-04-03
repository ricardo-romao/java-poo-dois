package br.com.ciandt.gian73;

import java.util.Scanner;

public class OperacaoMatematicaMain {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite a opera��o matematica:");
	String operacao = sc.next();

	System.out.println("Digite 2 numeros");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	switch (operacao) {
	case "Som":
	    Soma som = new Soma();
	    som.calcula(num1, num2);
	    System.out.println(som.getResultado());
	    break;
	case "Sub":
	    Subtracao subtrai = new Subtracao();
	    subtrai.calcula(num1, num2);
	    System.out.println(subtrai.getResultado());
	    break;
	case "Mult":
	    Multiplicacao multiplica = new Multiplicacao();
	    multiplica.calcula(num1, num2);
	    System.out.println(multiplica.getResultado());
	    break;
	case "Div":
	    Divisao divide = new Divisao();
	    divide.calcula(num1, num2);
	    System.out.println(divide.getResultado());
	    break;
	default:
	    break;
	}
    }
}
