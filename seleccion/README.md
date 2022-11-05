# Algoritmo por selección

Es un algoritmo de ordenamiento que require 0(n^2) operaciones para ordenar una lista de n numeros. Su funcionamiento es el siguiente.

- Buscar el numero minimo de la lista.
- Intercambiar con el primer elemento.
- Buscar el minimo resto de la lista.
- Intercambiar con el segundo.
- Sucesivamente.

## Explicación de como se ordena

**PSeudocodigo**

```
PROCESO ordernar numeros por seleccion:
  DEFINIR numeros como ENTERO;
  DEFINIR temporal como ENTERO;
  DEFINIR minimo como ENTERO;

  DIMENSION numeros[6] = {6, 4, 2, 1, 3, 5};

  DESDE i=0 HASTA 6 HACER:
    minimo = i;
    DESDE j=i+1 HASTA 6 HACER:
      SI numeros[j] < numeros[minimo] ENTONCES:
        minimo = j;
      FIN SI
    FIN DESDE

    temporal = numeros[i];
    numeros[i] = numeros[minimo];
    numeros[minimo] = temporal;
  FIN DESDE
FIN PROCESO
```

Cuando declaramos el segundo for como se ve en el segundo **pseudocodigo** puede que tengas la idea de inicializar **j** en **1**, si lo hacer el **algoritmo** no funcionará. El objetivo que hace **j=i+1** es obligadamente tomar el siguiente elemento para poder compararlo, de otra forma solo estario recorriendo el array y no podria ordenarlo.

En el fichero encontraras un ejemplo de implementacion con dos lenguajes de programacion para que se pueda entender mejor los lenguajes de programacion elejidos don **"java"** y **"c"**, pero si quires usar otro, te podes guiar con el **pseudocodigo** para que lo puedas implementar.

El tipo de implementacion de **C** Se esta utilizando **punteros** creada con **malloc**, lo que hace es crear un espacion en memoria en el **Heap** o en español **monticulo**. Si queres mas informacion sobre punteros, puedes buscar en google ya que hay mucha info sobre ello.

pd: Puedes usar la sintaxis que conoces en **C**, ya que lo importante es el concepto.
 
## Guia para que puedar compilar en **C**

En tu **PC** deberia tener instalado el compilador de c para que puedar hacer pruebas.

**Comandos**

```shell
# Para compilar
gcc -o selection <ruta del archivo> 

# Para ejecutar
# solo seleccionar el archivo que te generó example:
./selection
```

El flag **-o** (output) le da un nombre al archivo ya compilado para que puedas ejecutar ese binario.