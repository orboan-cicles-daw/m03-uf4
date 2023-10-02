# POO 

### Conceptos básicos POO 

1. Abstracción
2. Encapsulación --> visibilidad
3. Composición
4. **Herencia**
5. **Polimorfismo**

### Overloading (sobrecarga)

- Overloading de constructores
- Overloading de métodos

> La sobrecarga es posible cuando los métodos, que tienen el mismo nombre, se diferencían entre ellos por el:
    - número de parámetros
    - el tipo de dato de los parámetros

### Overriding (sobreescritura)

Hacer un override es simplemente escribir mi propia implementación de un método que viene
heredado (de una superclase o de un interfície).

> Todo lo que tenga la clase Object, lo van a tener
todas las clases de Java, porque todas derivan
de Object.

#### ``super`` vs ``this``

- En los métodos
- En los constructores: ``super()`` vs ``this()``

[Java constructores super() y this()](https://www.arquitecturajava.com/java-constructores-y-super/)

#### Visibilidad protected

Visibilidad desde la propia clase más desde 
cualquier clase derivada (esté en el paquete
que esté).

#### Clases y métodos abstractos

Un método abstrcato es aquel que no tiene
ninguna implementación. Sólo define la visibilidad,
el tipo de dato de retorno y la firma del método
(el nombre y los parámetros). > La implementación
se deja para las clases derivadas, que tienen que 
hacer el override de forma obligatoria.

Una clase abstracta: es toda clase que tiene, por
lo menos, un método abstracto (puede tener más 
métodos abstractos y no abstractos -concretos-).

Una clase abstracta **no se puede instanciar** (no
podemos crear objectos con ``new``).

## Interfaces

- An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. 
- An interface in Java is a blueprint of a behaviour. 
- A Java interface contains static constants and abstract methods.

> Un método abstracto que pertenece a una interfície no es necesario marcarlo
con ``abstract`` porque por defecto los métodos de las interfícies son
abstractos (no tienen implementación).

> Un método abstracto que pertenece a una clase abstracta, sí es obligatorio
marcarlo con ``abstract``.

**default method**:

> Un método con implementación por defecto, es obligatorio marcarlo con
``default`` si se está en una interfície, pero si está en una superclasse
(abstracta o no) NO se puede ni se debe marcar con ``default``.

Los métodos de las interfícies tienen (por defecto) visibilidad **pública** (a 
diferencia de las clases, que tienen por defecto visibilidad **default** o 
**package**).

Los métodos abstractos y los _default methods_ de una interfície **no pueden
ser privados**.

En una interfíce sólo pueden ser privados métodos _helper_ o auxiliares a 
utilizar por un _default method_ y poder aplicar el principio de **single
responsability**.

### Polimorfismo de interfícies

Ver LabAnimals, fase 3


---
- Para mañana: casting en el polimorfismo.
- Lab Vehicles
- Generics / Collections




 



