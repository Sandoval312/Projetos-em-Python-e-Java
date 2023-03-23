matriculas = int (input('informe a matricula'));
di = matriculas // 100000
m = di * 100000
sub = matriculas - m
div2 = sub // 10000
print ("o ano da matricula é; {} ,e o semestre é {}".format(di,div2))