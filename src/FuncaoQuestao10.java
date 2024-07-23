import java.util.Scanner;


public class FuncaoQuestao10 {
    

    public static void main(String[] args) {
        
        // QUESTÃO 466 DO LIVRO.

        Scanner scanner = new Scanner(System.in);

        int numMes;

        System.out.print("\n DIGITE UM NUMERO ENTRE 1 E 4: "); numMes = scanner.nextInt();
        System.out.println();
        mesCorrespondente(numMes);
        System.out.println();

    }

    public static void mesCorrespondente(int n){

       if (n == 1) {
          System.out.println( " CORRESPONDE AO MES DE JANEIRO! ");
       }else if (n == 2) {
          System.out.println( " CORRESPONDE AO MES DE FEVEREIRO! ");  
       }else if (n == 3) {
          System.out.println( " CORRESPONDE AO MES DE MARÇO! ");
       }else if (n == 4) {
          System.out.println( " CORRESPONDE AO MES DE ABRIL! ");
       }else{
          System.out.println( " NUMERO INVALIDO! ");  
       }


    }
}
