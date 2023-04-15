#Crie um programa que peça ao usuário que insira o nome de um mês 
#(em letras minúsculas) e exiba o número correspondente desse mês. 
#Se o usuário digitar um nome inválido, 
#exiba uma mensagem de erro na tela.

meses = {
    "janeiro":  1,
    "fevereiro":  2,
    "março": 3,
    "abril":  4,
    "maio":  5,
    "junho":  6,
    "julho":  7,
    "agosto":  8,
    "setembro":  9,
    "outubro":  10,
    "novembro":  11,
    "dezembro":  12
}


mes = str(input("Olá, Digite um mês que irei te dizer qual número é correspondente ao mês!")).lower()

if mes in meses:
    
    numeroMes = meses[mes]
    print ("O número correspondente é {}".format (numeroMes))

else:
    print ("Digite um mês valido ou escreva em minusculo")




