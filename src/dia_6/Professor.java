package dia_6;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(String nome, int idade, String disciplina, double salario){
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if(salario < 0){
            throw new IllegalArgumentException("Salário não pode ser negativo!");
        }

        this.salario = salario;
    }

    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Dou aulas de "+ disciplina +" e meu salário é "+ salario +" reais.");
    }

    public void exibirSalario(){
        System.out.println("Nome: "+ this.getNome() +" Disciplina: "+ disciplina +" Salario: "+ salario);
    }
}
