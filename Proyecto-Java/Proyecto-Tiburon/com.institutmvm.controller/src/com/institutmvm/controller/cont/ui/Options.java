package com.institutmvm.controller.cont.ui;

import javax.swing.*;
import java.awt.*;

public class Options {

    /**
     * Creacion de los JTextField
     */

    private static JRadioButton boolean_true,boolean_false;
    private static JTextField especie = new JTextField();
    private static JTextField habitat = new JTextField();
    private static JTextField tiempo_navegacion = new JTextField();
    private static JTextField hora_llegada = new JTextField();
    private static JTextField size = new JTextField();
    private static JTextField viento = new JTextField();
    private static JTextField nubosidad = new JTextField();
    private static JTextField embarcaciones = new JTextField();



    public static JPanel BaseFrom(int rows, int cols) {
        JPanel Form_Standard = new JPanel(new GridLayout(rows, cols));

        /**
         * Generacion del formulario Standar
         */

        Form_Standard.add(new JLabel("Especie"));
        Form_Standard.add(especie);

        Form_Standard.add(new JLabel("Habitat"));
        Form_Standard.add(habitat);

        Form_Standard.add(new JLabel("Temps de navegacio"));
        Form_Standard.add(tiempo_navegacion);

        /**
         * Generacion de un label de multiples opciones
         */

        String[] genero = {"","Macho","Hembra","Indefinido"};
        Form_Standard.add(new JLabel("Genero"));
        JComboBox caja2 = new JComboBox(genero);
        Form_Standard.add(caja2);

        Form_Standard.add(new JLabel("Hora d'arribada"));
        Form_Standard.add(hora_llegada);

        Form_Standard.add(new JLabel("Tamany"));
        Form_Standard.add(size);

        Form_Standard.add(new JLabel("Vent"));
        Form_Standard.add(viento);

        /**
         * Generacion de un label de multiples opciones
         */

        String[] direccion_viento = {"","Sur","Norte","Oeste","Este"};
        Form_Standard.add(new JLabel("Direccion del viento"));
        JComboBox caja3 = new JComboBox(direccion_viento);
        Form_Standard.add(caja3);

        Form_Standard.add(new JLabel("Nubositat"));
        Form_Standard.add(nubosidad);

        Form_Standard.add(new JLabel("Embarcaciones"));
        Form_Standard.add(embarcaciones);

        return Form_Standard;
    }

    public static void PajarosOptions(){

        /**
         * Definicion de las columnas y filas del formulario de {@code Pajaro}
         * Y ademas la creacion del formulario personalizado de {@code Pajaro}
         */



        JPanel Form_Pajaro = BaseFrom(3,5);

        Form_Pajaro.add(new JLabel("Parasitos"));
        Form_Pajaro.add(Box.createRigidArea(new Dimension(50, 30)));

        /**
         * Encargado del texto en las opciones del Booleano
         */

        boolean_true = new JRadioButton("Si");
        boolean_false = new JRadioButton("No");

        boolean_true.addChangeListener(l -> {
            if (boolean_true.isSelected()) {
                boolean_false.setSelected(false);
            }
        });
        Form_Pajaro.add(boolean_true);

        boolean_false.addChangeListener(l -> {
            if (boolean_false.isSelected()) {
                boolean_true.setSelected(false);
            }
        });

        Form_Pajaro.add(boolean_false);

        /**
         * Comprobacion de espacion en blanco con la funcion de {get.text().equals("")
         */
        int comprobacion_datos = JOptionPane.showConfirmDialog(null, Form_Pajaro, "Pajaros",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (comprobacion_datos == JOptionPane.OK_OPTION){

            if (especie.getText().equals("") || habitat.getText().equals("") || tiempo_navegacion.getText().equals("") || viento.getText().equals("")
                    || size.getText().equals("") || nubosidad.getText().equals("") || embarcaciones.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos", "Error",
                        JOptionPane.ERROR_MESSAGE);
                /**
                 * Ejecucion de nuevo de la funcion que genera nuestro formulario
                 */
                PajarosOptions();
            }
        }
    }

    public static void PezOptions(){

        /**
         * Definicion de las columnas y filas del formulario de {@code Pez}
         * Y ademas la creacion del formulario personalizado de {@code Pez}
         */
        JTextField n_anzuelos = new JTextField();
        JTextField t_anzuelos = new JTextField();

        JPanel Form_Pez = BaseFrom(4,5);

        Form_Pez.add(new JLabel("Numero Anzuelos"));
        Form_Pez.add(n_anzuelos);

        Form_Pez.add(new JLabel("Tipo de Anzuelos"));
        Form_Pez.add(t_anzuelos);

        /**
         * Generacion de un label de multiples opciones
         */

        String[] profundidad = {"<100M","<200M","<300M","<400M","<500M","<1000M","≥1000"};
        Form_Pez.add(new JLabel("Profundidad"));
        JComboBox prof = new JComboBox(profundidad);
        Form_Pez.add(prof);

        Form_Pez.add(new JLabel("Presencia Anzuelos"));
        Form_Pez.add(Box.createRigidArea(new Dimension(50, 30)));

        boolean_true = new JRadioButton("Si");
        boolean_false = new JRadioButton("No");

        boolean_true.addChangeListener(l -> {
            if (boolean_true.isSelected()) {
                boolean_false.setSelected(false);
            }
        });
        Form_Pez.add(boolean_true);

        boolean_false.addChangeListener(l -> {
            if (boolean_false.isSelected()) {
                boolean_true.setSelected(false);
            }
        });
        Form_Pez.add(boolean_false);
        /**
         * Comprobacion de espacion en blanco con la funcion de {get.text().equals("")
         */
        int comprobacion_datos = JOptionPane.showConfirmDialog(null, Form_Pez, "Peces",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (comprobacion_datos == JOptionPane.OK_OPTION){

            if (especie.getText().equals("") || habitat.getText().equals("") || tiempo_navegacion.getText().equals("") || viento.getText().equals("")
                    || size.getText().equals("") || nubosidad.getText().equals("") || embarcaciones.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos", "Error",
                        JOptionPane.ERROR_MESSAGE);
                /**
                 * Ejecucion de nuevo de la funcion que genera nuestro formulario
                 */
                PezOptions();
            }
        }
    }

    public static void TiburonOptions(){
        /**
         * Definicion de las columnas y filas del formulario de {@code Tiburones}
         * Y ademas la creacion del formulario personalizado de {@code Tiburones}
         */
        JPanel Form_Tiburon = BaseFrom(8,6);

        Form_Tiburon.add(new JLabel("Heridas"));
        Form_Tiburon.add(Box.createRigidArea(new Dimension(50, 30)));

        /**
         * Generacion de un label de multiples opciones
         */

        String[] profundidad = {"<100M","<200M","<300M","<400M","<500M","<1000M","≥1000"};
        Form_Tiburon.add(new JLabel("Profundidad"));
        JComboBox prof = new JComboBox(profundidad);
        Form_Tiburon.add(prof);

        boolean_true = new JRadioButton("Si");
        boolean_false = new JRadioButton("No");

        boolean_true.addChangeListener(l -> {
            if (boolean_true.isSelected()) {
                boolean_false.setSelected(false);
            }
        });
        Form_Tiburon.add(boolean_true);

        boolean_false.addChangeListener(l -> {
            if (boolean_false.isSelected()) {
                boolean_true.setSelected(false);
            }
        });
        Form_Tiburon.add(boolean_false);
        /**
         * Comprobacion de espacion en blanco con la funcion de {get.text().equals("")
         */
        int comprobacion_datos = JOptionPane.showConfirmDialog(null, Form_Tiburon, "Tiburones",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (comprobacion_datos == JOptionPane.OK_OPTION){

           if (especie.getText().equals("") || habitat.getText().equals("") || tiempo_navegacion.getText().equals("") || viento.getText().equals("")
                   || size.getText().equals("") || nubosidad.getText().equals("") || embarcaciones.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos", "Error",
                       JOptionPane.ERROR_MESSAGE);
               /**
                * Ejecucion de nuevo de la funcion que genera nuestro formulario
                */
               TiburonOptions();
           }
        }

    }

}
