
import java.text.DecimalFormat;
import java.util.Scanner;

public class FuncaoQuestao04 {
  
    public static double media(Double[] notas){
        double soma=0;

        for (int i = 0; i <notas.length; i++) {
            soma+= notas[i];
        }
            return soma/notas.length;
    }

    public static void main(String[] args) {
        

        // ATV - 04 - CRIAR UM ALGORITMO QUE RECEBA NOTAS DE TRES PROVAS E CAUCULAR A SUA MEDIA, MAS UTILIZANDO UMA FUNÇÃO.

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Double[] notas = new Double[3];
        
        

        for (int i = 0; i <3; i++) {
            System.out.print(" DIGITE NOTA " + (i+1) + " : ");
            notas[i] = scanner.nextDouble();

        }
        double mediaNotas = media(notas);
        System.out.println("\n MEDIA ARITMETICA: " + df.format(mediaNotas));




    }






}
