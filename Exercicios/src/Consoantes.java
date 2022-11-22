import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes =new String [6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Digite uma letra ");
            String letraDigitada = scan.next();

            if ( !(letraDigitada.equalsIgnoreCase("a") |
                    letraDigitada.equalsIgnoreCase("e") |
                    letraDigitada.equalsIgnoreCase("i") |
                    letraDigitada.equalsIgnoreCase("o") |
                    letraDigitada.equalsIgnoreCase("u")) )
                 {
                consoantes[count] = letraDigitada;
                quantidadeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
    }

}
