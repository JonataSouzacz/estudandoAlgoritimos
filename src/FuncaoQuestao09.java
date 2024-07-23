import java.util.Scanner;

public class FuncaoQuestao09 {

    public static void main(String[] args) {
        
        //  CRIAR UM ALGORITMO QUE IMPRIMA O MAIOR NUMERO, USANDO UMA FUNÇÃO DO TIPO VOID.

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("\n DIGITE UM NUMERO: "); numeros[i] = scanner.nextInt();
            scanner.nextLine();
        }
        maiorN(numeros);

    }

    public static void maiorN(int[] n){

        int maior=0;

        for (int i = 0; i <n.length; i++) {
            if (n[i]> maior) {
                maior = n[i];
            }
        }
       
        System.out.println("\n MAIOR NUMERO DIGITADO: " + maior);
        System.out.println();
    }
    
}
