public class Relacional {
    
    public static void main(String[] args) {  
        
        String nomeUm = "GLEISSON";
        String nomeDois = new String("GLEISSON");

        System.out.println(nomeUm == nomeDois);

        /*para objetos == mais recomendado*/
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("a condicao eh vredadeira");
        }

        System.out.println("numero1 eh igual ao numero2? : " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 eh difernete ao numero2? : " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero1 eh maior ao numero2? : " + simNao);
    }
}
