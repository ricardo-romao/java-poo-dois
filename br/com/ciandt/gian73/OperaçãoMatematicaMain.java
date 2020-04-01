package br.com.ciandt.gian73;

import java.util.Scanner;

public class Opera��oMatematicaMain {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);

	System.out.println("Digite a opera��o matematica:");
	String opera��o = sc.next();

	System.out.println("Digite 2 numeros");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();

	switch (opera��o) {
	case "Som":
	    Soma som = new Soma();
	    som.calcula(num1, num2);
	    System.out.println(som.getResultado());
	    break;
	case "Sub":
	    Subtra��o subtrai = new Subtra��o();
	    subtrai.calcula(num1, num2);
	    System.out.println(subtrai.getResultado());
	    break;
	case "Mult":
	    Multiplica��o multiplica = new Multiplica��o();
	    multiplica.calcula(num1, num2);
	    System.out.println(multiplica.getResultado());
	    break;
	case "Div":
	    Divis�o divide = new Divis�o();
	    divide.calcula(num1, num2);
	    System.out.println(divide.getResultado());
	    break;
	default:
	    break;
	}
    }
}
