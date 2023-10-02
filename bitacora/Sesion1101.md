# POO 

### Conceptos básicos POO 

1. Abstracción
2. Encapsulación --> visibilidad
3. Composición
4. Herencia
5. Polimorfismo

## Figuras

![figuras básicas](images/figuras.png)


[Tabla Colores con valores fijos](https://support.microsoft.com/en-us/office/rgb-function-aa04db19-fb8a-4f58-9ad6-71a1f5a43e94)

[Gráfico colores RGB](https://cs.calvin.edu/activities/connect/CompRenew/03programming/01color.png)


> Refactorizar código: modificar código sin que el programa deje de funcionar o sin que el programa haga una cosa distinta.

### final

Hemos visto ejemplos de cómo conseguir que atributos sean immutables.

## Composición

Ejemplo Figuras y Color.

Ejemplos adicionales en:

[Composición con Java](https://www.arquitecturajava.com/java-composicion-y-la-reutilizacion-del-codigo/)

### Ejercicio

Los cuadrados se van a construir con el lado y el color directament, sin setters, y ambos (lado y colores) no se van a poder modificar una vez creado el objeto cuadrado:

- atributos deben ser final
- sin setters
- crear la correspondiente sobrecarga del constructor
- finalmente modificar el main accordingly