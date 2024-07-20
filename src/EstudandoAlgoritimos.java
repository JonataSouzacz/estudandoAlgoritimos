





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

        /*  // ATV 24 - CRIAR UM ALGORITMO QUE CALCULE E IMPRIMA A AREA DE UM TRIANGULO.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE A BASE: ");
            double base = scanner.nextDouble();

            System.out.print(" DIGITE A ALTURA: ");
            double alt = scanner.nextDouble();

            double area = (base*alt)/2;

            System.out.println("\n AREA DO TRIANGULO: " + area );*/

    
            // PARTE 2 -  ESTRUTURAS DE SELEÇÃO; IF, ELSE, ELSE IF E SWITH.

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

        /*  // ATV 16 - ENTRAR COM UM NOME E IMPRIMI-LO SE O PRIMEIRO CARACTERE FOR A LETRA "A" (CONSIDERAR LETRA MINUSCULA OU MAIUSCULA).

            Scanner scanner = new Scanner (System.in);

            System.out.print(" DIGITE UM NOME: ");
            String nome = scanner.nextLine();

            String pLetraA = nome.substring(0,1);

            if (pLetraA.equals("A") || pLetraA.equals("a")) {
                System.out.println(nome);
            }*/
            
        /*  // ATV 17 - ENTRAR COM O NOME DE UMA PESSOA E SÓ IMPRIMI-LO SE O PRENOME FOR JOSÉ.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE NOME E SOBRENOME: ");
            String nome = scanner.nextLine();

            String primeiroNome = nome.substring(0,4);
            String segundoNome = nome.substring(5);
            
            if (primeiroNome.equals("JOSE") || primeiroNome.equals("jose")) {
                System.out.println(primeiroNome + " " + segundoNome);
            }*/
            
        /*  // ATV 18 - IDEM AO ANTERIOR, POREM CONSIDERAR: JOSE, Jose ou jose.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE NOME E SOBRENOME: ");
            String nome = scanner.nextLine();

            String primeiroNome = nome.substring(0,4);
            String segundoNome = nome.substring(5);
            
            if (primeiroNome.equals("JOSE") || primeiroNome.equals("jose") || primeiroNome.equals("Jose") ) {
                System.out.println(primeiroNome + " " + segundoNome);
            }*/

        /*  // ATV 19 - CRIAR UM ALGORITMO QUE LEIA DOIS NUMEROS E IMPRIMIR UMA MENSAGEM DIZENDO SE SÃO IGUAIS OU DIFERENTES.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O PRIMEIRO NUMERO: ");
            int num1 = scanner.nextInt();

            System.out.print(" DIGITE O SEGUNDO NUMERO: ");
            int num2 = scanner.nextInt();

            if (num1==num2) {
                System.out.println(" SÃO IGUAIS! ");
            }
            else {
                System.out.println(" SÃO DIFERENTES! ");
            }*/

        /*  // ATV 20 - ENTRE COM DOIS NUMEROS E IMPRIMIR O MAIOR NUMERO(SUPONHA NUMEROS DIFERENTES).

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O PRIMEIRO NUMERO: ");
            int num1 = scanner.nextInt();

            System.out.print(" DIGITE O SEGUNDO NUMERO: ");
            int num2 = scanner.nextInt();

            if (num1>num2) {
                System.out.println(" O PRIMEIRO NUMERO É MAIOR: " + num1);
            }
            else {
                System.out.println(" O SEGUNDO NUMERO É MAIOR: " + num2);
            }*/
           
            // PARTE 03 - ESTRUTURA DE REPETIÇÃO: FOR, WHILE E DO WHILE.

        /*  // ATV 01 - IMPRIMIR TODOS OS NUMEROS DE 1 ATÉ 100.

            int a;

            for (a = 1; a<=100; a++) {
                System.out.println(a);
            }*/

        /*  // ATV 02 - IMPRIMIR TODOS OS NUMEROS DE 100 ATÉ 1.

            int a;

            for ( a = 100; a >=1 ; a--) {
                System.out.println(a);
            }*/
            
        /*  // ATV 03 - IMPRIMIR OS 100 PRIMEIROS PARES.

            int a;
            for (a = 0; a <=200; a++) {
                System.out.println(a++);
            }*/

        /*  // ATV 04 - IMPRIMIR OS MULTIPLOS DE 5, NO INTERVALO DE 1 ATÉ 500.
           
            int a;
            for ( a = 0; a <=100; a++) {
                System.out.println(a*5);
            }*/
            
        /*  // ATV 05 - IMPRIMIR O QUADRADO DOS NUMEROS DE 1 ATE 20.

            for (int i = 1; i <=20; i++) {
                System.out.println(Math.pow(i, 2));
            }*/

        /*  // ATV 06 - CRIAR UM ALGORITMO QUE IMPRIMA OS NUMEROS PARES NO INTERVALO DE 1 A 600.

            for (int i = 0; i <=600; i++) {
                System.out.println(i++);
            }*/

        /*  // ATV 07 - CRIAR UM ALGORITMO QUE IMPRIMA OS NUMEROS DE 120 A 300.

            for ( int i = 120; i<=300;i++){
                System.out.println(i);
            }*/

        /*  // ATV 08 - CRIAR UM ALGORITMO QUE IMPRIMA TODOS OS NUMEROS DE 1 A 100 E A SOMA DELES.

            int a;
            int soma = 0;

            for ( a = 1; a<=100; a++) {
                System.out.println(a);
                soma = soma+a;
                
            }
            System.out.println(" SOMA DOS NUMEROS: " + soma);*/

        /*  // ATV 09 - ENTRAR COM 10 NUMEROS E IMPRIMIR A METADE DE CADA NUMERO.
            
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <=10; i++) {
                System.out.print(i+"- "+" DIGITE UM NUMERO: ");
                double numero = scanner.nextDouble();
                System.out.println(" METADE DO NUMERO " +numero+" É: "+numero/2+"\n");
            }*/
            
        /*  // ATV 10 - ENTRAR COM 10 NUMEROS E IMPRIMIR O QUADRADO DE CADA NUMERO.

            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <=10; i++) {
                System.out.print(i+"- "+ " DIGITE UM NUMERO: ");
                double num = scanner.nextDouble();

                System.out.println("    O QUADRADO DESSE NUMERO É: " + Math.pow(num,2)+"\n");
            }*/
            
        /*  // ATV 11 - ENTRAR COM 15 NUMEROS E IMPRIMIR A RAIZ QUADRADA DE CADA NUMERO.

            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <=15; i++) {
                System.out.print(i+"- "+ " DIGITE UM NUMERO: ");
                double num = scanner.nextDouble();

                System.out.println("    A RAIZ QUADRADA DESSE NUMERO É: " + Math.sqrt(num)+"\n");
            }*/

        /*  // ATV 12 - ENTRAR COM 4 NUMEROS E IMPRIMIR O CUBO E A RAIZ CÚBICA DE CADA NUMERO.

            Scanner scanner =new Scanner(System.in);

            for (int i = 1; i <=4; i++) {
                System.out.print("\n"+i+"- "+" DIGITE UM NUMERO: ");
                double num = scanner.nextDouble();

                System.out.print("\n CUBO DO NUMERO "+num+" É: "+Math.pow(num,3)+"\n");
                System.out.print(" RAIZ CÚBICA DO NUMERO "+num+" É: "+Math.cbrt(num)+"\n");
            }*/

        /*  // ATV 13 - QUESTÃO 187 DO LIVRO.

            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <=5; i++) {

                System.out.print("\n"+" DIGITE A BASE: ");
                int base = scanner.nextInt();

                System.out.print(" DIGITE O EXPOENTE: ");
                int exp = scanner.nextInt();

                if (exp>1 && base>=2) {
                    System.out.println(" O RESULTADO É: "+Math.pow(base, exp)+"\n");
                }
                else {
                    System.out.println(" NÃO É COMPATIVEL COM O QUE FOI PEDIDO!");
                }
            }*/

        /*  // ATV 14 - QUESTÃO 188 DO LIVRO.

            for (int i = 1; i <=20; i++) {

                System.out.print(" POLEGADAS: "+i);
                System.out.print(" CENTIMETROS: "+i*2.54+"\n");
            }*/

        /*  // ATV 15 - QUESTÃO 189 DO LIVRO.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O LIMITE SUPERIOR: ");
            int limSup = scanner.nextInt();

            System.out.print(" DIGITE O LIMITE INFERIOR: ");
            int limInf = scanner.nextInt();

            System.out.print(" DIGITE O DECREMENTO: ");
            int decre = scanner.nextInt();

            System.out.println("\n LIMITE SUPERIOR: "+limSup+", "+"LIMITE INFERIOR: "+limInf+", "+"DECREMENTO: "+decre+"\n");
            
            int celsLimSup = (limSup-32)* 5/9;
            int celsLimInf = (limInf-32)* 5/9;
            int celsDecre = (decre-32)* 5/9;

            System.out.print(" FAHRENHEIT: "+limSup + " EM" +" CELSIUS: " + celsLimSup+"\n"); 
            System.out.print(" FAHRENHEIT: "+limInf + " EM" +" CELSIUS: " + celsLimInf+"\n"); 
            System.out.print(" FAHRENHEIT: "+decre + " EM" +" CELSIUS: " + celsDecre+"\n");*/
             
        /*  // ATV 16 - ENTRAR COM UM NOME, IDADE E SEXO DE 20 PESSOAS. IMPRIMIR O NOME SE A PESSOA FOR DO SEXO MASCULINO E TIVER MAIS DE 21 ANOS.
          
            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <=20; i++) {
            System.out.print("\n DIGITE SEU NOME: ");
            String nome = scanner.nextLine();  

            System.out.print(" DIGITE SUA IDADE: ");
            int idade = scanner.nextInt();

            System.out.print(" DIGITE SEU SEXO: ");
            String sexo = scanner.next();
            scanner.nextLine();
            

            if (sexo.equals("M") || sexo.equals("m") && idade>21) {
                System.out.println(" VOCE ESTA NOS CONFORMES " + nome + ", PARABÉNS!");
            }
            else {
                System.out.println(" VOCE NÃO ESTA NOS CONFORMES " + nome + ", INFELIZMENTE!");
            }
           
          }*/
        
        /*  // ATV 17 - QUESTÃO 191 DO LIVRO.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE O LIMITE SUPERIOR DO INTERVALO: ");
            int numSup = scanner.nextInt();

            System.out.print(" DIGITE O INCREMENTO: ");
            int numIncre = scanner.nextInt();

            for (int i = 0; i <=numSup; i+=numIncre) {
                System.out.print(" SAÍDA: "+ i);
                
            }*/

        /*  // ATV 18 - QUESTÃO 192 DO LIVRO

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO LIMITE: ");
            int numLimite = scanner.nextInt();

            for (int i = 1; i <= numLimite-1; i+=2) {
                System.out.println(" SAÍDA: "+i);
            }*/
            
        /*  // ATV 19 - CRIAR UM ALGORITMO QUE LEIA UM NUMERO QUE SERVIRÁ PARA CONTROLAR OS NUMEROS PARES QUE SERÃO IMPRESSOS A PARTIR DE 2.

            Scanner scanner = new Scanner(System.in);

            System.out.print( " DIGITE O NUMERO DE PARES QUE DESEJA IMPRIMIR: ");
            int num = scanner.nextInt();
            int numVezes = num*2;
            
            for (int j = 2; j <=numVezes; j+=2) {

                System.out.println(" SAÍDA: " +j);
              
            
            }*/
                
        /*  // ATV 20 - CRIAR UM ALGORITMO QUE IMPRIMA A SOMA DOS NUMEROS PARES ENTRE 25 E 200.

            int soma=0;

            for (int i = 26; i <=198; i+=2) {
                soma=soma+i;
                   
            }
           
            System.out.println(soma);*/
            
        /*  // ATV 21 - ENTRAR COM NUMEROS E IMPRIMIR O TRIPLO DE CADA NUMERO. O ALGORITMO ACABA QUANDO ENTRAR O NUMERO -999.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO OU -999 PARA FINALIZAR: ");
            int num = scanner.nextInt();

            while (num!=-999) {
                System.out.println(" TRIPLO: " + num*3);
                System.out.print(" DIGITE UM NUMERO OU -999 PARA FINALIZAR: ");
                num = scanner.nextInt();
            }*/
            
        /*  // ATV 22 - ENTRAR COM NUMEROS ENQUANTO FOREM POSITIVOS E IMPRIMIR QUANTOS NUMEROS FORAM DIGITADOS.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO: ");
            int num = scanner.nextInt();

            int i=0;
            
            while (num>=0) {
                i++;
                
                System.out.print(" DIGITE UM NUMERO: ");
                num = scanner.nextInt();
            }
            
            System.out.println(" QUANTIDADE DE NUMEROS DIGITADOS: " + i);*/
            
        /*  // ATV 23 - ENTRAR COM VÁRIOS NUMEROS POSITIVOS E IMPRIMIR A MEDIA DOS NUMEROS DIGITADOS.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE NUMERO POSITIVO: ");
            int num = scanner.nextInt();

            int i=0;
            int soma = 0;

            while (num>0) {
                i++;
                soma = soma+num;

                System.out.print(" DIGITE NUMERO POSITIVO: ");
                num = scanner.nextInt();
            }

            System.out.println(" A MEDIA DOS NUMEROS DIGITADOS É: " + soma/i);*/

        /*  // ATV 24 - LER VARIOS NUMEROS E INFORMAR QUANTOS NUMEROS DIGITADOS ENTRE 100 E 200 FORAM DIGITADOS. QUANDO O VALOR ZERO FOR LIDO, O ALGORITIMO SE ENCERRA.
            
            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NUMERO OU 0 PARA SAIR: ");
            int num = scanner.nextInt();
            
            int numEntre = 0;
            
            while (num>0) {
                if (num>100 && num<200) {
                    numEntre++;
                }
                System.out.print(" DIGITE UM NUMERO OU 0 PARA SAIR: ");
                num = scanner.nextInt();
            }
            System.out.println(" NUMEROS DIGITADOS ENTRE 100 E 200 FORAM " + numEntre + " VEZES!");*/

        /*  // ATV 25 - ENTRAR COM NOMES ENQUANTO FOREM DIFERENTES DE FIM E IMPRIMIR O PRIMEIRO CARACTERE DE CADA NOME.

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE UM NOME OU FIM PARA ENCERRAR: ");
            String nome = scanner.nextLine();
            String nomeFim = "FIM";
            
            
            while (!nome.equalsIgnoreCase(nomeFim)) {
                System.out.println(" PRIMEIRA LETRA DO NOME DIGITADO: " + nome.substring(0,1));
                
                System.out.print(" DIGITE UM NOME OU FIM PARA ENCERRAR: ");
                nome = scanner.nextLine();
                nomeFim = "FIM";   
            }*/
            
        /*  // ATV 26 - ENTRAR COM PROFISSÃO DE VARIAS PESSOAS E IMPRIMIR QUANTOS SÃO DENTISTAS, CONSIDERANDO (DENTISTAS, Dentistas e dentistas).

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE SUA PROFISSÃO OU FIM PARA ENCERRAR: ");
            String prof = scanner.nextLine();
            int i=0;

            while (!prof.equalsIgnoreCase("FIM")) {
                
                if (prof.equalsIgnoreCase("DENTISTA")){
                    i++;
                }
                System.out.print(" DIGITE SUA PROFISSÃO OU FIM PARA ENCERRAR: ");
                prof = scanner.nextLine();   
            }
                System.out.println(" FORAM " + i + " DENTISTAS!");*/

        /*  // ATV 27 - ENTRAR COM SEXO DE VARIAS PESSOAS E IMPRIMIR QUANTAS SÃO MASCULINO, CONSIDERANDO (M OU m).

            Scanner scanner = new Scanner(System.in);

            System.out.print(" DIGITE SEU SEXO OU FIM PARA ENCERRAR: ");
            String sexo = scanner.nextLine();
            int i=0;

            while (!sexo.equalsIgnoreCase("FIM")) {
                
                if (sexo.equalsIgnoreCase("M")){
                    i++;
                }
                System.out.print(" DIGITE SEU SEXO OU FIM PARA ENCERRAR: ");
                sexo = scanner.nextLine();   
            }
                System.out.println(" FORAM " + i + " DO SEXO MASCULINO!");*/
  
        /*  // ATV 28 - ENTRAR COM NUMEROS E IMPRIMIR O QUADRADO DE CADA NUMERO ATE ENTRAR UM NUMERO MULTIPLO DE 6 QUE DEVERÁ TER SEU QUADRADO TAMBEM IMPRESSO.

            Scanner scanner = new Scanner(System.in);

            int num;

            do { 
                System.out.print(" DIGITE UM NUMERO OU MULTIPLO DE 6 PARA ENCERRAR: ");
                num = scanner.nextInt();
                
                System.out.println(" QUADRADO: " + num*num);

            } while (num%6!=0);*/

            // PARTE 04 - ESTRUTURAS HOMOGENEAS: VETORES E MATRIZES.

        /*  // ATV 01 - CRIAR UM ALGORITMO QUE ARMAZENE NOME E DUAS NOTAS DE CINCO ALUNOS E IMPRIMA UMA LISTAGEM CONTENDO NOME, AS DUAS NOTAS E A MEDIA DE CADA ALUNO.

            Scanner scanner = new Scanner(System.in);

            String nomes[] = new String[5];
            double n01[] = new double [5];
            double n02[] = new double[5]; 
            double med[] = new double[5];


            for (int i = 0; i <5; i++) {
                
                System.out.print(" DIGITE SEU NOME: ");
                nomes[i] = scanner.nextLine();
            
                System.out.print(" DIGITE SUA PRIMEIRA NOTA: ");
                n01[i] = scanner.nextDouble();

                System.out.print(" DIGITE SUA SEGUNDA NOTA: ");
                n02[i] = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("");

                med[i] = ((n01[i] + n02[i])/2);
                
                

            }

            for (int i = 0; i <5; i++) {
                System.out.println(" NOME: " + nomes[i]);
                System.out.println(" PRIMEIRA NOTA: " + n01[i]);
                System.out.println(" SEGUNDA NOTA: " + n02[i]);
                System.out.println(" SUA MEDIA: " + med[i]);
                System.out.println(" ");
            }*/

        /*  // ATV 02 - CRIAR UM ALGORITMO QUE ARMAZENE NUMEROS EM DOIS VETORES INTEIROS DE CINCO ELEMENTOS CADA. GERE E IMPRIMA O VETOR SOMA.
            
            Scanner scanner = new Scanner(System.in);

            int vetor01[] = new int[5]; 
            int vetor02[] = new int[5];
            int vetorSoma[] = new int[5];

            for (int i = 0; i <5; i++) {
                System.out.print(" DIGITE O PRIMEIRO NUMERO: ");
                vetor01[i] = scanner.nextInt();

                System.out.print(" DIGITE O SEGUNDO NUMERO: ");
                vetor02[i] = scanner.nextInt();
                scanner.nextLine();

                vetorSoma[i] = vetor01[i] + vetor02[i];
                System.out.println("");
            }

            for (int i = 0; i <=4; i++) {
                System.out.println(" SOMA [" + i +"]: " + vetorSoma[i]);
                
            }*/

        /*  // ATV 03 - CRIAR UM ALGORITMO QUE ARMAZENE 5 NOMES EM UM VETOR E DEPOIS POSSA SER DIGITADO UM NUMERO QUE CORRESPONDE A UMA PESSOA E IMPRIMIR ESSE NOME.

            Scanner scanner = new Scanner(System.in);

            String nomes[] = new String[5];
            
            for (int i = 0; i <5; i++) {
                System.out.print(" DIGITE O NOME DO PERSONAGEN "+(i+1)+": ");
                nomes[i] = scanner.nextLine();
                
            }
            
            System.out.println(" ");
            System.out.println(" NOME DOS PERSONAGENS: ");
            System.out.println(" ");

            for (int i = 0; i <5; i++) {
                System.out.println(" "+(i+1)+" - " + nomes[i]);
            }

            System.out.println(" ");
            System.out.print(" DIGITE UM NUMERO DE 1 A 5 PARA SELECIONAR O PERSONAGEM: ");
            int num = scanner.nextInt();
            System.out.println(" ");
            System.out.println(" PERSONAGEM SELECIONADO: " + nomes[num-1]);*/

        /*  // ATV 04 - ARMAZENAR 10 NOMES EM UM VETOR "NOME" E IMPRIMIR UMA LISTAGEM NUMERADA.
 
            Scanner scanner = new Scanner(System.in);

            String nomes[] = new String[10];
            
            for (int i = 0; i <10; i++) {
                System.out.print(" DIGITE UM NOME: ");
                nomes[i] = scanner.nextLine();
            }
            System.out.println("\n LISTAGEM NUMERADA ");
            System.out.println(" ");

            for (int i = 0; i <10; i++) {
                System.out.println(" " + (i+1) + " - " + nomes[i]);
            }*/
            
        /*  // ATV 05 - ARMAZENAR 15 NUMEROS INTEIROS EM UM VETOR "NUM" E IMPRIMIR UMA LISTAGEM NUMERADA CONTENDO O NUMERO E UMA DAS MENSAGENS: PAR OU IMPAR.  
            
            Scanner scanner = new Scanner(System.in);

            int numeros[] = new int[15];

            for (int i = 0; i <15; i++) {
                System.out.print(" DIGITE UM NUMERO: ");
                numeros[i] = scanner.nextInt();

            }

            System.out.println("\n LISTAGEM DOS NUMEROS DIGITADOS COM MSG DE PAR OU IMPAR: ");
            System.out.println(" ");
            
            for (int i = 0; i <15; i++) {
                if (numeros[i]%2==0) {
                    System.out.println((" " + (i+1) + " - " + numeros[i]) + ": PAR! ");
                }
                else {
                    System.out.println((" " + (i+1) + " - " + numeros[i]) + ": IMPAR! ");
                }
               
            }*/

        /*  // ATV 06 - ARMAZENAR 8 NUMEROS EM UM VETOR E IMPRIMIR TODOS OS NUMEROS. AO FINAL, TEREMOS O TOTAL DE NUMEROS MULTIPLOS DE SEIS DIGITADOS.

            Scanner scanner = new Scanner(System.in);

            String numList [] = {"PRIMEIRO","SEGUNDO","TERCEIRO","QUARTO","QUINTO","SEXTO","SETIMO","OITAVO"};
            int num[] = new int[8];

            for (int i = 0; i <8; i++) {
                System.out.print((" DIGITE O " + numList[i]) + " NUMERO: ");
                num[i] = scanner.nextInt();
            }

            System.out.println("\n LISTA COM OS 8 NUMEROS DIGITADOS ");

            for (int i = 0; i <8; i++) {
                System.out.println(" " + numList[i] + " NUMERO DIGITADO: " + num[i]);
            }

            System.out.println("\n LISTA DOS NUMEROS MUTIPLOS DE SEIS DA LISTA DOS 8 NUMEROS DIGITADOS \n");

            for (int i = 0; i <8; i++) {
                if (num[i]%2==0 && num[i]%3==0) {
                    System.out.println(" " + num[i]);
                }
            }
            System.out.println(" ");*/

        /*  // ATV 07 - QUESTÃO 356 DO LIVRO.

            Scanner scanner = new Scanner(System.in);
            
            String nomeAluno[] = new String[6];
            
            double nota1[] = new double[6];
            double nota2[] = new double[6];
            double media[] = new double[6];
            String situAluno [] = new String[6];

            for (int i = 0; i <6; i++) {
                System.out.print("\n DIGITE SEU NOME: ");
                nomeAluno[i] = scanner.nextLine();

                System.out.print(" DIGITE SUA PRIMEIRA NOTA: ");
                nota1[i] = scanner.nextDouble();

                System.out.print(" DIGITE SUA SEGUNDA NOTA: ");
                nota2[i] = scanner.nextDouble();

                scanner.nextLine();

                media[i] = ((nota1[i]+nota2[i])/2);
                media[i] = Math.ceil(media[i]); // MATH.CEIL FAZ O ARREDONDAMENTO PARA CIMA.

                        if (media[i]>=7) {
                             situAluno[i] = "APROVADO, PARABENS, VOCE ESTA DE FERIAS!";
                        }else{
                            situAluno[i] = "REPROVADO, PRECISA SE DEDICAR MAIS, VOCE EST NA FINAL! ";
                        }
            }

            System.out.println("\n LISTA DOS ALUNOS ");

            for (int i = 0; i <6; i++) {
                System.out.println("\n NOME DO ALUNO: " + nomeAluno[i]);
                System.out.println(" PRIMEIRA NOTA: " + nota1[i]);
                System.out.println(" SEGUNDA NOTA: " + nota2[i]);
                System.out.println(" MEDIA ARREDONDADA: " + media[i]);
                System.out.println(" SITUAÇÃO DO ALUNO: " + situAluno[i] + "\n");
            }*/

        /*  // ATV 08 - QUESTÃO 357 DO LIVRO.
            
            Scanner scanner = new Scanner(System.in);

            String nome[] = new String[5];
            double salario[] = new double[5];
            double novoSalario[] = new double[5];

            for (int i = 0; i <5; i++) {
                System.out.print("\n DIGITE SEU NOME: ");
                nome[i] = scanner.nextLine();

                System.out.print(" DIGITE SEU SALARIO ATUAL: ");
                salario[i] = scanner.nextDouble();

                scanner.nextLine();

                double reajusteSala = (salario[i]*(8.0/100));
                novoSalario[i] = (salario[i]+reajusteSala);
                
            }

            System.out.println("\n TABELA DE REAJUSTE DO SALARIO DOS FUNCIONARIOS ");

            for (int i = 0; i <5; i++) {
                System.out.println("\n FUNCIONARIO: " + nome[i]);
                System.out.println(" SALARIO ANTERIOR: " + salario[i]);
                System.out.println(" SALARIO ATUAL COM REAJUSTE DE 8%: " + novoSalario[i] + "\n");
            }*/

        /*  // ATV 09 - QUESTÃO 358 DO LIVRO.

            Scanner scanner = new Scanner(System.in);

            String produtos[] = {"CARNE","ARROZ","FEIJAO","CUSCUZ","MACARRAO"};

            double precoCompra[] = new double[5];
            double precoVenda[] = new double[5];
            
            int lucroMenos10=0;
            int lucroMais10=0;
            int lucroMais20=0;

            for (int i = 0; i <5; i++) {
                System.out.print("\n DIGITE O PREÇO DE COMPRA DO PRODUTO " + produtos[i] + ": ");
                precoCompra[i] = scanner.nextDouble();

                System.out.print(" DIGITE O PREÇO DE VENDA DO PRODUTO " + produtos[i] + ": ");
                precoVenda[i] = scanner.nextDouble();

                scanner.nextLine();

                double porcentProd = ((precoVenda[i] - precoCompra[i]) / precoCompra[i]);
                double porcentLucro = porcentProd * 100;

                if (porcentLucro<10) {
                    System.out.println(" LUCRO DO PRODUTO " + produtos[i] + " FOI DE: " + porcentLucro + "%");
                    lucroMenos10++;  
                }
                else if (porcentLucro >=10 && porcentLucro <20) {
                    System.out.println(" LUCRO DO PRODUTO " + produtos[i] + " FOI DE: " + porcentLucro + "%");
                    lucroMais10++; 
                }
                else if (porcentLucro >=20) {
                    System.out.println(" LUCRO DO PRODUTO " + produtos[i] + " FOI DE: " + porcentLucro + "%");
                    lucroMais20++;
                }

            }
            
            System.out.println("\n LISTA DA QUANTIDADE DE PRODUTOS COM MENOS 10% DE LUCRO, 10% A 19% DE LUCRO E 20% OU MAIS DE LUCRO. ");
            System.out.println("\n LUCRO -10%: " + lucroMenos10);
            System.out.println(" LUCRO 10% a 19%: " + lucroMais10);
            System.out.println(" LUCRO 20% a +20%: " + lucroMais20);*/

        /*  // ATV 10 - QUESTÃO 359 DO LIVRO.

            Scanner scanner = new Scanner(System.in);

            String nome[] = new String[5];
            int idade[] = new int[5];

            String nomes[] = new String[5];

            for (int i = 0; i <5; i++) {
                System.out.print("\n DIGETE SEU NOME: ");
                nome[i] = scanner.nextLine();

                System.out.print(" DIGITE SUA IDADE: ");
                idade[i] = scanner.nextInt();

                scanner.nextLine();

                String letraInicial = nome[i].substring(0, 1);

                if (letraInicial.equals("M")|| letraInicial.equals("m")||
                   letraInicial.equals("N")|| letraInicial.equals("n")||
                   letraInicial.equals("O")|| letraInicial.equals("o")|| 
                   letraInicial.equals("P")|| letraInicial.equals("p")|| 
                   letraInicial.equals("Q")|| letraInicial.equals("q")|| 
                   letraInicial.equals("R")|| letraInicial.equals("r")) {

                    nomes[i] = nome[i];
                    
                }

            }
             
            System.out.println("\n LISTA COM OS NOMES QUE INICIA COM A LETRA M, N, O, P, Q E R. \n");
            for (int i = 0; i <5; i++) {
                if (nomes[i]!= null) {
                    System.out.println(" " + nomes[i]);
                }
               
            }*/
            
        /* // ATV 11 - QUESTÃO 361 DO LIVRO.  "UTILIZEI ARRAYLIST"

           ArrayList <String> codigosProdutos = new ArrayList<>(); 
           ArrayList <Integer> quantProdutos = new ArrayList<>();
           ArrayList <String> nomeProdutos = new ArrayList<>(); 
           ArrayList <Double> valorCompra = new ArrayList<>();  
           ArrayList <Double> valorVenda = new ArrayList<>();

           Scanner scanner = new Scanner(System.in);

           String escolha;

           do { System.out.print("\n DIGITE O CODIGO DO PRODUTO: ");
                String codigo = scanner.nextLine();
                codigosProdutos.add(codigo);

                System.out.println(" CODIGO SALVO!");

                System.out.print("\n DIGITE O NOME DO PRODUTO: ");
                String nome = scanner.nextLine();
                nomeProdutos.add(nome);

                System.out.println(" NOME DO PRODUTO SALVO!");

                System.out.print("\n DIGITE A QUANTIDADE DE COMPRA DO PRODUTO: ");
                int quantidade = scanner.nextInt();
                quantProdutos.add(quantidade);

                System.out.println(" QUANTIDADE DO PRODUTO SALVO!");

                System.out.print("\n DIGITE O VALOR DE COMPRA DO PRODUTO: ");
                double valorC = scanner.nextDouble();
                valorCompra.add(valorC);

                System.out.println(" VALOR DE COMPRA DO PRODUTO SALVO! ");

                System.out.print("\n DIGITE O VALOR DE VENDA DO PRODUTO: ");
                double valorV = scanner.nextDouble();
                valorVenda.add(valorV);

                System.out.println(" VALOR DE VENDA DO PRODUTO SALVO!");

                System.out.print("\n DESEJA CADASTRAR UM NOVO PRODUTO? DIGITE S/N: ");
                scanner.nextLine();
                
                escolha = scanner.nextLine();

                
            } while (escolha.equalsIgnoreCase("S")); 

            System.out.println("\n CADASTRO DE PRODUTOS ENCERRADO!\n");

            System.out.print(" DESEJA PESQUISAR ALGUM PRODUTO CADASTRADO PELO CODIGO? DIGITE S/N: ");
            escolha = scanner.next();


           if (escolha.equalsIgnoreCase("S")) {
                System.out.print("\n DIGITE O CODIGO DO PRODUTO: ");
                scanner.nextLine();
                String escCodigo = scanner.nextLine();

                for (int i = 0; i < codigosProdutos.size(); i++) {
                    if (escCodigo.equals(codigosProdutos.get(i)) ) {
                        System.out.println("\n NOME: " + nomeProdutos.get(i));
                        System.out.println(" QUANTIDADE: " + quantProdutos.get(i));
                        System.out.println(" VALOR DE COMPRA: " + valorCompra.get(i));
                        System.out.println(" VALOR DE VENDA: " + valorVenda.get(i));
                        System.out.println();
                    }
                }
            }else if (escolha.equalsIgnoreCase("N")) {
            System.out.println( "\n LISTA DOS PRODUTOS CADASTRADOS:  \n");

            for (int i = 0; i < codigosProdutos.size(); i++) {
             System.out.println(" CODIGO: " + codigosProdutos.get(i));
             System.out.println(" NOME: " + nomeProdutos.get(i));
             System.out.println(" QUANTIDADE: " + quantProdutos.get(i));
             System.out.println(" VALOR DE COMPRA: " + valorCompra.get(i));
             System.out.println(" VALOR DE VENDA: " + valorVenda.get(i));
             System.out.println();
            }

            }else {
                System.out.println(" PESQUISA DE PRODUTO ENCERRADO!");
            }*/

        /*  // ATV 12 - CRIAR UM ALGORITMO QUE LEIA OS ELEMENTOS DE UMA MATRIZ INTEIRA 3X3 E ESCREVA OS ELEMENTOS DA DIAGONAL PRINCIPAL.

            Scanner leia = new Scanner(System.in);


            int[][] matriz = new int[3][3];

            for (int l = 0; l < matriz.length; l++) {
                for (int c = 0; c < matriz[l].length; c++) {
                    System.out.print("DIGITE UM NUMERO PARA PREENCHER A MATRIZ 3X3: ");
                    matriz[l][c] = leia.nextInt();
                    leia.nextLine();
                }
                
            }

            System.out.println("\n DIAGONAL DA MATRIZ:");

            for (int l = 0; l < matriz.length; l++) {
                                
                System.out.println(" " + matriz[l][l]);
              
            }*/

        /*  // ATV 13 - CRIAR UM ALGORITMO QUE LEIA OS ELEMENTOS DE UMA MATRIZ INTEIRA 5X5 E ESCREVA TODOS OS ELEMENTOS, EXCETO OS ELEMENTOS DA DIAGONAL PRINCIPAL.
           
            Scanner leia = new Scanner(System.in);


            int[][] matriz = new int[5][5];

            for (int l = 0; l < matriz.length; l++) {
                for (int c = 0; c < matriz[l].length; c++) {
                    System.out.print("DIGITE UM NUMERO PARA PREENCHER A MATRIZ 5X5: ");
                    matriz[l][c] = leia.nextInt();
                    leia.nextLine();
                }
                
            }

            System.out.println("\n TRIANGULO SUPERIOR E INFERIOR DA DIAGONAL PRINCIPAL:");

            for (int l = 0; l < matriz.length; l++) {
                for (int c = l+1; c < matriz.length; c++) {
                    System.out.println(" " + matriz[l][c]);
                }          
            }
            
            System.out.println("\n TRIANGULO INFERIOR DA DIAGONAL PRINCIPAL:");

            for (int l = 1; l < matriz.length; l++) {
                for (int c = 0; c < l; c++) {
                    System.out.println(" " + matriz[l][c]);
                }         
            }*/

            
        }

            
            }



    














            
            
        
    
    
        

