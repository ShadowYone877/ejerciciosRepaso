
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class EstructurasOrdenadas {

    public static void main(String[] args) {
        // Arreglos iniciales
        int[] numeros = {3, 5, 2, 1, 4};
        char[] letras = {'c', 'e', 'b', 'a', 'd'};

        // Ordenar y mostrar para números
        System.out.println("---- Números ----");
        ordenarConPila(numeros);
        ordenarConCola(numeros);
        ordenarConArrayList(numeros);

        // Ordenar y mostrar para letras
        System.out.println("---- Letras ----");
        ordenarConPila(letras);
        ordenarConCola(letras);
        ordenarConArrayList(letras);
    }

    // Método para ordenar y mostrar con una pila
    public static void ordenarConPila(int[] arreglo) {
        Stack<Integer> pilaOriginal = new Stack<>();
        Stack<Integer> pilaOrdenada = new Stack<>();

        // Llenar la pila original
        for (int num : arreglo) {
            pilaOriginal.push(num);
        }

        // Ordenar usando una pila auxiliar
        while (!pilaOriginal.isEmpty()) {
            int temp = pilaOriginal.pop();
            while (!pilaOrdenada.isEmpty() && pilaOrdenada.peek() > temp) {
                pilaOriginal.push(pilaOrdenada.pop());
            }
            pilaOrdenada.push(temp);
        }

        // Mostrar resultado
        System.out.println("Pila (números): " + pilaOrdenada);
    }

    public static void ordenarConPila(char[] arreglo) {
        Stack<Character> pilaOriginal = new Stack<>();
        Stack<Character> pilaOrdenada = new Stack<>();

        // Llenar la pila original
        for (char c : arreglo) {
            pilaOriginal.push(c);
        }

        // Ordenar usando una pila auxiliar
        while (!pilaOriginal.isEmpty()) {
            char temp = pilaOriginal.pop();
            while (!pilaOrdenada.isEmpty() && pilaOrdenada.peek() > temp) {
                pilaOriginal.push(pilaOrdenada.pop());
            }
            pilaOrdenada.push(temp);
        }

        // Mostrar resultado
        System.out.println("Pila (letras): " + pilaOrdenada);
    }

    // Método para ordenar y mostrar con una cola
    public static void ordenarConCola(int[] arreglo) {
        Queue<Integer> colaOriginal = new LinkedList<>();
        List<Integer> listaAuxiliar = new ArrayList<>();

        // Llenar la cola original
        for (int num : arreglo) {
            colaOriginal.add(num);
        }

        // Copiar a una lista auxiliar y ordenar
        listaAuxiliar.addAll(colaOriginal);
        listaAuxiliar.sort(null);

        // Rellenar la cola con los elementos ordenados
        colaOriginal.clear();
        colaOriginal.addAll(listaAuxiliar);

        // Mostrar resultado
        System.out.println("Cola (números): " + colaOriginal);
    }

    public static void ordenarConCola(char[] arreglo) {
        Queue<Character> colaOriginal = new LinkedList<>();
        List<Character> listaAuxiliar = new ArrayList<>();

        // Llenar la cola original
        for (char c : arreglo) {
            colaOriginal.add(c);
        }

        // Copiar a una lista auxiliar y ordenar
        listaAuxiliar.addAll(colaOriginal);
        listaAuxiliar.sort(null);

        // Rellenar la cola con los elementos ordenados
        colaOriginal.clear();
        colaOriginal.addAll(listaAuxiliar);

        // Mostrar resultado
        System.out.println("Cola (letras): " + colaOriginal);
    }

    // Método para ordenar y mostrar con un ArrayList
    public static void ordenarConArrayList(int[] arreglo) {
        List<Integer> lista = new ArrayList<>();

        // Llenar el ArrayList
        for (int num : arreglo) {
            lista.add(num);
        }

        // Ordenar el ArrayList
        lista.sort(null);

        // Mostrar resultado
        System.out.println("ArrayList (números): " + lista);
    }

    public static void ordenarConArrayList(char[] arreglo) {
        List<Character> lista = new ArrayList<>();

        // Llenar el ArrayList
        for (char c : arreglo) {
            lista.add(c);
        }

        // Ordenar el ArrayList
        lista.sort(null);

        // Mostrar resultado
        System.out.println("ArrayList (letras): " + lista);
    }
}
