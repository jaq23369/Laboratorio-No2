/**
 * Estudiante: Joel Jaquez
 * Carne: 23369
 * Carrera: Ingenieria en Sistemas
 * Fecha de inicio: 14/9/2023
 * Clase que representa un salón de la universidad.
 */

public class Salon {
    private int numero; // Número del salón
    private int capacidad; // Capacidad del salón
    private String edificio; // Nombre del edificio
    private int nivel; // Nivel del salón

    /**
     * Constructor de la clase Salon.
     *
     * @param numero Número del salón.
     * @param capacidad Capacidad del salón.
     * @param edificio Nombre del edificio.
     * @param nivel Nivel del salon.
     */
    public Salon(int numero, int capacidad, int nivel, String edificio) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.nivel = nivel;
        this.edificio = edificio;
    }

    /**
     * Método que devuelve el número del salón.
     *
     * @return Número del salón.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método que establece el número del salón.
     *
     * @param numero Número del salón.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Método que devuelve la capacidad del salón.
     *
     * @return Capacidad del salón.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Método que establece la capacidad del salón.
     *
     * @param capacidad Capacidad del salón.
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEdificio(){
        return edificio;
    }

    public void setEdificio(String edificio){
        this.edificio = edificio;
    }

    public int getNivel(){
        return nivel;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }
}