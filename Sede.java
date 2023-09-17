import java.util.ArrayList;
import java.util.List;

/**
 * Estudiante: Joel Jaquez
 * Carne: 23369
 * Carrera: Ingenieria en Sistemas
 * Fecha de inicio: 14/9/2023
 * Fecha de finalizacion: 16/9/2023
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
    // Getters y Setters
    public int getIdSede(){
        return idSede;
    }

    public void setIdSede(int idSede){
        this.idSede = idSede;
    }

    public List<Edificio> getEdificios(){
        return edificios;
    }

    public void agregarEdificio(Edificio edificio){
        edificios.add(edificio);
    }

     // Método agregado para buscar un edificio por nombre en la sede.
    public Edificio getEdificioByName(String nombre) {
        for (Edificio edificio : edificios) {
            if (edificio.getNombre().equals(nombre)) {
                return edificio;
            }
        }
        return null;  // Si no se encuentra el edificio, regresa null.
    }
}
