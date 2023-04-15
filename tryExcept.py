#basico de try e except


numero = input ("vou dobrar o numero que vc digitar: ")

try:
    num1 = int(numero)
    par_impar = num1 % 2 == 0
    par_impar_txt = "impar"
    
    if par_impar:
        par_impar_txt= " par"

    print (f"O numero digitado foi {num1}, ele é  {par_impar_txt}")


except:
    print ("isso nao é um Número inteiro" )

