public class FuncaoQuestao01 {
    public static void main(String[] args) {
        
        // ATV - 01 - CRIAR UM ALGORITMO QUE PRODUZA A SAIDA A SEGUIR, USANDO UMA FUNÇÃO DO TIPO VOID.

        sublinhado("*");
        System.out.println("\n ANITA LOPES ");
        sublinhado("#");
        System.out.println("\n GUTO GRACIA ");
        sublinhado("@");
   
    }
    public static void sublinhado(String c){
        for (int i = 0; i <13; i++) {
            System.out.print(c);
        }

    }
}