#Crie um programa em Python que solicite ao usuário que insira um número inteiro. 
#Em seguida, verifique se o número é positivo, negativo ou igual a zero 
#e exiba uma mensagem apropriada na tela.

num1 = int(input(" Digite um número: "))


if num1 > 0:
    print (" numero é positivo")

elif num1 < 0:
    print (" O número é negativo ")


else:
    print ("O número é zero!")

