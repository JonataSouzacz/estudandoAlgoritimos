import java.util.Scanner;


public class FuncaoQuestao06 {
    
    public static void main(String[] args) {

        // QUESTÃO FEITA SEM ESTA NO LIVRO. APRESENTAÇÃO COM VOID.
        
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        double num3;

        System.out.print("\n DIGITE O PRIMEIRO VALOR: ");
        num1 = scanner.nextDouble();
        System.out.print(" DIGITE O SEGUNDO VALOR: ");
        num2 = scanner.nextDouble();
        System.out.print(" DIGITE O TERCEIRO VALOR: ");
        num3 = scanner.nextDouble();
        scanner.nextLine();
        soma(num1,num2,num3);
        
    }

    public static void soma(double  x,double  y,double  z){
        double s = x+y+z;
        System.out.println("\n A SOMA DO 3 NUMEROS DIGITADOS É: " + s + "\n");
    }
}
