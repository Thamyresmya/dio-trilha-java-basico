public class operadores {
    public static void main(String[] args) {
       
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        String concatenacao = "?";

        System.out.println(nomeCompleto + concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println( concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println( concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println( concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println( concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println( concatenacao);

    }
}
