"""
Exercício
Peça ao usuário para digitar seu nome
Peça ao usuário para digitar sua idade
Se nome e idade forem digitados:
    Exiba:
        Seu nome é {nome}
        Seu nome invertido é {nome invertido}
        Seu nome contém (ou não) espaços
        Seu nome tem {n} letras
        A primeira letra do seu nome é {letra}
        A última letra do seu nome é {letra}
Se nada for digitado em nome ou idade: 
    exiba "Desculpe, você deixou campos vazios."
"""


nome =  input("Digite seu nome: ")
idade = input("Digite dua idade: ")


   

if nome and idade:
    print ('Seu nome é: ', nome)
    print ('seu nome invertido é ', nome[::-1])
    if " "in nome:
        print("seu nome contém espaço")
    else:
        print("seu nome não contén espaços!" )

    print ('seu nome tem {}' .format (len(nome)))
    print ("a primeira letra do seu nome é: ", nome [0:1] , "e a ultima letra do seu nome é, ", nome [-1])



else:
    print(' nada foi digitado')





