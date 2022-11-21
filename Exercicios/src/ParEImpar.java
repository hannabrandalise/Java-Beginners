import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros; 
        int numero;
        int contador = 0;  
        int quantidadePares =0, quantidadeImpares=0; 
        
        System.out.println("Quantidade de numeros a ser digitada: ");
        quantidadeNumeros = scan.nextInt();
        
        do {
            System.out.println("Digite um numero ");
            numero = scan.nextInt();

            if(numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            contador++;

        } while (contador < quantidadeNumeros);
    
        System.out.println("Quantidade de numeros pares digitada: " + quantidadePares);
        System.out.println("Quantidade de numeros impares digitada: " + quantidadeImpares);
    }
}

