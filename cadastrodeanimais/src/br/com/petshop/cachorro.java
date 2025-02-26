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