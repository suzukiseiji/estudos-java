package dia_5;

public class Gerente extends Funcionario {
    String setor;

    public Gerente(String nome, int idade, String cargo, double salario, String setor){
        super(nome, idade, cargo, salario);
        this.setor = setor;
    }

    public void exibirInfoGerente(){
        System.out.println("Nome: "+ nome +" Gerente setor: "+ setor +" Salario: "+ salario);
    }
}
