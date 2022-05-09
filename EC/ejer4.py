import os, sys

numero_de_alumnos = float (input ('Ingresa el valor de numero de alumnos: '))
print ('Selecciona el valor de tipo de pago.')
print ('\t1.- Cr\u00E9dito')
print ('\t2.- Contado')
sys.stdout.write ('\t')
tipo_de_pago = 0
while tipo_de_pago<1 or tipo_de_pago>2:
    tipo_de_pago = int (input (': '))
    if tipo_de_pago<1 or tipo_de_pago>2:
        sys.stdout.write ('Valor incorrecto. Ingr\u00E9salo nuevamente.')
costo_del_pasaje=70
if numero_de_alumnos>=20:
    costo_del_pasaje=40
if numero_de_alumnos>=40:
    costo_del_pasaje=35
if numero_de_alumnos>100:
    costo_del_pasaje=20
if tipo_de_pago==1:
    incremento=costo_del_pasaje*0.15
else:
    incremento=costo_del_pasaje*0.06
pago_total=numero_de_alumnos*(costo_del_pasaje+incremento)
print ('Valor de costo del pasaje: ' + repr (costo_del_pasaje))
print ('Valor de incremento: ' + repr (incremento))
print ('Valor de pago total: ' + repr (pago_total))
print ()
os.system ('pause')