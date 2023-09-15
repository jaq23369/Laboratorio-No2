import java.util.ArrayList;
import java.util.List;

/**
 * Estudiante: Joel Jaquez
 * Carne: 23369
 * Carrera: Ingenieria en Sistemas
 * Fecha de inicio: 14/9/2023
 * Clase que representa un edificio de la universidad.
 */

public class Edificio {
    private String nombre; // Nombre del edificio
    private List<Salon> salones; // Lista de salones del edificio

    /**
     * Constructor de la clase Edificio.
     *
     * @param nombre Nombre del edificio.
     */
    public Edificio(String nombre) {
        this.nombre = nombre;
        this.salones = new ArrayList<>();
    }

    /**
     * Método que devuelve el nombre del edificio.
     *
     * @return Nombre del edificio.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre del edificio.
     *
     * @param nombre Nombre del edificio.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve la lista de salones del edificio.
     *
     * @return Lista de salones del edificio.
     */
    public List<Salon> getSalones() {
        return salones;
    }

    /**
     * Método que agrega un salón a la lista de salones del edificio.
     *
     * @param salon Salón a agregar.
     */
    public void agregarSalon(Salon salon) {
        salones.add(salon);
    }
}