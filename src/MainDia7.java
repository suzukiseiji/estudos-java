import dia_7.contracts.Avaliavel;
import dia_7.model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainDia7 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Helio", 27, "abf312", 1.00, 6);
        Professor professor = new Professor("Suzuki", 31, "Arquitetura de Projetos", 12000.00, 1);
        Gerente gerente = new Gerente("Jhon", 38, 24000.00, "Financeiro");

        aluno.dizerOla();
        aluno.apresentar();

        professor.dizerOla();
        professor.apresentar();
        professor.trabalhar();

        gerente.dizerOla();
        gerente.apresentar();
        gerente.trabalhar();

        // ---------- Exercício ----------

        ArrayList<Avaliavel> avaliacoes = new ArrayList<>();

        avaliacoes.add(new Aluno("João", 14, "1234f", 10, 8));
        avaliacoes.add(new Professor("Carlos", 28, "Redes", 10000.00, 10));

        for(Avaliavel avaliacao : avaliacoes){
            System.out.println("Desempenho : "+ avaliacao.avaliarDesempenho());
        }
    }
}