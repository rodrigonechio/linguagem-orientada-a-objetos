import math 

class Circulo:
PI = math.pi

def __init__(self, raio=1.0, cor="Branco"):
    self.raio = raio
    self.cor = cor
    self.circuferencia = self.calcCircunferencia()
    self.area = self.calcArea()

def calcArea(self):
    return Círculo.PI * (self.raio ** 2)

def calcCircunferencia(self):
    return 2 * Círculo.PI * self.raio

@staticmethod
def calcAreaEstatico(raio):
    return Círculo.PI * (raio ** 2)

@staticmethod
def calcCircunferenciaEstatico(raio):
    return 2 * Círculo.PI * raio

def getRaio(self):
    return self.raio

def getCor(self):
    return self.cor

def main():
    circulo1 = Circulo()
    circulo2 = Circulo(5)
    circulo3 = Circulo(7, "Azul")

print("Circulo1 - Raio:", circulo1.getRaio(), "Cor:", circulo1.getCor(),
 "Área:", circulo1.calcArea(), "Circunferência:", calcCircunferencia())
