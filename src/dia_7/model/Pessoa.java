package dia_7.model;

public abstract class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade){
        if(idade < 0){
            throw new IllegalArgumentException("Idade não pode ser negativa!");
        }

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        if(idade < 0){
            throw new IllegalArgumentException("Idade não pode ser negativa!");
        }

        this.idade = idade;
    }

    public void dizerOla(){
        System.out.println("Ola, meu nome é "+ nome);
    }

    public abstract void apresentar();
}
