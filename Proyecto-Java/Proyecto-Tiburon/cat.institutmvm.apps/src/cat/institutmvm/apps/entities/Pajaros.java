package cat.institutmvm.apps.entities;

public class Pajaros extends General {
    private boolean parasitos;

    public Pajaros(String especie, String genero, String habitat, String tiempo_navegacion, String hora_llegada, String viento, String nubosidad, String direccion_viento, Float size, Float embarcaciones) {
        super(especie, genero, habitat, tiempo_navegacion, hora_llegada, viento, nubosidad, direccion_viento, size,embarcaciones);
        this.setParasitos(parasitos);
    }

    /**
     * @return de si tiene parasitos o no de  {@code Pajaros}.
     */
    public boolean isParasitos() {
        return parasitos;
    }
    /**
     * Asigna el valor indicado
     */
    public void setParasitos(boolean parasitos) {
        this.parasitos = parasitos;
    }
}
