package cat.institutmvm.apps.entities;

public class Tiburones extends General{

    private String heridas;
    private String profundidad;

    public Tiburones(String especie, String genero, String habitat, String tiempo_navegacion, String hora_llegada, String viento, String nubosidad, String direccion_viento, Float size, Float embarcaciones) {
        super(especie, genero, habitat, tiempo_navegacion, hora_llegada, viento, nubosidad, direccion_viento, size, embarcaciones);
        this.setHeridas(heridas);
        this.setProfundidad(profundidad);
    }
    /**
     * @return de la profundidad {@code Tiburones}.
     */
    public String getProfundidad() {
        return profundidad;
    }
    /**
     * Asigna el valor indicado
     */
    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }
    /**
     * @return de si tiene heridas  {@code Tiburones}.
     */
    public String getHeridas() {
        return heridas;
    }
    /**
     * Asigna el valor indicado
     */
    public void setHeridas(String heridas) {
        this.heridas = heridas;
    }
}
