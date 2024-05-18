
import java.util.Scanner;



public class EstudandoAlgoritimos {
    public static void main(String[] args) throws Exception {
        

        /*  // ATV 01 - IMPRIMA NA TELA A FRASE " É PRECISO FAZER TODOS OS ALGORITIMOS PARA APRENDER"
        System.out.println(" É PRECISO FAZER TODOS OS ALGORITIMOS PARA APRENDER\n");*/

        /*  // ATV 02 - IMPRIMIR SEU NOME
         System.out.println(" JONATA DE SOUZA SILVA\n");*/

        /*  // ATV 03 - CRIAR UM PROGRAMA QUE IMPRIMA UM PRODUTO ENTRE 28 E 43  
          
            int num1 = 28 , num2 = 43 , produto = num1*num2;
            System.out.println(" O PRODUTO ENTRE OS DOIS NUMEROS É: " + produto + "\n");*/

        /*  // ATV 04 - CRIAR ALGORITIMO QUE IMPRIMA A MEDIA ARITMETICA DOS NUMEROS 8,9 E 7.
           
           int num1 = 8, num2 = 9, num3 = 7;
           int media = (num1 + num2 + num3) / 3;
           System.out.println(" A MEDIA DOS TRES NUMEROS É: " + media + "\n");*/
        
        /*  // ATV 05 - LER UM NUMERO INTEIRO E IMPRIMI-LO.
           
           Scanner scanner = new Scanner(System.in);
           System.out.println("DIGITE UM NUMERO INTEIRO: \n");
           int numInteiro = scanner.nextInt();
           System.out.println("\nO NUMERO INTEIRO QUE VOCE DIGITOU É: " + numInteiro + "\n"); */
        
        /*  // ATV 06 - LER DOIS NUMEROS INTEIROS E IMPRIMI-LOS
           
           Scanner scanner = new Scanner(System.in);

           System.out.print("DIGITE O PRIMEIRO NUMERO: ");
           int num = scanner.nextInt();
           System.out.print("DIGITE O SEGUNDO NUMERO: ");
           int num1 = scanner.nextInt();
           
           System.out.println("\nPRIMEIRO NUMERO DIGITADO: "+num+"\n");
           System.out.println("SEGUNDO NUMERO DIGITADO: "+num1+"\n");*/
        
        /*  // ATV 07 - LER UM NUMERO INTEIRO E IMPRIMIR SEU SUCESSOR E SEU ANTECESSOR.

            Scanner scanner = new Scanner(System.in);

            System.out.print("DIGITE UM NUMERO INTEIRO: ");
            int number = scanner.nextInt();

            System.out.println("\nO NUMERO SUCESSOR DO NUMERO DIGITADO É: " + ++number + "\n");
            System.out.println("O NUMERO ANTECESSOR DO NUMERO DIGITADO É: " + (number-2));*/

        /*  // ATV 08 - LER NOME, ENDEREÇO E TELEFONE E IMPRIMIR-LOS.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print("DIGITE SEU NOME: ");
            String nome = scanner.nextLine();

            System.out.print("DIGITE SEU ENDEREÇO: ");
            String ender = scanner.nextLine();

            System.out.print("DIGITE O NUMERO DO SEU TELEFONE: ");
            String tele = scanner.nextLine();

            System.out.println("\nESSES SÃO SEUS DADOS \n");
            System.out.println("NOME: "+ nome);
            System.out.println("ENDEREÇO: "+ ender);
            System.out.println("TELEFONE: "+ tele);*/

        /*  // ATV 09 - LER DOIS NUMEROS INTEIROS E IMPRIMIR A SOMA. ANTES DO RESULTADO, DEVERA APARECER O NOME SOMA.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O PRIMEIRO NUMERO: ");
            int num1 = scanner.nextInt();

            System.out.print(" DIGITE O SEGUNDO NUMERO: ");
            int num2 = scanner.nextInt();

            System.out.println("\n SOMA: " + (num1+num2));*/

        /*  // ATV 10 - LER DOIS NUMEROS INTEIROS E IMPRIMIR O PRODUTO.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O PRIMEIRO NUMERO: ");
            int num1 = scanner.nextInt();

            System.out.print(" DIGITE O SEGUNDO NUMERO: ");
            int num2 = scanner.nextInt();

            System.out.println("\n PRODUTO DOS DOIS NUMEROS É: " + (num1*num2));*/

        /*  // ATV 11 - LER UM NUMERO REAL E IMPRIMIR A TERÇA PARTE DELE.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO: ");
            double number = scanner.nextDouble();

            System.out.println("\n ESSA É A TERÇA PARTE DESSE NUMERO: " + (number/3));*/

        /*  // ATV 12 - ENTRAR COM DOIS NUMEROS REAIS E IMPRIMIR A MEDIA ARITMETICA COM A MENSAGEM "MEDIA" ANTES DO RESULTADO.
            
            double num1 = 3.5 , num2 = 5.5;

            System.out.println(" MEDIA: " + (num1+num2)/2);*/

        /*  // ATV 13 - ENTRAR COM DOIS NUMEROS INTEIROS E IMPRIMIR O DIVIDENDO, DIVISOR, QUOCIENTE E RESTO.

            int num1 = 10, num2 = 3;

            int dividendo = num1;
            int divisor = num2;
            int quociente = num1/num2;
            int resto = dividendo % divisor; // PODE SER FEITO DESTA FORMA TAMBÉM (divisor*quociente - dividendo)*-1;
           

            System.out.println(" DIVIDENDO: " + dividendo);
            System.out.println(" DIVISOR: " + divisor);
            System.out.println(" QUOCIENTE: " + quociente);
            System.out.println(" RESTO: " + resto);*/

        /*  // ATV 14 - ENTRAR COM QUATRO NUMEROS E IMPRIMIR A MEDIA PONDERADA, SABENDO-SE QUE OS PESOS SÃO RESPECTIVAMENTE: 1, 2, 3 E 4.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE SUA PRIMEIRA NOTA: ");
            double nota1 = scanner.nextDouble();

            System.out.print(" DIGITE SUA SEGUNDA NOTA: ");
            double nota2 = scanner.nextDouble();

            System.out.print(" DIGITE SUA TERCEIRA NOTA: ");
            double nota3 = scanner.nextDouble();

            System.out.print(" DIGITE SUA QUARTA NOTA: ");
            double nota4 = scanner.nextDouble();

            double mediaPonderada = (nota1*1 + nota2*2 + nota3*3 + nota4*4)/10;

            System.out.println("\n A MEDIA PONDERADA É: " + mediaPonderada);*/

        /*  // ATV 15 - ENTRAR COM UM ANGULO EM GRAUS E IMPRIMIR: SENO, CO-SENO, TANGENTE, SECANTE, CO-SECANTE E CO-TANGENTE DESTE ANGULO.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM ANGULO EM GRAUS: ");
            double angG = scanner.nextDouble();

            double pi = 3.14;
            double angR = (angG*pi)/180;

            System.out.print("\n SENO: " + Math.sin(angR));
            System.out.print("\n COSSENO: " + Math.cos(angR));
            System.out.print("\n TANGENTE: " + Math.tan(angR));
            System.out.print("\n SECANTE: " + 1/ Math.sin(angR));
            System.out.print("\n COSSECANTE: " + 1/ Math.cos(angR));
            System.out.print("\n COTANGENTE: " + 1/ Math.tan(angR));*/

        /*  // ATV 16 - ENTRAR COM UM NUMERO E IMPRIMIR: NUMERO, QUADRADO E RAIZ QUADRADA.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO: ");
            int num = scanner.nextInt();

            int num2 = 2; 
            double numQuad = Math.pow(num, num2); // MATH.POW (POTENCIAÇÃO)
            double numRaizQuad = Math.sqrt(num);  // MATH.SQRT (RAIZ QUADRADA)

            System.out.println(" NUMERO DIGITADO: " + num);
            System.out.println("\n QUADRARDO DO NUMERO DIGITADO: " + numQuad);
            System.out.println("\n RAIZ QUADRADA DO NUMERO DIGITADO: " + numRaizQuad);*/

        /*  // ATV 17 - FAZER UM ALGORITIMO QUE POSSA ENTRAR COM O SALDO DE UMA APLICAÇÃO E IMPRIMA O NOVO SALDO, CONSIDERANDO O REAJUSTE DE 1%.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O VALOR QUE DESEJA APLICAR NA CONTA PARA QUE POSSA VER O VALOR REAJUSTADO COM 1%: ");
            double valor = scanner.nextDouble();

            double valorReajust = valor/100+valor;

            System.out.println("\n NOVO SALDO COM REAJUSTE: " + valorReajust);*/

        /*  // ATV 18 - QUESTÃO 48 DO LIVRO.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O SALARIO MINIMO: ");
            double salaMin = scanner.nextDouble();

            System.out.print(" DIGITE A QUANTIDADE DE QUILOWATTS:  ");
            double qWatts = scanner.nextDouble();

            double valQuiReais = (salaMin/7)/100;
            double valReaisPg = (qWatts/100)*(salaMin/7);
            double valDescPg = (valReaisPg/10-valReaisPg)*-1;

            System.out.println("\n VALOR EM REAIS DE CADA QUILOWATTS: " + valQuiReais);
            System.out.println("\n VALOR EM REAIS A SER PAGO: " + valReaisPg);
            System.out.println("\n NOVO VALOR A SER PAGO COM 10% DE DESCONTO: " + valDescPg);*/

        /*  // ATV 19 - ENTRAR COM UM NOME E IMPRIMIR: NOME, PRIMEIRO CARACTERE, ULTIMO, DO PRIMEIRO AO TERCEIRO, QUARTO, TODOS MENOS O PRIMEIRO E OS DOIS ULTIMOS.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NOME: ");
            String nome = scanner.nextLine();

            System.out.println("\n NOME: " + nome);
            System.out.println("\n PRIMEIRO CARACTERE: " + nome.substring(0,1));
            System.out.println("\n ULTIMOS CARACTERES: " + nome.substring(3,6));
            System.out.println("\n DO PRIMEIRO ATE O TERCEIRO CARACTERE: " + nome.substring(0,3));
            System.out.println("\n QUARTO CARACTERE: " + nome.substring(3,4));
            System.out.println("\n TODOS MENOS O PRIMEIRO CARACTERE: " + nome.substring(1,6));
            System.out.println("\n OS DOIS ULTIMOS CARACTERES: " + nome.substring(0,5));*/

        /*  // ATV 20 - ENTRAR COM A BASE E A ALTURA DE UM RETANGULO E IMPRIMIR A SEGUINTE SAIDA: PERIMETRO, AREA E A DIAGONAL.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE A BASE DO RETANGULO: ");
            double base = scanner.nextDouble();

            System.out.print(" DIGITE A ALTURA DO RETANGULO: ");
            double altura = scanner.nextDouble();

            double calDiag = (Math.pow(base,2) + Math.pow(altura,2));
            double diagRetr = Math.sqrt(calDiag);

            System.out.println("\n O PERIMETRO DO RETANGULO É: " + (base+altura)*2);
            System.out.println(" A AREA DO RETANGULO É: " + base*altura);
            System.out.println(" A DIAGONAL DO RETANGULO É: " + diagRetr);*/




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        }
}
