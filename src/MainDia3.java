import java.util.ArrayList;

public class MainDia3 {
    public static void main(String[] args) {
        String[] nomes = {"Helio", "Seiji", "Suzuki"};

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Nome for: "+ nomes[i]);
        }

        System.out.println("meio que o foreach do PHP abaixo");

        for(String nome : nomes){
            System.out.println("Nome foreach: "+ nome);
        }

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros.get(0));

        for(int numero : numeros){
            System.out.println("Numero: "+ numero);
        }

        // exercicio

        int[] idades = {14, 25, 34, 12, 21};

        for(int idade : idades){
            System.out.println("Idade: "+ idade);
        }

        ArrayList<String> amigos = new ArrayList<>();

        amigos.add("Joao");
        amigos.add("Rafael");
        amigos.add("Meliodas");
        amigos.add("Teste");

        for(String amigo : amigos){
            System.out.println("Amigo: "+ amigo);
        }
    }
}