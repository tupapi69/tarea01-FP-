import os

antiguedad = float (input ('Ingresa el valor de antiguedad: '))
sueldo = float (input ('Ingresa el valor de sueldo: '))
if antiguedad>4 or sueldo<2000:
    bono_navideno=sueldo*0.25
else:
    bono_navideno=sueldo*0.2
print ('Valor de bono navideno: ' + repr (bono_navideno))
print ()
os.system ('pause')