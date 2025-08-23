import dia_4.Pessoa;
import dia_4.Carro;

public class MainDia4 {
    public static void main(String[] args) {
        Pessoa pessoa_1 = new Pessoa("Seiji", 31);
        Pessoa pessoa_2 = new Pessoa("Suzuki", 28);

        pessoa_1.apresentar();
        pessoa_2.apresentar();

        Carro carro_1 = new Carro("Sentra", 2020, "Branco");
        Carro carro_2 = new Carro("Corola", 2025, "Preto");

        carro_1.exibirInfo();
        carro_2.exibirInfo();
    }
}