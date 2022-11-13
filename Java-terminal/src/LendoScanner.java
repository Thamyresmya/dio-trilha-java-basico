import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class LendoScanner {
    
    public static void main(String[] args) {
        
        try{
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);                 
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double alura = scanner.nextDouble();
       
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura eh " + alura +  " cm ");

        } 
        catch (InputMismatchException e){
            System.err.println("O Campo idade e altura, precisam ser numericos, e utilize o ponto");
        }
    }
}
