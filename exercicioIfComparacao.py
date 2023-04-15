#comparação de maior valor string ou numerico

primeiro_valor = input ("Digite um valor A: ")
segundo_valor = input  ("digite o segundo valor B: ")

if primeiro_valor == segundo_valor:
    print ("Os dois valores são iguais! ")

elif primeiro_valor >= segundo_valor:
   
    print ("O valor A, {} é maior que o valor B  {}".format (primeiro_valor, segundo_valor))

else:
    print ("O segundo valor B, {} é maior que o primeiro valor A {}" .format (segundo_valor, primeiro_valor))  

