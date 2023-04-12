import math

# realiza as medições de voltagem
medicoes = [5, 5.5, 5.5, 5, 5.5, 5.5, 5.5, 5, 5.5, 5.5]

# calcula a média 
media = sum(medicoes) / 10

# calculo do desvio padrao
desvio_padrao = 0.0
for i in range(10):
    desvio_padrao += (medicoes[i] ** 2)
desvio_padrao /= 10
desvio_padrao = desvio_padrao - (media ** 2)
desvio_padrao = math.sqrt(desvio_padrao)

# verifica se o multímetro está operacional
limite_desvio_padrao = 0.1 * media
if desvio_padrao > limite_desvio_padrao:
    print("\nO multímetro está com problemas e não pode ser utilizado.\n")
else:
    print("\nO multímetro está operacional.\n")

# imprime os resultados
print("Leituras: ")
for i in range(10):
    print("=> {}".format(medicoes[i]))
print()
print("Média: {}".format(media))
print("Desvio padrão: {}".format(desvio_padrao))