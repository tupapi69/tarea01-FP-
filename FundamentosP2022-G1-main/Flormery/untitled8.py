# -*- coding: utf-8 -*-
"""Untitled8.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1ugfcTxchVCeN24pcsaVNAOWTuux8_j11
"""

#defenir variables 
costo:float
pago:float
MCU:float
#datos de entrada
MCU=float(input("ingrese los MCU usados: "))
costo=float(input("ingrese los soles por MCU:"))
#proceso
pago=(MCU*costo)
#datos de salida 
print(f"total de pagar en soles: ",pago)