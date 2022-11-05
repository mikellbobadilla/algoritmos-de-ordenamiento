# Algoritmo por Inserción

Es un algoritmo de ordenamiento que require 0(n^2) operaciones para ordenar una lista de n numeros. Su funcionamiento es el siguiente.

El elemento del array se ordena, si el elemento que está a su izquierda es mayor que el; si lo es, se intercambiar los valores. El elemento se sigue moviendo hacia la izquierda haste que el elemento sea menor que el mismo ó hasta llegar al limite izquierdo. 

Es basico, siempre va estar ordenado hacia la izquierda y a su derecha desordenado.

## PSeudocodigo

```
PROCESO ordenar numeros por insercion:
  DEFINIR numeros COMO ENTERO;
  DEFINIR posicion COMO ENTERO;
  DEFINIR auxiliar COMO ENTERO;

  DIMENSION numeros[6] = {6, 4, 2, 1, 3, 5};

  DESDE i=0 HASTA 6 HACER:
    posicion = i;
    auxiliar = numeros[i]
    MIENTRAS (posicion > 0) AND (numeros[posicion - 1] > axuliar) HACER:
      numeros[posicion] = numeros[posicion];
      position--;
    FIN MIENTRAS
    numeros[position] = auxiliar;
  FIN DESDE;

FIN PROCESO
```

En el fichero  encontraras ejemplos implementados en **java** y en **C**, pero si quieres usar otro lenguaje puedes basarte en el **pseudocodigo**.

## Guia COMO compilar en **C**

En la carpeta de Seleccion se encuentra la guia para poder compilar la aplicacion en **C**