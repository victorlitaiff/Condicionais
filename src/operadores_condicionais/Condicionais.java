package operadores_condicionais;

import java.net.*;
import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
	int opcao = 2;
	double saldo = 5.825;	
		
	System.out.println("Digite sua opção aqui");
	if (opcao == 3) {
			System.out.println("Fazer transferencia");
		} else if (opcao == 2) {
			System.out.println("Fazer depósito");
		} else if (opcao == 1) {
			System.out.println("Verificar Saldo: R$" + saldo);
		} else {
			System.err.println("Erro de comunicação");

			}
	}
}
	

