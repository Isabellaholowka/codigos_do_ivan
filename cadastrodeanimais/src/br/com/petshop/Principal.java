package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

//Classe principal que gerencia o sistema de cadastro de animal:
public class PetShop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>(); //Lista
		int opcao;
		
		do {
			//Exibição do menu de opções
			System.out.println("\n=== Menu ===");
			System.out.println("1 - Cadastrar Cachorro");
			System.out.println("2 - Cadastrar Gato");
			System.out.println("3 - Exibir Animais");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção");
			opcao = scanner.nextlint();
			scanner.nextLine(); //Consumir a quebra de linha
			
			switch (opcao) {
			case 1:
				// Cadastro de um cachorro
				System.out.print("Nome do Cahorro: ");
                tring nomeCachorro = scanner.nextline();
                System.out.print("Idade do Cachorro ");
                int idadeCachorro = scanner.nextLine();
                scanner.nextLine(); //consumir a quebra de linha...
                System.out.print("Raça do Cachorro: ");
				
			}
		}
	}
}