import java.text.DecimalFormat;
import java.util.Scanner;

public class FuncaoQuestao07 {

    public static void main(String[] args) {
        
        // CRIAR UMA FUNÇÃO QUE CONVERTA GRAUS PARA RADIANOS.

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double grauCel;

        System.out.print("\n DIGITE O GRAUS: "); grauCel = scanner.nextDouble();
        
        double resultConver = conversor(grauCel);
        System.out.print("\n CONVERSÃO PARA RADIANOS: " + df.format(resultConver) + "\n" );

    }

    public static double conversor (double gC){
        double pi = 3.1415;
        double radianos = gC * pi/180; 

        return radianos;
    }
    
}
