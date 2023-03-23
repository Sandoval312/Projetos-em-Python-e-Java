salarioBruto=float(input("digite o salario:"))
prevsocial=float(( salarioBruto/100)*10)
sub=float(salarioBruto-prevsocial)
m=float((sub / 100)*5)
sub2= sub-m
print ("seu salário é R${:.3f},com descontos".format(sub2))