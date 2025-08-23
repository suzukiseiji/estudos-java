package dia_5;

public class Aluno extends Pessoa {
    String matricula;
    double nota;

    public Aluno(String nome, int idade, String matricula, double nota){
        super(nome, idade);
        this.matricula = matricula;
        this.nota = nota;
    }

    public void exibirNota(){
        System.out.println("Nome: "+ nome +" Nota: "+ nota);
    }
}
