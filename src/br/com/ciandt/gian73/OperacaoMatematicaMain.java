package br.com.ciandt.gian73;

import java.util.Scanner;

public class OperacaoMatematicaMain {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite a operacao matematica:");
	String operacao = sc.next();

	System.out.println("Digite 2 numeros");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	switch (operacao) {
	case "Som":
	    Soma som = new Soma();

	    System.out.println(som.calcula(num1, num2));
	    break;
	case "Sub":
	    Subtracao subtrai = new Subtracao();

	    System.out.println(subtrai.calcula(num1, num2));
	    break;
	case "Mult":
	    Multiplicacao multiplica = new Multiplicacao();

	    System.out.println(multiplica.calcula(num1, num2));
	    break;
	case "Div":
	    Divisao divide = new Divisao();

	    System.out.println(divide.calcula(num1, num2));
	    break;
	default:
	    break;
	}
    }
}
