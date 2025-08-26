package dia_6;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario){
        super(nome, idade);
        this.setCargo(cargo);
        this.setSalario(salario);
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
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
    public void apresentar() {
        super.apresentar();
        System.out.println("Meu cargo  é "+ cargo +" e recebo "+ salario);
    }

    public void exibirInfo(){
        System.out.println("Nome: "+ this.getNome() +" Cargo: "+ cargo +" Salario: "+ salario);
    }
}
