import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota: ");
        nota = scan.nextInt();

        while(nota<0 || nota > 10) {
            System.out.println("Nota inválida, digite valor entre 0 e 10");
            nota = scan.nextInt();
        }
    }
}

