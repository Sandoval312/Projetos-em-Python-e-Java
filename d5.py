#Desenvolva um programa para efetuar a leitura de três valores (A, B e C) e apresentar os valores dispostos em ordem crescente.


vA = int(input("digite valor a: "))
vB = int(input("digite valor b: "))
vC = int(input("digite valor c: "))

if vA > vC:
    vA, vC = vC, vA

if vA > vB:
    vA, vB = vB, vA

if vB > vC:
    vB, vC = vC,vB

print (" A ordem crescente é {}, {}, {}!" .format(vA, vB,vC))
