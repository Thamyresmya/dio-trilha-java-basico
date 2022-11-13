import java.util.Locale;
import java.util.Scanner;
/*
         * agencia texto 067-8
         * numero inteiro 1021         * 
         * nome cliente texto thamyres da silva
         * saldo decimal 237.48
         */

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);                 

        System.out.println("Por favor, digite o numero da Agencia: ");
        String conta = scanner.next();
            
        System.out.println("Por favor, digite o numero da Conta: ");
        int agencia = scanner.nextInt();
        
        System.out.println("Digite o Nome do cliente: ");
        String nome = scanner.next(); 

        System.out.println("Digite o sobrenome do cliente: ");
        String sobrenome = scanner.next();        

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola! " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " ja esta disponivel para saque.");
    
    }
}
