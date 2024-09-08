import java.util.Scanner;
import java.util.Locale;

public class Teste {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();


        System.out.println("Sua altura é " + altura);

        System.out.println("Seu nome é " + nome);

        System.out.println("Seu sobrenome é " + sobrenome);



    }
}
