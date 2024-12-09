
// Define la clase Persona
class Persona {

    // Atributos de la clase Persona
    String nombre; // Nombre de la persona
    int edad; // Edad de la persona
    double altura; // Altura de la persona en metros

    // Constructor de la clase que inicializa los atributos
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre; // Asigna el parámetro nombre al atributo de la clase
        this.edad = edad; // Asigna el parámetro edad al atributo de la clase
        this.altura = altura; // Asigna el parámetro altura al atributo de la clase
    }

    // Método getter para obtener el valor del atributo nombre
    public String getNombre() {
        return nombre; // Devuelve el valor del atributo nombre
    }

    // Método setter para modificar el valor del atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna el valor proporcionado al atributo nombre
    }

    // Método getter para obtener el valor del atributo edad
    public int getEdad() {
        return edad; // Devuelve el valor del atributo edad
    }

    // Método setter para modificar el valor del atributo edad
    public void setEdad(int edad) {
        this.edad = edad; // Asigna el valor proporcionado al atributo edad
    }

    // Método getter para obtener el valor del atributo altura
    public double getAltura() {
        return altura; // Devuelve el valor del atributo altura
    }

    // Método setter para modificar el valor del atributo altura
    public void setAltura(double altura) {
        this.altura = altura; // Asigna el valor proporcionado al atributo altura
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        // Devuelve una cadena que describe el estado del objeto Persona
        return "Persona [nombre=" + nombre
                + ", edad=" + edad
                + ", altura=" + altura + " metros]";
    }

}
