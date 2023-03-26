
 import java.util.Scanner;
 
 public class Q4
 {
   //FUNÇÃO DE IMPRIMIR O ARRAY NA TELA 
    public static void imprime_matriz(char[][] matriz){
        System.out.println("===========================================");
        System.out.println("\t0\t1\t2\t3\t4\n");
        for(int i=0;i<5;i++){
            System.out.printf("%d\t%c\t%c\t%c\t%c\t%c\n",i,matriz[i][0],matriz[i][1],matriz[i][2],matriz[i][3],matriz[i][4]);
        }
        System.out.println("===========================================");
    }
    
    //FUNÇÃO DE ENTRADA DOS NAVIOS
    public static void cordenadas_navios(char [][]tabuleiro){
        int i, coluna, linha;
        Scanner leitor = new Scanner(System.in);
        boolean senti;
        
            for(i = 0; i < 5; i++)
             {
                 // controle das entradas de valores do usuario
                 do{
                   
                     System.out.printf("entre com a coordenadas do navio " +i +": ");
                     linha = leitor.nextInt();
                     coluna = leitor.nextInt();
                     senti = false;
                     if(linha > 4 || linha < 0 || coluna > 4 || coluna < 0)
                         System.out.println("Coordenada invalida !!!");
                     else if(tabuleiro[linha][coluna] == '@')
                     {
                         System.out.println("Coordenada ja selecionada. Escolha outra");
                         senti = true;
                     }
                 }while(linha > 4 || linha < 0 || coluna > 4 || coluna < 0 || senti);
                 
                 tabuleiro[linha][coluna] = '@';
             }
    }
     public static void main(String[] args) 
     {
        //declaração de variaveis,sentinela,contador navios afundados, e os tabuleiros
         Scanner ler = new Scanner(System.in);
         int i, j,linha, coluna,contador_1 = 0,contador_2 = 0;
         boolean sentinela;
         char[][] tabuleiro_1 = new char[5][5], tabuleiro_2 = new char[5][5], saida_1 = new char[5][5], saida_2 = new char[5][5];
 
         // preenchimento os tabuleiros
         for(i = 0; i<5; i++){
             for(j = 0; j < 5; j++)
             {
              tabuleiro_1[i][j] = '-';
              saida_1[i][j] = '-';
              tabuleiro_2[i][j] = '-';
              saida_2[i][j] = '-';
             }
            }
         System.out.println("Welcome to battleship!!");
         System.out.println("Entre com as coordenadas dos navios");
         System.out.println("entre com 5 navios, em um tabuleiro 5x5");
         System.out.println("exemplo de entrada:\n 2 3");
        
         //ENTRANDO COM OS NAVIOS DO JOGADOR 1
         System.out.println("coordenadas do player 1");
         cordenadas_navios(tabuleiro_1);
 
         // ENTRANDO COM OS NAVIOS DO JOGADOR 2
         System.out.println("\n\ncoordenadas do player 2");
         cordenadas_navios(tabuleiro_2);
 
         System.out.println("jogo inciado !!");
 
         //Enquanto não tiver um vencedor, o loop vai rodar
         while(true)
         {
             System.out.println("\n<<<<< TABULEIRO DO JOGADOR 2 PARA ALVEJAR >>>>>");
             imprime_matriz(saida_2); 
             System.out.println("jogador 1 digite uma coordenada: ");
 
             do{
                sentinela = false;
                 linha = ler.nextInt();
                 coluna = ler.nextInt();
                 if(linha > 4 || linha < 0 || coluna > 4 || coluna < 0){
                     System.out.println("Coordenada invalida.\nintervalo valido :(-1 < x < 5)");
                 }else if(saida_2[linha][coluna] != '-')
                 {
                     System.out.println("Coordenada ja preenxida, entre com uma nova");
                     sentinela = true;
                     
                 }
             }while(linha > 4 || linha < 0 || coluna > 4 || coluna < 0 || sentinela);
 
             // VERIFICANDO SE E UM NAVIO
             if(tabuleiro_2[linha][coluna] == '@')
             {
                 contador_1++;
                 saida_2[linha][coluna] = 'X';
                 System.out.println(" === O jogador 1 atingiu a nave do jogador 2 ===\n");
             }
             else
             {
                 saida_2[linha][coluna] = 'O';
                 System.out.println("jogada falha !!\n");
              }
 
             // se contador_1 == 5, o jogador 1 ganhou
             if(contador_1 == 5)
             {
                 System.out.println("<<<<<<<<< O JOGADOR 1 VENCE! >>>>>>>\nTODOS OS NAVIOS DO SEU ADVERSÁRIO FOI AFUNDADO!");
                 System.out.println("=== RESULTADO DOS TABULEIROS ===");
 
                 // TELA DO VENCEDOR
                 System.out.println("\n======== TABULEIRO DO VENCEDOR =======");
                 imprime_matriz(saida_1); 
                 System.out.println("\n======== TABULEIRO DO PERDEDOR =======");
                 // TELA DO PERDEDOR
                 imprime_matriz(saida_2); 
                 break;
             }
 
             // entradas do jogador 2 
             System.out.println("\n<<<<< TABULEIRO DO JOGADOR 1 PARA ALVEJAR >>>>>");
             imprime_matriz(saida_1);
             System.out.println("jogador 2 digite uma coordenada: ");
 
             do{
                 linha = ler.nextInt();
                 coluna = ler.nextInt();
                 sentinela = false;
                 if(linha > 4 || linha < 0 || coluna > 4 || coluna < 0)
                     System.out.println("Coordenada invalida.\nintervalo valido :(-1 < x < 5)");
                 else if(saida_1[linha][coluna] != '-')
                 {
                     System.out.println("Coordenada ja selecionada. Escolha outra");
                     sentinela = true;
                 }
             }while(linha > 4 || linha < 0 || coluna > 4 || coluna < 0 || sentinela);
 
             // Verificação de coordenada
             if(tabuleiro_1[linha][coluna] == '@')
             {
                 contador_2++;
                 saida_1[linha][coluna] = 'X';
                 System.out.println("==== O jogador 2 atingiu a nave do jogador 1 ==="); 
              }
             else
             {
                saida_1[linha][coluna] = 'O';
                 System.out.println("jogada falha !!!");
               }
 
             // se contador_2 == 5, o jogador 2 ganhou
             if(contador_2 == 5)
             {
                 System.out.println("<<<<<<<<<<<<<<< O JOGADOR 2 VENCEU! >>>>>>>>>>>>>\nTODOS OS NAVIOS DO SEU ADVERSÁRIO FOI AFUNDADO!");
                 System.out.println("=== RESULTADO DOS TABULEIROS ===");
                 // TELA DO VENCEDOR
                 System.out.println("\n== TABULEIRO DO VENCEDOR ===");
                 imprime_matriz(saida_2);
                 // TELA DO PERDEDOR
                 System.out.println("\n=== TABULEIRO DO PERDEDOR ===");
                 imprime_matriz(saida_1);
                 break;
             }
         }
         ler.close();   
     }
 }
