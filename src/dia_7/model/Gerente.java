package dia_7.model;

import dia_7.contracts.Trabalhador;

public class Gerente extends Pessoa implements Trabalhador{
    protected String setor;
    protected double salario;

    public Gerente(String nome, int idade, double salario, String setor){
        super(nome, idade);
        this.salario = salario;
        this.setor = setor;
    }

    public String getSetor(){
        return setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        if(salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo!");
        }

        this.salario = salario;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o gerente do setor "+ setor);
    }

    @Override
    public void trabalhar() {
        System.out.println(nome +" está trabalhando ...");
    }

    public void exibirInfoGerente() {
        System.out.println("Nome: "+ nome +" Gerente setor: "+ setor +" Salario: "+ this.getSalario());
    }
}
