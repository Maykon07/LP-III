import random

d1 = random.randint(1, 6)
d2 = random.randint(1, 6)
ponto = d1 + d2
cont = 0
print("Ponto: ", ponto)

if ponto == 7 or ponto == 11:
    print("Parabéns, você venceu!!!")
    exit(1)

if ponto == 2 or ponto == 3 or ponto == 12:
    print("Infelizmente você perdeu!!!")
    exit(1)

print("ESTÁGIO INICIAL 2")

jogadas = 1
while True:
    d1 = random.randint(1, 6)
    d2 = random.randint(1, 6)
    print("JOGADA ", jogadas, ":")
    print("DADO 1: ", d1)
    print("DADO 2: ", d2)
    jogadas += 1

    if (d1 + d2) == ponto:
        print("Parabéns, você venceu!!!")
        exit(1)

    if (d1 + d2) == 7:
        print("Infelizmente você perdeu!!!")
        exit(1)