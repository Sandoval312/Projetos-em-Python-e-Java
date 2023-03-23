#o imc e calculado dividindo o peso( em kg)pela altura ao quadrado (em M)a formula é IMC + PESO / (ALTURA* ALTURA) o resultado e dado em kg/m2.


nome = input ("Qual é seu nome: ")

peso = int (input ("Digite seu peso: "))

altura = float (input ("Digite sua altura em M: "))

formula =(peso/(altura * altura))
 


print ("Olá {}, seu IMC é de {:.3f}!" .format (nome, formula))


