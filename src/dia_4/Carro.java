package dia_4;

public class Carro {
    String modelo;
    int ano;
    String cor;

    public Carro(String modelo, int ano, String cor){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirInfo(){
        System.out.printf("%nModelo: %s, Ano: %d, Cor: %s", modelo, ano, cor);
    }
}
