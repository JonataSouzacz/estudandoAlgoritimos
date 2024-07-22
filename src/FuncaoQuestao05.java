import java.util.Scanner;

public class FuncaoQuestao05 {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("\n DIGITE O PRIMEIRO NUMERO: ");
            num1 = scanner.nextInt();

        System.out.print(" DIGITE O SEGUNDO NUMERO: ");    
            num2 = scanner.nextInt();

        //scanner.nextLine();

        int sN = soma(num1, num2);
        System.out.println("\n A SOMA DOS DOIS NUMEROS DIGITADOS É: " + sN + "\n");


    }

    public static int soma(int x, int y) {

        int s = x+y;
        
        return s;

    }

}
