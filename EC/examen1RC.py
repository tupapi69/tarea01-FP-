nota = int(input("escribir nota del postutate "))
a= 0
if(nota >= 17 ):
  a=4
  print('level 4')
elif(nota >= 14):
  a=3
  print('level 3')
elif(nota >= 11):
  a=2
  print('level 2')
else:
  a=1
  print('level 1, y ya no puede obtener la vacante')
