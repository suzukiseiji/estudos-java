import dia_5.*;

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

        // ---------- Exercício ----------

        Aluno aluno_1 = new Aluno("João", 14, "123fd", 10);
        Aluno aluno_2 = new Aluno("Maria", 13, "321ad", 4);

        aluno_1.exibirNota();
        aluno_2.exibirNota();

        Professor professor = new Professor("Carlos", 28, "Matemática", 12000.00);

        professor.exibirSalario();
    }
}