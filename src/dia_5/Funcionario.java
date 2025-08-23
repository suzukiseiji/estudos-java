package dia_5;

public class Funcionario extends Pessoa {
    String cargo;
    double salario;

    public Funcionario(String nome, int idade, String cargo, double salario){
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirInfo(){
        System.out.println("Nome: "+ nome +" Cargo: "+ cargo +" Salario: "+ salario);
    }
}
