import java.util.ArrayList;
import java.util.List;

/**
 * Estudiante: Joel Jaquez
 * Carne: 23369
 * Carrera: Ingenieria en Sistemas
 * Fecha de inicio: 14/9/2023
 * Clase que representa una sede de la universidad
 */

public class Sede{
    private int idSede; // Identificador de la sede
    private List<Edificio> edificios; // Lista de edificios de la sede

    /**
     * Constructor de la clase Sede.
     *
     * @param idSede Identificador de la sede.
     */
    public Sede(int idSede){
        this.idSede = idSede;
        this.edificios= new ArrayList<>();
    }

    /**
     * Método que devuelve el identificador de la sede.
     *
     * @return Identificador de la sede.
     */
    public int getIdSede(){
        return idSede;
    }

    /**
     * Método que establece el identificador de la sede.
     *
     * @param idSede Identificador de la sede.
     */

    public void setIdSede(int idSede){
        this.idSede = idSede;
    }

    /**
     * Método que devuelve la lista de edificios de la sede.
     *
     * @return Lista de edificios de la sede.
     */

    public List<Edificio> getEdificios(){
        return edificios;
    }

    /**
     * Método que agrega un edificio a la lista de edificios de la sede.
     *
     * @param edificio Edificio a agregar.
     */

    public void agregarEdificio(Edificio edificio){
        edificios.add(edificio);
    }
}
