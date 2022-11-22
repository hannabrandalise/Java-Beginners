public class OrdemIversa {
    public static void main(String[] args) {
        
        int[] vetor = {5, 6, 12, 9, 0, 1};

        //mostrar o vetor:
        int contador = 0;
        
        System.out.print("Vetor ordenado: ");

        while (contador < vetor.length) {
            System.out.print(vetor[contador] + " ");
            contador++;
            
        }
        
        //mostrar a ordem inversa
        System.out.print(" \nVetor em ordem inversa: ");
        
        for(int i = vetor.length-1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    } 
}