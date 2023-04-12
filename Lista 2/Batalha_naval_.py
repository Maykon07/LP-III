
def verifica(saida, l, c):
    # Enquanto não tiver um vencedor, o loop vai rodar
    sentinela = True
    i = 1
    while sentinela:
        if i > 1:


            while True:
                entrada = input()
                valores = entrada.split()
            
                if len(valores) == 2:
                    try:
                        l[0] = int(valores[0])
                        c[0] = int(valores[1])
                        break
                    except ValueError:
                        print("Digite apenas números inteiros para as coordenadas.")
                else:
                    print("Digite exatamente dois valores separados por espaço.")
        i += 1
        sentinela = True
        if l[0] > 4 or l[0] < 0 or c[0] > 4 or c[0] < 0:
            print("Coordenada invalida.\nintervalo valido :(-1 < x < 5)")
        elif saida[l[0]][c[0]] != '-':
            print("Coordenada ja preenxida, entre com uma nova")
        else :
            sentinela = False

# FUNÇÃO DE IMPRIMIR O ARRAY NA TELA 
def imprime_matriz(matriz):
    print("===========================================")
    print("\t0\t1\t2\t3\t4\n")
    for i in range(5):
        print(f"{i}\t{matriz[i][0]}\t{matriz[i][1]}\t{matriz[i][2]}\t{matriz[i][3]}\t{matriz[i][4]}")
    print("===========================================")

#FUNÇÃO DE ENTRADA DOS NAVIOS
def cordenadas_navios(tabuleiro):
    i = 0
    while i < 5:
        # controle das entradas de valores do usuario
        senti = False
        while True:
        
            linha, coluna = map(int, input("Entre com as coordenadas do navio " + str(i) + ": ").split())
            if linha > 4 or linha < 0 or coluna > 4 or coluna < 0:
                print("Coordenada inválida!")
            elif tabuleiro[linha][coluna] == '@':
                print("Coordenada já selecionada. Escolha outra.")
                senti = True
            else:
                break
         
        if not senti:
            tabuleiro[linha][coluna] = '@'
            i += 1


# import numpy as np
#declaração de variaveis,sentinela,contador navios afundados, e os tabuleiros
contador_1 = 0
contador_2 = 0
#declarei linha e coluna como vetor por que na chama da função verifica
#se caso o usuario entre com um valor ja digitado antes, ele vai entrar
#com uma nova cordena que vai ser usada na função principal, como não sei se 
#como fazer passagem por referencia de variaveis, tive que fazer dessa forma
linha = [0]
coluna = [0]
saida_1 = [['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'] ]
saida_2 = [['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'] ]
tabuleiro_1 = [['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'] ]
tabuleiro_2 = [['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'], ['-','-','-','-','-'] ]
   
print("Welcome to battleship!!")
print("Entre com as coordenadas dos navios")
print("entre com 5 navios, em um tabuleiro 5x5")
print("exemplo de entrada:\n 2 3")

#ENTRANDO COM OS NAVIOS DO JOGADOR 1
print("coordenadas do player 1")
cordenadas_navios(tabuleiro_1)

# ENTRANDO COM OS NAVIOS DO JOGADOR 2
print("\n\ncoordenadas do player 2")
cordenadas_navios(tabuleiro_2)

print("jogo inciado !!")

#Enquanto não tiver um vencedor, o loop vai rodar
while True:
    print("\n<<<<< TABULEIRO DO JOGADOR 2 PARA ALVEJAR >>>>>")
    imprime_matriz(saida_2)
    linha = []
    coluna = []

    while True:
        entrada = input("Jogador 1, digite uma coordenada (linha e coluna separados por espaço): ")
        valores = entrada.split()
    
        if len(valores) == 2:
            try:
                linha.append(int(valores[0]))
                coluna.append(int(valores[1]))
                break
            except ValueError:
                print("Digite apenas números inteiros para as coordenadas.")
        else:
            print("Digite exatamente dois valores separados por espaço.")
    #verificando a entrada
    verifica(saida_2, linha, coluna)
    
    if tabuleiro_2[linha[0]][coluna[0]] == '@':
    
        contador_1 = contador_1 + 1
        saida_2[linha[0]][coluna[0]] = 'X'
        print(" === O jogador 1 atingiu a nave do jogador 2 ===\n")
    
    else:
        
        saida_2[linha[0]][coluna[0]] = 'O'
        print("jogada falha !!\n")
    
    if contador_1 == 5:
        
            print("<<<<<<<<< O JOGADOR 1 VENCE! >>>>>>>\nTODOS OS NAVIOS DO SEU ADVERSÁRIO FOI AFUNDADO!")
            print("=== RESULTADO DOS TABULEIROS ===")
    
             #TELA DO VENCEDOR
            print("\n======== TABULEIRO DO VENCEDOR =======")
            imprime_matriz(saida_1)
            print("\n=== POSSIÇÃO DOS NAVIOS QUE O VENCEDOR INSERIO ===")
            imprime_matriz(tabuleiro_1)
            # TELA DO PERDEDOR
            print("\n======== TABULEIRO DO PERDEDOR =======")
            imprime_matriz(saida_2); 
            print("\n=== POSSIÇÃO DOS NAVIOS QUE O PERDEDOR INSERIO ===")
            imprime_matriz(tabuleiro_2)
            break
    
    # entradas do jogador 2 
    print("\n<<<<< TABULEIRO DO JOGADOR 1 PARA ALVEJAR >>>>>")
    imprime_matriz(saida_1)
    
    linha = []
    coluna = []

    while True:
        entrada = input("Jogador 2, digite uma coordenada (linha e coluna separados por espaço): ")
        valores = entrada.split()
    
        if len(valores) == 2:
            try:
                linha.append(int(valores[0]))
                coluna.append(int(valores[1]))
                break
            except ValueError:
                print("Digite apenas números inteiros para as coordenadas.")
        else:
            print("Digite exatamente dois valores separados por espaço.")
    
    verifica(saida_1, linha, coluna)
    # Verificação de coordenada
    
    if tabuleiro_1[linha[0]][coluna[0]] == '@':
    
        contador_2 = contador_2 + 1
        saida_1[linha[0]][coluna[0]] = 'X';
        print("==== O jogador 2 atingiu a nave do jogador 1 ===") 
    
    else:            
        saida_1[linha[0]][coluna[0]] = 'O'
        print("jogada falha !!!")
          
    
    #se contador_2 == 5, o jogador 2 ganhou
    if contador_2 == 5:
    
        print("<<<<<<<<<<<<<<< O JOGADOR 2 VENCEU! >>>>>>>>>>>>>\nTODOS OS NAVIOS DO SEU ADVERSÁRIO FOI AFUNDADO!");
        print("=== RESULTADO DOS TABULEIROS ===")
        #TELA DO VENCEDOR
        print("\n== TABULEIRO DO VENCEDOR ===")
        imprime_matriz(saida_2)
        print("\n=== POSSIÇÃO DOS NAVIOS QUE O VENCEDOR INSERIO ===")
        imprime_matriz(tabuleiro_2)
        #TELA DO PERDEDOR
        print("\n=== TABULEIRO DO PERDEDOR ===")
        imprime_matriz(saida_1)
        print("\n=== POSSIÇÃO DOS NAVIOS QUE O PERDEDOR INSERIO ===")
        imprime_matriz(tabuleiro_1)
        break
                 