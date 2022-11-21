import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int contador = 0; 
        int soma = 0;    
    
        do {
            System.out.println("Digite um numero: ");  
            numero = scan.nextInt();
            
            soma = soma + numero;
            if (numero > maior) maior = numero;

            contador++;
        } while (contador < 5);
        
        System.out.println("O maior numero é: " + maior);
        System.out.println(("A media dos numeros digitados é " + (soma/5)));
    }

}
