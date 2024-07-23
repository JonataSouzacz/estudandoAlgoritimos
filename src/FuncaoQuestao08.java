import java.text.DecimalFormat;
import java.util.Scanner;

public class FuncaoQuestao08 {
    

    public static void main(String[] args) {
        
        // CRIAR UMA FUNÇÃO QUE CONVERTA RADIANOS PARA GRAUS.

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double radiano;

        System.out.print("\n DIGITE O RADIANO: "); radiano = scanner.nextDouble();
        
        double grausConvert = conversor(radiano);
        System.out.println("\n CONVERSÃO PARA GRAUS: " + df.format(grausConvert));

    }

    public static double conversor(double r){
        double pi = 3.14;

        double graus = r * 180/pi;

        return graus;
    }
}
