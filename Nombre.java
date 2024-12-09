// Importamos las librerías necesarias para usar Stack, Queue y ArrayList

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Nombre {

    public static void main(String[] args) {
        // Crear una pila (Stack)
        Stack<String> pila = new Stack<>();
        pila.push("Jorge"); // Agregamos "Jorge" a la pila
        System.out.println("Pila: " + pila); // Mostramos el contenido de la pila

        // Crear una cola (Queue)
        Queue<String> cola = new LinkedList<>(); // Usamos LinkedList como implementación de Queue
        cola.add("Jorge"); // Agregamos "Jorge" a la cola
        System.out.println("Cola: " + cola); // Mostramos el contenido de la cola

        // Crear un ArrayList
        List<String> lista = new ArrayList<>(); // Creamos un ArrayList
        lista.add("Jorge"); // Agregamos "Jorge" al ArrayList
        System.out.println("ArrayList: " + lista); // Mostramos el contenido del ArrayList
    }
}
