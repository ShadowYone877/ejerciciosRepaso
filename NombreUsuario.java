// Importamos las librerías necesarias para usar Stack, Queue y ArrayList y Scanner

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;  // Importamos Scanner para leer datos del teclado

public class NombreUsuario {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);  // Creamos un Scanner para leer datos del teclado
        // El nombre a insertar letra por letra
        System.out.println("Ingresa tu nombre:");
        String nombre =  sn.next(); // Aquí puedes ingresar tu nombre

        // Crear una pila (Stack)
        Stack<Character> pila = new Stack<>(); // Creamos una pila para caracteres
        for (char letra : nombre.toCharArray()) { // Iteramos cada letra del nombre
            pila.push(letra); // Agregamos la letra a la pila
        }
        System.out.println("Pila: " + pila); // Mostramos el contenido de la pila

        // Crear una cola (Queue)
        Queue<Character> cola = new LinkedList<>(); // Usamos LinkedList como implementación de Queue
        for (char letra : nombre.toCharArray()) { // Iteramos cada letra del nombre
            cola.add(letra); // Agregamos la letra a la cola
        }
        System.out.println("Cola: " + cola); // Mostramos el contenido de la cola

        // Crear un ArrayList
        List<Character> lista = new ArrayList<>(); // Creamos un ArrayList para caracteres
        for (char letra : nombre.toCharArray()) { // Iteramos cada letra del nombre
            lista.add(letra); // Agregamos la letra al ArrayList
        }
        System.out.println("ArrayList: " + lista); // Mostramos el contenido del ArrayList
    }
}

