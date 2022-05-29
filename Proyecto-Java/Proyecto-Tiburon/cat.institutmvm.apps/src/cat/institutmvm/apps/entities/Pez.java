package cat.institutmvm.apps.entities;

public class Pez extends General{

    /**
     * Creacion de variables privadas para la clase {@code Pez}
     */
    private boolean p_anzuelos;
    private String t_anzuelo,profundidad;
    private int n_anzuelos;

    /**
     * Creacion del constructor
     */

    public Pez(String especie, String genero, String habitat, String tiempo_navegacion, String hora_llegada, String viento, String nubosidad, String direccion_viento, Float size, Float embarcaciones) {
        super(especie, genero, habitat, tiempo_navegacion, hora_llegada, viento, nubosidad, direccion_viento, size, embarcaciones);
        this.setN_anzuelos(n_anzuelos);
        this.setProfundidad(profundidad);
        this.setT_anzuelo(t_anzuelo);
        this.setP_anzuelos(p_anzuelos);

    }
    /**
     * Getter y Setters
     */

    /**
     * @return de la presencia de anzuelos de {@code Pez}.
     */
    public boolean isP_anzuelos() {
        return p_anzuelos;
    }
    /**
     * Asigna el valor indicado
     */
    public void setP_anzuelos(boolean p_anzuelos) {
        this.p_anzuelos = p_anzuelos;
    }
    /**
     * @return del tipo de anzuelo de  {@code Pez}.
     */
    public String getT_anzuelo() {
        return t_anzuelo;
    }
    /**
     * Asigna el valor indicado
     */
    public void setT_anzuelo(String t_anzuelo) {
        this.t_anzuelo = t_anzuelo;
    }
    /**
     * @return de la profundidad de {@code Pez}.
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
     * @return del numero de anzuelos {@code Pez}.
     */
    public int getN_anzuelos() {
        return n_anzuelos;
    }
    /**
     * Asigna el valor indicado
     */
    public void setN_anzuelos(int n_anzuelos) {
        this.n_anzuelos = n_anzuelos;
    }
}
