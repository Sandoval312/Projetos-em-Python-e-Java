#Todas as condições precisam ser True.

entrada = input('Selecione: [E]ntrar  [S]air')

senha_digitada = input ("digite a senha: ")


senha_permitida = 'cachorro01'


if (entrada == 'E' or entrada =='e') and senha_digitada == senha_permitida:
    print ("Senha correta, acesso permitido! ")

else:
    print ("Senha incorreta OU escolheu SAIR")