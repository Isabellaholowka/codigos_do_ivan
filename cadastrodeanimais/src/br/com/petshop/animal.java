package br.com.petshop;

public class animal {
	private String nome;
	private int idade;

	public animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void exibirInfo() {
		System.out.println("NOME:" + nome +",IDADE" + idade + "anos");
	}
}
