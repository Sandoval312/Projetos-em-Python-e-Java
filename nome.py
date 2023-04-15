#Faça um programa que peça o primeiro nome do usuário. Se o nome tiver 4 letras ou 
#menos escreva "Seu nome é curto"; se tiver entre 5 e 6 letras, escreva 
#"Seu nome é normal"; maior que 6 escreva "Seu nome é muito grande". 

nome = str(input("Digite seu primeiro nome: "))

nome2 = (len(nome))

if nome2 >1:
    if nome2 <= 4:
        print ("Seu nome é curto")
    elif nome2 >= 5 and nome2 <= 6:
        print ("Seu nome é normal")
    else:
        print ("Seu nome é muito grande")

else:
    print("digite um nome valido")




