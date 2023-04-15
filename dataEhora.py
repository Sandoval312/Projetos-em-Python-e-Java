#Faça um programa que pergunte a hora ao usuário e, baseando-se no horário 
#descrito, exiba a saudação apropriada. Ex. 
#Bom dia 0-11, Boa tarde 12-17 e Boa noite 18-23.

horas = input(" informe as horas sem os minutos: ")
try:
    horas_int = int (horas)

    if horas_int >=0 and horas_int <= 11:
        print ("BOM DIA")

    elif horas_int >= 12 and horas_int <= 17:
        print ("BOA TARDE")

    elif horas_int >= 18 and  horas_int <= 23:
        print ("BOA NOITE")

    else:
        print ("hora nao valida")

except:
    print ("digite uma hora valida ")
