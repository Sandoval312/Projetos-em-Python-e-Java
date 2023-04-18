""""
Tabela do Imposto de Renda 2023
até R$ 1.903,98 - Isento - R$ 0.
de R$ 1.903,99 a R$ 2.826,65 - 7,5% - R$ 142,80.
de R$ 2.826,66 a R$ 3.751,05 - 15% - R$ 354,80.
de R$ 3.751,06 a R$ 4.664,68 - 22,5% - R$ 636,13.
acima de R$ 4.664,68 - 27,5% - R$ 869,36.
"""

salario = float(input("Digite seu salário: "))

if salario <= 1903.98:
    print (" Isento de imposto")

elif salario >= 1903.99 and salario <= 2826.65:
    conta = (salario /100)*7.5
    print ("O valor do imposto a ser pago é: {:.2f}".format (conta))

elif salario >= 2826.66 and salario <= 3751.05:
    conta = (salario /100)*15
    print ("O valor do imposto a ser pago é: {:.2f}".format (conta))

elif salario >= 3751.06 and salario < 4664.68:
    conta = (salario /100)*22.5
    print ("O valor do imposto a ser pago é: {:.2f}".format (conta))

elif salario >= 4664.68:
    conta = (salario /100)*27.5
    print ("O valor do imposto a ser pago é: {:.2f}".format (conta))