
package teste;

import java.util.Scanner;

import Enumpack.ClasseEnum;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Auxiliar auxiliar = new Auxiliar();
		
		String nome;
		int idade = 0;
		double altura;
		
		int n = sc.hashCode();
		double[] vect = new double[n];
		
		System.out.println("Qual o seu nome");
		nome = sc.next();
		auxiliar.setNome(nome);
		
		
		/*while(!nome.equals("paulo")) {
			
			System.out.println("O nome está errado");
			
		}
		
		*/
		if(nome.equals("paulo")) {
			System.out.println("O nome está correto");
		}
		else {
			System.out.println("O nome está incorreto");
		}
		
		if(idade == 5) {
			System.out.println("Ok");
		}
		else {
			System.out.println("not");	}
		
		
		
		System.out.println("Qual a sua idade");
		
		
		System.out.println();
		
		System.out.println(nome);
	}

}
