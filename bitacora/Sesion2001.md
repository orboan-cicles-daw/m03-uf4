# POO 

## Generics y Collections (continuación)

- Finalizaremos el ejercicio del ``Pair``.

https://github.com/orboan-java-nb-programming-exercises/ep-cat-java-nb-generics-collections-00.git


## Slides:

https://github.com/orboan-daw/m032/blob/main/uf5/Collections.pdf

# Exceptions

https://github.com/orboan-daw/m031/blob/main/uf3/excepcions/Exceptions.pdf


Todas las excepciones, por convenio, su nombre acaba con Exception.
Por ejemplo:

```java
FileNotFoundException
IOException
NullPointerException
IndexOutOfBoundsException
```

La superclase de todas las excepciones es ``Exception``.

Yo, como programador, me puedo crear mis propias clases de excepciones.

Si lo hago, tengo que:

1. Seguir el convenio de nombres, por ejemplo: ``MaintenanceException``
2. Mi clase de excepción **debe** extender una excepción de la API de Java.

> Sólo haciendo el ``extends`` se podrá considerar a mi clase una
excepción.

Hemos hecho el ejercicio de escrbir en un fitxero a partir de un FileWriter
usado en la classe ListOfNumbers:

```java
public class ListOfNumbers {

	private List<Integer> list;
	private static final int SIZE = 10;
	
	public ListOfNumbers() {
		this.list = new ArrayList<Integer>(SIZE);
		for(int i = 0; i < SIZE; i++) {
			this.list.add(i * 3);
		}
	}
	
	public void writeList() throws MaintenanceException {
		FileWriter writer;
		try {
			writer = new FileWriter("output.txt");
			PrintWriter out = 
					new PrintWriter(writer);
			for (int i = 0; i < SIZE; i++) {
				out.println("Value at " + i + " = " + 
								this.list.get(i));
			}
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//System.err.println(e.getMessage());
			throw new MaintenanceException("Mantenimiento");
//			try {
//				throw new MaintenanceException("Mantenimiento");
//			} catch (MaintenanceException ex) {
//				System.out.println(ex.getMessage());
//			}
		} 
	}
}
```

Luego, nos hemos creado nuestra propia excepción:


```java
public class MaintenanceException extends IOException {

	private static final long serialVersionUID = 1L;

	public MaintenanceException(String message) {
		super(message);
	}
}
```

