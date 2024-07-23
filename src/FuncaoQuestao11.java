
import java.util.Scanner;


public class FuncaoQuestao11 {
    
    public static void main(String[] args) {
        
        // CRIAR UM ALGORITMO QUE CALCULE O FATORIAL DE UM NUMERO, USANDO UMA FUNÇÃO QUE RECEBA UM VALOR E RETORNE O FATORIAL DESSE NUMERO.

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.print(" DIGITE UM NUMERO: "); num = scanner.nextInt();
        
        int numF = fatorial(num) ; 

        System.out.println(" FATORIAL DO NUMERO DIGITADO É: " + numF);

    }

    public static int fatorial (int n){

        int soma = n;
        for (int i = 1; i <n; i++) {
            soma = soma*i;
            
        }
        
        int calcFatorial = soma;

        return calcFatorial;
    }

}
