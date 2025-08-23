package dia_5;

public class Professor extends Pessoa {
    String disciplina;
    double salario;

    public Professor(String nome, int idade, String disciplina, double salario){
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void exibirSalario(){
        System.out.println("Nome: "+ nome +" Disciplina: "+ disciplina +" Salario: "+ salario);
    }
}
