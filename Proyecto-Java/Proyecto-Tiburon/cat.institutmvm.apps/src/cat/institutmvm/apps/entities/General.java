package cat.institutmvm.apps.entities;

/**
 * Clase que implementara los metodos en general de {@code Pajaros},{@code Pez},{@code Tiburones}.
 */

abstract class General {
    private String especie,genero,habitat,tiempo_navegacion,hora_llegada,viento,nubosidad,direccion_viento;
    private float embarcaciones,size;
    /**
     * Generacion de nuestro constructor
     */
    public General(String especie,String genero,String habitat,String tiempo_navegacion,String hora_llegada,String viento,String nubosidad,String direccion_viento
    ,Float size,Float embarcaciones){
        this.setEspecie(especie);
        this.setGenero(genero);
        this.setHabitat(habitat);
        this.setTiempo_navegacion(tiempo_navegacion);
        this.setHora_llegada(hora_llegada);
        this.setViento(viento);
        this.setNubosidad(nubosidad);
        this.setDireccion_viento(direccion_viento);
        this.setEmbarcaciones(embarcaciones);
        this.setSize(size);
    }

    /**
     * @return de las embarcaciones de {@code General}.
     */

    public float getEmbarcaciones() {
        return embarcaciones;
    }
    /**
     * Asigna el valor indicado
     */
    public void setEmbarcaciones(float embarcaciones) {
        this.embarcaciones = embarcaciones;
    }

    /**
     * @return de las especies de {@code General}.
     */

    public String getEspecie() {
        return especie;
    }
    /**
     * Asigna el valor indicado
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return del genero de {@code General}.
     */

    public String getGenero() {
        return genero;
    }
    /**
     * Asigna el valor indicado
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return del habitat de {@code General}.
     */

    public String getHabitat() {
        return habitat;
    }
    /**
     * Asigna el valor indicado
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * @return del tiempo de navegacion de {@code General}.
     */

    public String getTiempo_navegacion() {
        return tiempo_navegacion;
    }
    /**
     * Asigna el valor indicado
     */
    public void setTiempo_navegacion(String tiempo_navegacion) {
        this.tiempo_navegacion = tiempo_navegacion;
    }

    /**
     * @return de la hora de llegada de {@code General}.
     */

    public String getHora_llegada() {
        return hora_llegada;
    }
    /**
     * Asigna el valor indicado
     */
    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    /**
     * @return del viento de {@code General}.
     */

    public String getViento() {
        return viento;
    }
    /**
     * Asigna el valor indicado
     */
    public void setViento(String viento) {
        this.viento = viento;
    }

    /**
     * @return de la nubosidad de {@code General}.
     */

    public String getNubosidad() {
        return nubosidad;
    }
    /**
     * Asigna el valor indicado
     */
    public void setNubosidad(String nubosidad) {
        this.nubosidad = nubosidad;
    }

    /**
     * @return de la direccion del {@code General}.
     */

    public String getDireccion_viento() {
        return direccion_viento;
    }
    /**
     * Asigna el valor indicado
     */
    public void setDireccion_viento(String direccion_viento) {
        this.direccion_viento = direccion_viento;
    }

    /**
     * @return del tamaño de {@code General}.
     */

    public float getSize() {
        return size;
    }
    /**
     * Asigna el valor indicado
     */
    public void setSize(float size) {
        this.size = size;
    }
}
