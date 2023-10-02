# POO 

Estructura en app java:

funciones (métodos) -> clases -> packages -> {módulos} -> proyecto


### Conceptos básicos POO 

1. Abstracción
2. Encapsulación --> visibilidad
3. Composición
4. Herencia
5. Polimorfismo

Laboratorios: LabAnimals Fase 1

## Encapsulación --> visibilidad

Cuatro tipos de visibilidad:

1. public --> el elemento se ve desde fuera de la clase y desde fuera del paquete.

public se puede aplicar a: atributos, métodos y clases.

2. private --> el elemento sólo es visible (accesible) desde dentro de la propia clase.

3. por defecto (no tiene modificador de visibilidad) -- visibilidad sin nombre: el elemento es visible desde la misma clase y también desde las clases que se hallan en el mismo paquete -- default package visibility.

4. protected ---

### import 

- Hay que importar las clases que queremos usar y que estan en paquetes distintos.

- Sólo podremos importar aquellas clases que tengan visibilidad compatible.

### hiding

Cuando un parámetro (o una variable local) tiene el mismo nombre que un atributo, el parámetro (o variable local) "esconde" (hide) el atributo (el atributo no es accesible, pues está escondido).

Solución: prefijar el nombre del atributo con la autoreferencia ``this``.

Por ejemplo: ``this.height``

### Constructores

```java
	//TODAS LAS CLASES TIENEN
	//UN CONSTRUCTOR POR DEFECTO
	//(QUE NO ES NECESARIO ESCRIBIR)
	//SOLO SI EL PROGRAMADOR/A NO 
	//HA DEFINIDO SU PROPIO CONSTRUCTOR
	public Square(double side) {
		//INICIALIZACIÓN DEL ESTADO
		this.side = side;
		System.out.printf("Cuadrado construido con lado igual a %f %n",
				this.side);
	}
```

Recomendable siempre inicializar el estado del objeto 
en el constructor.

Podemos programar tantos constructores como queramos, con 
la condición que cada constructor, respecto de los otros
constructores, tiene que tener:

- diferente número de parámetros
- diferente tipo de datos de los parámetros

```java
public Rectangle(){}
public Rectangle(double base){...}
public Rectangle(double base, double height){...}
public Rectangle(double height){...}
```