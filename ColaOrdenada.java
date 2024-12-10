import java.util.LinkedList;
import java.util.Queue;

public class ColaOrdenada {
    public static void main(String[] args) {
        // Crear la cola original y añadir elementos.
        Queue<Character> colaOriginal = new LinkedList<>();
        colaOriginal.add('c');
        colaOriginal.add('e');
        colaOriginal.add('b');
        colaOriginal.add('a');
        colaOriginal.add('d');

        // Imprimir la cola original.
        System.out.println("Cola original: " + colaOriginal);

        // Crear una lista para facilitar el ordenamiento.
        LinkedList<Character> listaAuxiliar = new LinkedList<>(colaOriginal);

        // Ordenar la lista auxiliar alfabéticamente.
        listaAuxiliar.sort(null); // Usa el comparador natural (alfabético para caracteres).

        // Vaciar la cola original y rellenarla con los elementos ordenados.
        colaOriginal.clear();
        colaOriginal.addAll(listaAuxiliar);

        // Imprimir la cola ordenada.
        System.out.println("Cola ordenada: " + colaOriginal);
    }
}
