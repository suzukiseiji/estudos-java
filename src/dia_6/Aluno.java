package dia_6;

public class Aluno extends Pessoa {
    private String matricula;
    private double nota;

    public Aluno(String nome, int idade, String matricula, double nota){
        super(nome, idade);
        this.setMatricula(matricula);
        this.setNota(nota);
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
        super.apresentar();
        System.out.println("A minha matrícula é "+ matricula);
    }

    public void exibirNota(){
        System.out.println("Nome: "+ this.getNome() +" Nota: "+ nota);
    }
}
