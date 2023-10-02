# POO 

### Conceptos básicos POO 

1. Abstracción
2. Encapsulación --> visibilidad
3. Composición
4. **Herencia**
5. **Polimorfismo**

## Enums

Se usan los enums cuando queremos o tenemos un número finito bien definido de posibles valores, que además son immutables.

Los enums tienen un método ``toString()`` por defecto:
te retorna el nombre del atributo (BLUE, YELLOW, etc.)

Pero si tu defines tu propio ``toString()`` se va a 
"machacar" el toString por defecto.

El ``System.out.print....`` siempre busca el toString()

**Toda classe** tiene un toString() "por defecto" que
devuelve el nombre cualificado de la clase más 
la dirección en memoria del objeto.

Las clases especializadas (que heredan) se llaman clases hijas o subclases

La clase generales (de las que se hereda) se llaman
clases padre/madre o superclase.


**EN JAVA EXISTE UN SUPERCLASE DE TODAS LA CLASES
QUE EXISTEN O QUE PUEDAN EXISTIR**

> ES LA CLASE DE LA QUE HEREDAN / EXTIENDEN / DERIVAN 
TODAS LAS CLASES DE JAVA (POR DEFECTO) (no es necesario
escribir el extends).

``OBJECT``

Qué método me podeis decir que tiene la clase OBJECT?

``toString()`` --> me imprime la dirección de memoria ...



