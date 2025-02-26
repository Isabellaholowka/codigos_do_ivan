// A classe Gato herda de Animal
public class Gato extends Animal {
    private String corPelo;

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