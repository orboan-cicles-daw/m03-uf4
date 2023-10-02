# POO 

Clases:
- Agrupar métodos
- Representar Objetos del Mundo Real mediante ABSTRACCIÓN:
    * Estado: los valores que toman el conjunto de atributos en un momento dado. Puede cambiar con el tiempo.
    * Comportamiento: el conjunto de acciones (métodos) que un objeto puede hacer.
- La clase Main (también llamada App, Application, Driver...)

> Los ficheros de código fuente en Java tienen la extensión ``.java`` y su nombre DEBE coincidir exactamente con el nombre de la **clase pública** que deben contener. Cada fichero debe contener una y sólo una clase pública.

Proyectos con Eclipse

Métodos estaticos

Atributos

- static: para que los elementos (atributos / métodos) sean de clase, es decir, se pueda acceder a estos elementos con el nombre de la clase (sin necesidad de instanciar ningún objeto). Por ejemplo:

```java
Math.PI;
Notas.notaMaxima(notas);
```
- public: visibilidad pública: los elementos (atributos y métodos) públicos son accesibles desde fuera de la clase, desde cualquier ubicación exterior.

- final (aplicado a un atributo): el valor no se puede cambiar (es un valor constante). Se suele nombrar este tipo de atributo en mayúscula. Ejemplo: ``Math.PI``

> Atributo (o campo / o propiedad): son simplemente variables que estan a nivel de clase (no está dentro de ningún método). **Tienen siempre un valor por defecto**.

> Método: son simplemente funciones que se encuentran ubicadas dentro de clases. En java todas las funciones son métodos.

> Variable local: es una variable que se ha declarado dentro de un método. **No tienen nunca ningún valor por defecto** (hay que darles un valor obligatoriamente).


### Conceptos básicos POO 

1. Abstracción
2. Encapsulación --> visibilidad
3. Herencia
4. Polimorfismo

Laboratorios: LabAnimals Fase 1

### Packages (paquetes)

Sirven para agrupar clases. Por distintos motivos.

Cada paquete es habitual que su nombre empiece por el nombre de dominio invertido de la empresa.

pluralcamp.com -----> com.pluralcamp.loquesea.loqueseamas.

midomino.es -----> es.midominio.loquesa

El nombre del package + el nombre de la clase = 
        nombre cualificado de la clase.
        
La clase Math de la API de Java tiene como nombre 
cualificado java.lang.Math

> La primera línea de código en todo fichero .java es siempre
> y antes de cualquier otro código, la línea del ``package``.
