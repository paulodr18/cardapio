package Exercicio5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 5) Faça um programa que leia as duas notas de um aluno em uma matéria e
		 * mostre na tela a sua média na disciplina. Ex: Nota 1: 4.5 Nota 2: 8.5 A média
		 * entre 4.5 e 8.5 é igual a 6.5
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota 1 ");
		double nota1 = sc.nextDouble(); 
		System.out.println("Nota 2 ");
		double nota2 = sc.nextDouble(); 
		
		double media = (nota1 + nota2)/ 2;
		
		System.out.println("Nota 1: " + nota1 + "Nota 2: " + nota2 + "A média : " + media );
	}

}
