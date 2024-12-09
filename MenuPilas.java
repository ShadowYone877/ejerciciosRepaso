import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MenuPilas {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner opc = new Scanner(System.in);
        
        // Crear una pila para almacenar números enteros
        Stack<Integer> pila = new Stack<>();
        
        // Crear una pila para almacenar caracteres
        Stack<Character> pila2 = new Stack<>();
        
        // Crear una cola para almacenar números enteros
        Queue<Integer> cola = new LinkedList<>();
        
        // Crear una cola para almacenar cadenas
        Queue<String> cola2 = new LinkedList<>();
        
        // Crear una lista de objetos del tipo MenuPilas
        List<MenuPilas> lista2 = new ArrayList<>();
        
        // Crear una lista para almacenar números enteros
        List<Integer> lista = new ArrayList<>();
        
        // Crear una instancia de MenuPilas y agregarla a la lista
        MenuPilas m1 = new MenuPilas();
        lista2.add(m1);

        // Definir un arreglo de caracteres
        char[] a = {'a', 'b', 'c', 'd', 'e'};
        
        // Definir un arreglo de cadenas
        String[] b = {"Hola", "Mundo", "Esto", "Es", "Un", "Ejemplo"};

        // Variable para almacenar la opción seleccionada por el usuario
        int opcion;

        // Bucle para mostrar el menú hasta que el usuario elija salir
        do {
            // Imprimir el menú de opciones
            System.out.println("\nBienvenido al menu de pilas, colas y ArrayLists");
            System.out.println("1. Agregar dato a la pila");
            System.out.println("2. Agregar dato a la cola");
            System.out.println("3. Agregar dato al ArrayList");
            System.out.println("4. Mostrar pila con arreglo");
            System.out.println("5. Mostrar arreglo cola");
            System.out.println("6. Mostrar objeto en Lista");
            System.out.println("7. Mostrar pila");
            System.out.println("8. Mostrar cola");
            System.out.println("9. Mostrar ArrayList");
            System.out.println("10. Salir");
            System.out.print("Elige una opción: ");
            
            // Leer la opción seleccionada
            opcion = opc.nextInt();

            // Evaluar la opción seleccionada
            switch (opcion) {
                case 1:
                    // Agregar un número a la pila
                    System.out.print("Introduce un número para la pila: ");
                    int datoPila = opc.nextInt();
                    pila.push(datoPila); // Insertar el número en la pila
                    System.out.println("Número agregado a la pila.");
                    break;

                case 2:
                    // Agregar un número a la cola
                    System.out.print("Introduce un número para la cola: ");
                    int datoCola = opc.nextInt();
                    cola.add(datoCola); // Insertar el número en la cola
                    System.out.println("Número agregado a la cola.");
                    break;

                case 3:
                    // Agregar un número al ArrayList
                    System.out.print("Introduce un número para el ArrayList: ");
                    int datoLista = opc.nextInt();
                    lista.add(datoLista); // Agregar el número al ArrayList
                    System.out.println("Número agregado al ArrayList.");
                    break;

                case 4:
                    // Agregar un arreglo de caracteres a la pila y mostrarlo
                    for (int i = 0; i <= a.length - 1; i++) {
                        pila2.push(a[i]); // Agregar cada carácter a la pila
                        System.out.println("Mostrar arreglo: " + pila2); // Mostrar el contenido actual de la pila
                    }
                    break;

                case 5:
                    // Agregar un arreglo de cadenas a la cola y mostrarlo
                    for (int i = 0; i <= b.length - 1; i++) {
                        cola2.add(b[i]); // Agregar cada cadena a la cola
                        System.out.println("Mostrar arreglo: " + cola2); // Mostrar el contenido actual de la cola
                    }
                    break;

                case 6:
                    // Mostrar los objetos almacenados en la lista
                    for (MenuPilas m2 : lista2) {
                        System.out.println(m2); // Imprimir la referencia al objeto
                        System.out.println("Mostrar objeto: " + lista2); // Imprimir toda la lista
                    }
                    break;

                case 7:
                    // Mostrar el contenido de la pila de enteros
                    System.out.println("Contenido de la pila: " + pila);
                    break;

                case 8:
                    // Mostrar el contenido de la cola de enteros
                    System.out.println("Contenido de la cola: " + cola);
                    break;

                case 9:
                    // Mostrar el contenido del ArrayList
                    System.out.println("Contenido del ArrayList: " + lista);
                    break;

                case 10:
                    // Mensaje de despedida
                    System.out.println("Gracias por usar el programa. Hasta luego! :)");
                    break;

                default:
                    // Mensaje para opciones no válidas
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 10); // Continuar mientras la opción no sea 10 (salir)

        // Cerrar el objeto Scanner
        opc.close();
    }
}
