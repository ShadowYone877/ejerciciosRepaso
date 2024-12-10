import java.util.Stack;

public class PilaDeshordenadaYPilaOrdenada {
    public static void main(String[] args) {
        // Crear la pila original y añadir elementos.
        Stack<Integer> pilaOriginal = new Stack<>();
        pilaOriginal.push(3);
        pilaOriginal.push(5);
        pilaOriginal.push(2);
        pilaOriginal.push(1);
        pilaOriginal.push(4);

        // Imprimir la pila original.
        System.out.println("Pila original: " + pilaOriginal);

        // Crear una pila auxiliar para mantener los elementos ordenados.
        Stack<Integer> pilaOrdenada = new Stack<>();

        // Ordenar los elementos de la pila original.
        while (!pilaOriginal.isEmpty()) { // Mientras la pila original no esté vacía.
            // Sacar el elemento superior de la pila original.
            int temp = pilaOriginal.pop();

            // Mover elementos de la pila ordenada a la pila original si son mayores que temp.
            while (!pilaOrdenada.isEmpty() && pilaOrdenada.peek() > temp) {
                pilaOriginal.push(pilaOrdenada.pop());
            }

            // Insertar el elemento temporal en la pila ordenada.
            pilaOrdenada.push(temp);
        }

        // Imprimir la pila ordenada.
        System.out.println("Pila ordenada: " + pilaOrdenada);
    }
}
