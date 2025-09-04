
frase = input("Ingresa una frase: ")
print("\nFrase original:")
print(frase)


print("\nFrase en mayúsculas:")
print(frase.upper())

palabras = frase.split()
print("\nLista de palabras:")
print(palabras)

print("\nCada palabra en mayúsculas:")
for palabra in palabras:
    print(palabra.upper())

buscar = input("\nEscribe una palabra para contar cuántas veces aparece: ")
cantidad = frase.count(buscar)
print("La palabra '" + buscar + "' aparece " + str(cantidad) + " veces.")

vieja = input("\nEscribe la palabra que quieres reemplazar: ")
nueva = input("Escribe la nueva palabra: ")
frase_modificada = frase.replace(vieja, nueva)
print("\nFrase modificada:")
print(frase_modificada)
