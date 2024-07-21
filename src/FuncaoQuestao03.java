
import java.util.Scanner;

public class FuncaoQuestao03 {
    public static void main(String[] args) {
        

    // ATV - 03 - CRIAR UM ALGORITMO QUE POSSA ENTRAR COM TRES NUMEROS E, PARA CADA UM, IMPRIMIR O DOBRO. USAR DUAS FUNÇÕES.
        
    Scanner scanner = new Scanner(System.in);
    
    
    for (int i = 0; i <5; i++) {
        sublinhado();
        System.out.print("\n DIGITE UM NUMERO: ");
        int num = scanner.nextInt();
        System.out.println("\n DOBRO: " + dobro(num));  
        
    }
     sublinhado();  

}


public static void sublinhado(){

    for (int i = 0; i < 23; i++) {
        System.out.print("*");
    }
}

public static int dobro(int x){
    
    return x*2;
}



}

