package Exercicio4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 4) Desenvolva um algoritmo que leia dois números inteiros e mostre o
		 * somatório entre eles. Ex: Digite um valor: 8 Digite outro valor: 5 A soma
		 * entre 8 e 5 é igual a 13.
		 */

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int soma = num1 + num2;

		System.out.println("O resultado é: " + soma);

	}

}
