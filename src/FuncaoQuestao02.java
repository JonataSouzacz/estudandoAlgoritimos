
import java.util.Scanner;


public class FuncaoQuestao02 {
    public static void main(String[] args) {
        
    // ATV - 02 - CRIAR UM ALGORITMO QUE POSSA ENTRAR COM TRES NUMEROS E, PARA CADA UM, IMPRIMIR O DOBRO. USAR UMA FUNÇÃO QUE RETORNE VALOR.

    Scanner scanner = new Scanner(System.in);

    int num;

    for (int i = 0; i <3; i++) {
        System.out.print("\n DIGITE UM NUMERO: ");
        num = scanner.nextInt();
        System.out.println(" DOBRO: " + dobro(num));
    }

    }
    public static int dobro(int x){

        return x*2;
    }
}
