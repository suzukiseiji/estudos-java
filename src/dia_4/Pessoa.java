package dia_4;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Ola! Meu nome é "+ nome +" e tenho "+ idade +" anos.");
    }
}
