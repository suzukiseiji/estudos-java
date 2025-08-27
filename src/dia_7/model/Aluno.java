package dia_7.model;

import dia_7.contracts.Avaliavel;

public class Aluno extends Pessoa implements Avaliavel {
    private String matricula;
    private double nota;
    private double desempenho;

    public Aluno(String nome, int idade, String matricula, double nota, double desempenho){
        super(nome, idade);
        this.matricula = matricula;
        this.nota = nota;
        this.desempenho = desempenho;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public void apresentar() {
        System.out.println("A minha matrícula é "+ matricula);
    }

    public void exibirNota(){
        System.out.println("Nome: "+ nome +" Nota: "+ nota);
    }

    @Override
    public double avaliarDesempenho() {
        return desempenho;
    }
}
