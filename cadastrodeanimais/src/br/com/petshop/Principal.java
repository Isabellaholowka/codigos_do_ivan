package br.com.petshop;

public class Petshop {

}


package br.com.petshop;

// Classe base Animal
public class Animal {
    private String nome;
    private int idade;

    // Construtor para inicializar o objeto Animal
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos para obter os valores dos atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método para exibir informações do animal
    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + " anos");
    }
}


package br.com.petshop;

// A classe Cachorro herda de Animal
public class Cachorro extends Animal {
    private String raca;

    // Construtor para inicializar Cachorro com atributos específicos
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // Chama o construtor da classe base (Animal)
        this.raca = raca;
    }

    // Método específico para latir
    public void latir() {
        System.out.println(getNome() + " está latindo: Au Au!");
    }

    // Sobrescrita do método exibirInfo para incluir a raça
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raça: " + raca);
    }
}


package br.com.petshop;

// A classe Gato herda de Animal
public class Gato extends Animal {
    private String corPelo;package br.com.petshop;

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
            System.out.println("1 - Cadast…System.out.println("4 - Sair");
            System.out.print("Escolha uma opção");
            opcao = scanner.nextlint();
            scanner.nextLine(); //Consumir a quebra de linha
            
            switch (opcao) {
            case 1:
                // Cadastro de um cachorro

                System.out.print("Nome do Cahorro: ");
                tring nomeCachorro = scanner.nextline();
                System.out.print("Idade do Cachorro ");
                int idadeCachorro = scanne

    // Construtor para inicializar Gato com atributos específicos
    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade); // Chama o construtor da classe base (Animal)
        this.corPelo = corPelo;
    }

    // Método específico para miar
    public void miar() {
        System.out.println(getNome() + " está miando: Miau Miau!");
    }

    // Sobrescrita do método exibirInfo para incluir a cor do pelo
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor do Pelo: " + corPelo);
    }
}


package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class PetShop {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<Animal> animais = new ArrayList<>();
int opcao;

do {
System.out.println("\nMENU");
System.out.println("1 - Cadastrar Cachorro");
System.out.println("2 - Cadastrar Gato");
System.out.println("3 - Exibir Animais");
System.out.println("4 - Sair");
System.out.print("Escolha uma opção:");
opcao = scanner.nextInt();
scanner.nextLine();

switch (opcao) {
case 1:
System.out.print("Nome do cachorro:");
String nomeCachorro = scanner.nextLine();
System.out.print("Idade do cachorro:");
int idadeCachorro = scanner.nextInt();
scanner.nextLine();
System.out.print("Raça do cachorro: ");
String raca = scanner.nextLine();
animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
System.out.print("Cachorro cadastrado com sucesso!");
break;
case 2:
System.out.print("Nome do gao:");
String nomeGato = scanner.nextLine();
System.out.print("Idade do gato:");
int idadeGato = scanner.nextInt();
scanner.nextLine();
System.out.print("Cor do pelo do gato: ");
String corPelo = scanner.nextLine();
animais.add(new Gato(nomeGato, idadeGato, corPelo));
System.out.print("Gato cadastrado com sucesso!");
break;
case 3:
System.out.println("\n=== Lista de Animais==-");
for(Animal animal: animais) {
animal.exibirInfo();
}
break;
case 4:
System.out.println("Encerrand");
break;
default:
System.out.println("Opção inválida!.");
break;
}
} while (opcao != 4);




}

}