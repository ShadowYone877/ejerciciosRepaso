// Importa las clases necesarias para manejar estructuras de datos como Stack, Queue y List
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

// Clase principal donde se ejecuta el programa
public class MainPersona {

    // Método principal, punto de entrada del programa
    public static void main(String[] args) {

        // Crea una pila (LIFO: Last In, First Out) para almacenar objetos Persona
        Stack<Persona> pilaPersonas = new Stack<>();

        // Crea una cola (FIFO: First In, First Out) para almacenar objetos Persona
        Queue<Persona> colaPersonas = new LinkedList<>();

        // Crea una lista genérica para almacenar objetos Persona
        List<Persona> listaPersonas = new ArrayList<>();

        // Crea tres objetos Persona con sus respectivos atributos
        Persona persona1 = new Persona("Jorge", 25, 1.70); // Persona con nombre Jorge
        Persona persona2 = new Persona("Maria", 30, 1.50); // Persona con nombre Maria
        Persona persona3 = new Persona("Pedro", 28, 1.90); // Persona con nombre Pedro

        // Añade la persona1 a la pila
        pilaPersonas.push(persona1); // Se agrega al tope de la pila

        // Añade la persona2 a la cola
        colaPersonas.add(persona2); // Se agrega al final de la cola

        // Añade la persona3 a la lista
        listaPersonas.add(persona3); // Se agrega al final de la lista

        // Recorre los elementos de la pila y los imprime
        for (Persona persona : pilaPersonas) {
            // Usa el método toString() de Persona para mostrar información de cada objeto en la pila
            System.out.println("Persona en la pila: " + persona.toString());
        }

        // Recorre los elementos de la cola y los imprime
        for (Persona personita : colaPersonas) {
            // Usa el método toString() de Persona para mostrar información de cada objeto en la cola
            System.out.println("Persona en la cola: " + personita.toString());
        }

        // Recorre los elementos de la lista y los imprime
        for (Persona personota : listaPersonas) {
            // Usa el método toString() de Persona para mostrar información de cada objeto en la lista
            System.out.println("Persona en la lista: " + personota.toString());
        }
    }
}