#Faça um programa que peça ao usuário para digitar um número inteiro,
#informe se este número é par ou ímpar. Caso o usuário não digite um número
#inteiro, informe que não é um número inteiro.


num1 = input("Digite um número inteiro e direi se ele é par ou impar!")

if num1.isdigit():
    num1_int = int (num1)
    par_impar = num1_int % 2 ==0
    impar_text = "impar"

    if impar_text:
        impar_text = "par"

    print("O número digitado é {}, e ele é = {} ".format (num1_int, impar_text))

else:
    print("o valor digitado nao é inteiro")



