import dia_6.*;

import java.util.ArrayList;

public class MainDia6 {
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

        try{
            Pessoa pessoa_erro = new Pessoa("erro", -15);
            pessoa_erro.apresentar();
        }catch(IllegalArgumentException e){
            System.out.println("Erro ao criar Pessoa: "+ e.getMessage());
        }

        // ---------- Exercício ----------
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("João", 21));
        pessoas.add(new Funcionario("Maria", 21, "Limpeza", 2500.00));
        pessoas.add(new Gerente("José Leles", 23, "Gerente da Escola", 7680.00, "Secretaria"));
        pessoas.add(new Aluno("Eduardo Dalabella", 23, "1523ks", 10));
        pessoas.add(new Professor("Carlos Eduardo", 25, "Programação", 100000.00));

        for(Pessoa pessoa : pessoas){
            pessoa.apresentar();
        }

        try{
            Pessoa pessoa_erro = new Funcionario("teste", -33, "Assistente Administrativo", 1200.00);
            pessoa_erro.apresentar();
        }catch(IllegalArgumentException e){
            System.out.println("Erro ao criar Pessoa: "+ e.getMessage());
        }
    }
}