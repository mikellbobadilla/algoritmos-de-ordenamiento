# Algoritmo de Burbuja

El algoritmo de burbuja se base revisando cada elemento de la lista que va a ser ordenada intercambiandolos de posicion si estan en el orden equivocado. El problema es que tenemos que recorrer varias veces el arreglo hasta que esten todos ordenados. Tambien es el algoritmo menos eficiente, por ende solo deberian usarse para arreglos de tamaños pequeños.

## Pseudocodigo

```
PROCESO ordenar por burbuja:
  DEFINIR numeros COMO ENTERO;
  DEFINIR auxiliar COMO ENTERO;

  DIMENSION numeros[6] = {6, 4, 2, 1, 3, 5};

  DESDE i=0 HASTA 6 HACER:
    DESDE j=i+1 HASTA 6 HACER:
      SI numeros[i] > numeros[j] ENTONCES:
        auxiliar = numeros[i];
        numeros[i] = numeros[j];
        numeros[j] = auxiliar;
      FIN SI
    FIN DESDE
  FIN DESDE

FIN PROCESO 
```

El algoritmo de Burbuja no es el mas eficiente, pero si es bueno con arreglos de pocode indices.
EN los ficheros encontraras los ejemplos implementados en **java** y en **C**, respecto a **C** esta implementado con **punteros**, pero si no tienes conocimientos sobre **punteros**, puedes basar en **java**, o si quieres usar oto lenguaje puedes basarte en el **pseudocodigo**.