package Exercicio3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando
		 * no final uma mensagem. Ex: Nome do Funcionário: Maria do Carmo Salário:
		 * 1850,45 O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Salário do funcionário: ");
		double salario = sc.nextDouble();

		System.out.println(" O funcionário " + nome + " tem um salário de R$ " + salario + " em Junho.");

	}

}
