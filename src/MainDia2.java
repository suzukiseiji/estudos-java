public class MainDia2 {
    public static void main(String[] args) {
        int idade = 17;

        if(idade >= 18){
            System.out.println("Pode entrar.");
        }else{
            System.out.println("Menor de idade.");
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Número for: "+ i);
        }

        int contador = 0;

        while(contador < 3){
            System.out.println("Número while: "+ contador);

            contador++;
        }
    }
}