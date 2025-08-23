import dia_5.Pessoa;
import dia_5.Funcionario;
import dia_5.Gerente;

public class MainDia5 {
    public static void main(String[] args) {
        Pessoa pessoa_1 = new Pessoa("Seiji", 31);
        pessoa_1.apresentar();

        Funcionario funcionario = new Funcionario("Helio", 31, "Programador", 2500.00);
        funcionario.apresentar();
        funcionario.exibirInfo();

        Gerente gerente = new Gerente("Suzuki", 27, "Gerente de Projetos", 12000.00, "Desenvolvimento");
        gerente.apresentar();
        gerente.exibirInfo();
        gerente.exibirInfoGerente();
    }
}