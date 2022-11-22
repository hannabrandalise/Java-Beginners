import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual numero deseja saber o fatorial? ");
        int numero = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(numero + "! = ");
        for (int i = numero; i >= 1; i--) {
            multiplicacao = (multiplicacao * i);    
        }

        System.out.println("O fatorial de " + numero + " é " + multiplicacao);
    }
}
