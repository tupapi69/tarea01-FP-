# -*- coding: utf-8 -*-
"""Untitled1.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1N6f4l2RjVW3YejJD2MpKB8HvvV2KzgWF
"""

#Definir variables
velocidad:float
distancia:float
tiempo:float
#Datos de entrada 
velocidad=int(input("dame la v: "))
distancia=int(input("dame la d: "))
#proceso
tiempo=(distancia/velocidad)
#Datos de salida
print(f"el tiempo de manejo es: ",tiempo)

from math import isfinite
#Definir.
minutos:float
costo:float
#Datos de entradas 
minutos=int(input("ingrese la cantidad de minutos: "))
costo=int(input("ingrese el precio por minuto: "))
#proceso
total=(minutos*costo)
#Datos de salida 
print(f"el costo a pagar es: ",total)