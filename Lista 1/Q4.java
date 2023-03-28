
import java.util.Scanner;
 
public class teste
{
    public static void verifica(char saida[][], int[] l, int[] c){
                //Enquanto não tiver um vencedor, o loop vai rodar
       boolean sentinela;
       int i = 1;
      Scanner teclado = new Scanner(System.in);
           do{
               if(i>1){
                 l[0] =  teclado.nextInt();
                 c[0] =  teclado.nextInt();
               }
               i++;
              sentinela = false;
               if(l[0] > 4 || l[0] < 0 || c[0] > 4 || c[0] < 0){
                   System.out.println("Coordenada invalida.\nintervalo valido :(-1 < x < 5)");
               }else if(saida[l[0]][c[0]] != '-')
               {
                   System.out.println("Coordenada ja preenxida, entre com uma nova");
                   sentinela = true;
                   
               }
           }while(l[0] > 4 || l[0] < 0 || c[0] > 4 || c[0] < 0 || sentinela);

   }
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
        int i, j,contador_1 = 0,contador_2 = 0;
        //declarei linha e coluna como vetor por que na chama da função verifica
        //se caso o usuario entre com um valor ja digitado antes, ele vai entrar
        //com uma nova cordena que vai ser usada na função principal, como não sei se 
        //como fazer passagem por referencia de variaveis, tive que fazer dessa forma
        int[] linha = new int[1];
        int[] coluna = new int[1];
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

           
                linha[0] = ler.nextInt();
                coluna[0] = ler.nextInt();
                verifica(saida_2, linha, coluna);
                
            // VERIFICANDO SE E UM NAVIO
            if(tabuleiro_2[linha[0]][coluna[0]] == '@')
            {
                contador_1++;
                saida_2[linha[0]][coluna[0]] = 'X';
                System.out.println(" === O jogador 1 atingiu a nave do jogador 2 ===\n");
            }
            else
            {
                saida_2[linha[0]][coluna[0]] = 'O';
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
                System.out.println("\n=== POSSIÇÃO DOS NAVIOS QUE O VENCEDOR INSERIO ===");
                imprime_matriz(tabuleiro_1);
                 // TELA DO PERDEDOR
                System.out.println("\n======== TABULEIRO DO PERDEDOR =======");
                imprime_matriz(saida_2); 
                 System.out.println("\n=== POSSIÇÃO DOS NAVIOS QUE O PERDEDOR INSERIO ===");
                imprime_matriz(tabuleiro_2);
                break;
            }

            // entradas do jogador 2 
            System.out.println("\n<<<<< TABULEIRO DO JOGADOR 1 PARA ALVEJAR >>>>>");
            imprime_matriz(saida_1);
            System.out.println("jogador 2 digite uma coordenada: ");

            
                linha[0] = ler.nextInt();
                coluna[0] = ler.nextInt();
                verifica(saida_1, linha, coluna);
            // Verificação de coordenada
            if(tabuleiro_1[linha[0]][coluna[0]] == '@')
            {
                contador_2++;
                saida_1[linha[0]][coluna[0]] = 'X';
                System.out.println("==== O jogador 2 atingiu a nave do jogador 1 ==="); 
             }
            else
            {
               saida_1[linha[0]][coluna[0]] = 'O';
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
                System.out.println("\n=== POSSIÇÃO DOS NAVIOS QUE O VENCEDOR INSERIO ===");
                imprime_matriz(tabuleiro_2);
                // TELA DO PERDEDOR
                System.out.println("\n=== TABULEIRO DO PERDEDOR ===");
                imprime_matriz(saida_1);
                 System.out.println("\n=== POSSIÇÃO DOS NAVIOS QUE O PERDEDOR INSERIO ===");
                imprime_matriz(tabuleiro_1);
                break;
            }
        }  
    }
}