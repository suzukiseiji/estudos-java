package dia_6;

public class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, int idade, String cargo, double salario, String setor){
        super(nome, idade, cargo, salario);
        this.setSetor(setor);
    }

    public String getSetor(){
        return setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Sou o gerente do setor "+ setor);
    }

    public void exibirInfoGerente(){
        System.out.println("Nome: "+ this.getNome() +" Gerente setor: "+ setor +" Salario: "+ this.getSalario());
    }
}
