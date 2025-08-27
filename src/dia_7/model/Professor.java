package dia_7.model;

import dia_7.contracts.Avaliavel;
import dia_7.contracts.Trabalhador;

public class Professor extends Pessoa implements Trabalhador, Avaliavel {
    private String disciplina;
    private double salario;
    private double feedback;

    public Professor(String nome, int idade, String disciplina, double salario, double feedback){
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
        this.feedback = feedback;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario){
        if(salario < 0){
            throw new IllegalArgumentException("Salário não pode ser negativo!");
        }

        this.salario = salario;
    }

    @Override
    public void apresentar() {
        System.out.println("Dou aulas de "+ disciplina +" e meu salário é "+ salario +" reais.");
    }

    @Override
    public void trabalhar() {
        System.out.println(nome +" está dando aula ...");
    }

    @Override
    public double avaliarDesempenho() {
        return feedback;
    }
}
