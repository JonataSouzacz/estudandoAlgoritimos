
import java.util.Scanner;



public class EstudandoAlgoritimos {
    public static void main(String[] args) throws Exception {
        
           // PARTE 01 - VARIÁVEL, EXPRESSÕES, FUNÇÕES, ATRIBUIÇÃO, ENTRADA E SAÍDA. 
        

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

        /*  // ATV 21 - ENTRAR COM O RAIO DE UM CIRCULO E IMPRIMIR A AREA E O PERIMETRO.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O RAIO DO CIRCULO: ");
            double raioCirculo = scanner.nextDouble();

            double peri = 2 * 3.14 * raioCirculo;
            double area = 3.14 * Math.pow(raioCirculo,2);

            System.out.println("\n PERIMETRO: " + peri);
            System.out.println("\n AREA: " + area);*/

        /*  // ATV 22 - ENTRAR COM O LADO DE UM QUADRADO E IMPRIMIR O PERIMETRO, AREA E DIAGONAL.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O TAMANHO DE UM LADO DO QUADRADO: ");
            double ladoQuad = scanner.nextDouble();

            double area = ladoQuad*ladoQuad;
            double peri = ladoQuad * 4;
            double diag = ladoQuad* Math.sqrt(2);

            System.out.println("\n PERIMETRO: " + peri);
            System.out.println(" AREA: " + area);
            System.out.println(" DIAGONAL: " + diag);*/
    
        /*  // ATV 23 - ENTRAR COM OS LADOS A, B E C DE UM PARALELEPIPEDO. CALCULAR E IMPRIMIR A DIAGONAL.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O LADO A: ");
            double ladoA = scanner.nextDouble();

            System.out.print(" DIGITE O LADO B: ");
            double ladoB = scanner.nextDouble();

            System.out.print(" DIGITE O LADO C: ");
            double ladoC = scanner.nextDouble();

            double diag = Math.sqrt(2)+(Math.pow(ladoA,2) + Math.pow(ladoB,2) + Math.pow(ladoC,2));

            System.out.println(" DIAGONAL DO PARALELEPIPEDO É: " + Math.sqrt(diag));*/

        /*  // ATV 24 - CRIAR UM ALGORITIMO QUE CALCULE E IMPRIMA A AREA DE UM TRIANGULO.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE A BASE: ");
            double base = scanner.nextDouble();

            System.out.print(" DIGITE A ALTURA: ");
            double alt = scanner.nextDouble();

            double area = (base*alt)/2;

            System.out.println("\n AREA DO TRIANGULO: " + area );*/

    
            // PARTE 2 -  ESTRUTURAS DE SELEÇÃO

        /*  // ATV 01 - ENTRAR COM UM NUMERO E IMPRIMI-LO CASO SEJA MAIOR QUE 20.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print("\n DIGITE UM NUMERO: ");
            int num = scanner.nextInt();

            if (num>20){
                System.out.println(" O NUMERO DIGITADO É: " + num);
            }
            else {
                 System.out.println(" O NUMERO DIGITADO É MENOR QUE 20!\n");
                }*/
    
        /*  // ATV 02 - CONSTRUIR UM ALGORITMO QUE LEIA DOIS VALORES NUMÉRICOS INTEIROS E EFETUE A ADIÇÃO; CASO O RESULTADO SEJA MAIOR QUE 10, APRESENTA-LO.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print("\n DIGITE O PRIMEIRO NUMERO: ");
            int num1 = scanner.nextInt();    

            System.out.print("\n DIGITE O SEGUNDO NUMERO: ");
            int num2 = scanner.nextInt();
            
            int soma = num1+num2;

            if (soma > 10) {
                System.out.println("\n SOMA: " + soma);
            }
            else {
                System.out.println("\n A SOMA É MENOR QUE 10!\n");
            }*/
            
        /*  // ATV 03 - QUESTÃO 92 DO LIVRO.

            Scanner scanner = new Scanner(System.in);
            
            System.out.print("\n DIGITE O PRIMEIRO NUMERO: ");
            int num1 = scanner.nextInt();

            System.out.print("\n DIGITE O SEGUNDO NUMERO: ");
            int num2 = scanner.nextInt();

            int soma = num1+num2;

            if (soma>20) {
                System.out.println("\n SOMA: " + (soma+8));
            }
            if (soma<=20) {
                System.out.println("\n SOMA: " + (soma-5));
            }*/
    
        /*  // ATV 04 - ENTRAR COM UM NUMERO E IMPRIMIR A RAIZ QUADRADA DO NUMERO CASO ELE SEJA POSITIVO E O QUADRADO DO NUMERO SE ELE FOR NEGATIVO.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO: ");
            double num = scanner.nextDouble();

            if (num>0) {
                System.out.println(" RAIZ DO NUMERO: " + Math.sqrt(num));
            }
            else {
                System.out.println(" QUADRADO DO NUMERO: " + Math.pow(num,2));
            }*/
    
        /*  // ATV 05 - ENTRAR COM UM NUMERO E IMPRIMIR UMA DAS MENSAGENS " É MULTIPLO DE 3 OU NÃO É MULTIPLO DE 3".

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO: ");
            int num = scanner.nextInt();
            
            if (num%3 == 0) {
                System.out.println(" É MULTIPLO DE 3!");
            }
            else{
                System.out.println(" NÃO É MULTIPLO DE 3!");
            }*/
            
        /*  // ATV 06 - ENTRAR COM UM NUMERO E INFORMAR SE ELE É OU NÃO DIVISIVEL POR 5.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO: ");
            int num = scanner.nextInt();

            if (num%5 == 0) {
                System.out.println(" É DIVISIVEL POR 5!");
            }
            else {
                System.out.println(" NÃO É DIVISIVEL POR 5!");
            }*/

        /*  // ATV 07 - ENTRAR COM UM NUMERO E INFORMAR SE ELE É DIVISIVEL POR 3 E POR 7.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO: ");
            int num = scanner.nextInt();

            if (num%3==0 && num%7==0) {
                System.out.println(" É DIVISIVEL POR 3 E POR 7!");
            }
            else {
                System.out.println(" NÃO É DIVISIVEL POR 3 E POR 7!");
            }*/

        /*  // ATV 08 - ENTRAR COM UM NUMERO E INFORMAR SE ELE É DIVISIVEL POR 10, POR 5, POR 2 OU SE NÃO É DIVISIVEL POR NENHUM DESSES.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO: ");
            int num = scanner.nextInt();

            if (num%10==0) {
                System.out.println(" É DIVISIVEL POR 10!");
            }
            if (num%5==0) {
                System.out.println(" É DIVISIVEL POR 5!");
            }
            if (num%2==0) {
                System.out.println(" É DIVISIVEL POR 2!");
            }
            else if (num%10!=0 && num%5!=0 && num%2!=0) {
                System.out.println(" NÃO É DIVISIVEL POR NENHUM!");
            }*/

        /*  // ATV 09 - QUESTÃO 98 DO LIVRO.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE SEU SALARIO: ");
            double salBrut = scanner.nextDouble();

            System.out.print(" DIGITE O VALOR DA PRESTAÇÃO QUE DESEJA PAGAR PARA QUE SEJA ANALISADO E SE REALMENTE SERÁ LIBERADO: ");
            double valPrest = scanner.nextDouble();

            double porcent = salBrut/100*30;
                
            if (valPrest<=porcent) {
                System.out.println(" SEU CREDITO FOI LIBERADO!");
            }
            else {
                System.out.println(" INFELIZMENTE SEU CREDITO NÃO FOI LIBERADO!");
            }*/

        /*  // ATV 10 - LER UM NUMERO INTEIRO DE 3 CASAS DECIMAIS E IMPRIMIR SE O ALGARISMO DA CASA DAS CENTENAS É PAR OU IMPAR.
            
         Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO COM 3 CASAS DECIMAIS: ");
            int num = scanner.nextInt();

            String numConvert = Integer.toString(num);
            String selectNum = numConvert.substring(0,1);
            int digito1 = Integer.parseInt(selectNum);

            if (digito1%2==0) {
                System.out.println(" É PAR ");
            }
            else{
                System.out.println(" É IMPAR ");
            }

            // FORMA MAIS FACIL

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO COM 3 CASAS DECIMAIS: ");
            int num = scanner.nextInt();

            int cent = num/100;

            if (cent%2==0) {
                System.out.println(" É PAR ");
            }
            else{
                System.out.println(" É IMPAR ");
            }*/
        
        /*  // ATV 11 - CONSTRUIR UM ALGORITMO QUE INDIQUE SE O NUMERO DIGITADO ESTA COMPREENDIDO ENTRE 20 E 90 OU NÃO.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO: ");
            int num = scanner.nextInt();

            if (num>=20 && num<=90) {
                System.out.println(" O NUMERO ESTA ENTRE 20 E 90");
            }
            else{
                System.out.println(" O NUMERO NÃO ESTA ENTRE 20 E 90");
            }*/

        /*  // ATV 12 - ENTRAR COM O ANO DE NASCIMENTO DE UMA PESSOA E E O ANO ATUAL. IMPRIMIR A IDADE DA PESSOA. NÃO SE ESQUEÇA DE VERIFICAR SE O ANO DE NASCIMENTO É UM ANO VALIDO.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O ANO DE NASCIMENTO: ");
            int anoNasc = scanner.nextInt();

            System.out.print(" DIGITE O ANO ATUAL: ");
            int anoAtual = scanner.nextInt();

            int idade = anoNasc-anoAtual;
            System.out.println(" IDADE: " + idade*-1);

            if (anoAtual>anoNasc) {
                System.out.println("ANO DE NASCIMENTO VÁLIDO!");
            }
            else {
                System.out.println(" ANO DE NASCIMENTO INVALIDO!");
            }*/

        /*  // ATV 14 - QUESTÃO 104 DO LIVRO.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE SEU NOME: ");
            String nome = scanner.nextLine();

            System.out.print(" DIGITE SUA IDADE: ");
            int idade = scanner.nextInt();

            System.out.print(" DIGITE SEU SEXO (F)FEMININO OU (M)MASCULINO: ");
            String sexo = scanner.next();

            // equals.() ----- USADO PARA VERIFICAR SE OS DOIS OBJETOS SÃO IGUAIS.

            if (idade<25 && sexo.equals("F") || sexo.equals("f")  ) {
                System.out.println(" ACEITA! ");
            }
            else{
                System.out.println(" NÃO ACEITA! ");
            }*/

        /*  // ATV 15 - ENTRAR COM A SIGLA DO ESTADO DE UMA PESSOA E IMPRIMIR UMA DAS MENSAGENS: *CARIOCA * PAULISTA * MINEIRO *OUTROS ESTADOS. 

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE A SIGLA DO ESTADO: ");
            String sigla = scanner.next();

            if (sigla.equals("RJ") || sigla.equals("rj")) {
                System.out.println(" CARIOCA!");
            }
            else if (sigla.equals("SP") || sigla.equals("sp")) {
                System.out.println(" PAULISTA!");
            }
            else if (sigla.equals("MG") || sigla.equals("mg")) {
                System.out.println(" MINEIRO!");
            }
            else{
                System.out.println(" OUTROS ESTADOS!");
            }*/

            // ATV 16 - ENTRAR COM UM NOME E IMPRIMI-LO SE O PRIMEIRO CARACTERE FOR A LETRA "A" (CONSIDERAR LETRA MINUSCULA OU MAIUSCULA).

            Scanner scanner = new Scanner (System.in);

            System.out.print(" DIGITE UM NOME: ");
            String nome = scanner.next();

            String pLetraA = nome.substring(0,1);

            if (pLetraA.equals("A") || pLetraA.equals("a")) {
                System.out.println(nome);
            }
            












    
    
    
    
    
    
    
        }
}
