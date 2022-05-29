package com.institutmvm.controller.cont.ui;
import javax.swing.*;
import java.awt.*;

/**
 * Controlador principal que se encargara de ejecutar el programa.
 */

public class Main {

    public static void main(String[] args) {
        /**
         *Definimos las Opciones que mostraremos al usuario
         */
        String[] especie = {"Pajaros","Peces","Tiburones"};

        JComboBox CB = new JComboBox(especie);

        /**
         * Definimos las columnas y filas que tendra nuestra aplicacion
         */

        JPanel cuadro = new JPanel(new GridLayout(0, 1));
        cuadro.add(CB);

        int opt = JOptionPane.showConfirmDialog(null, cuadro, "Especie",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        /**
         * Display de las opciones
         */

        if (opt == JOptionPane.OK_OPTION) {
            System.out.println("OK");
            System.out.println(CB.getSelectedItem());
        }

        /**
         * OPT Variable encargada de guardar que valor fue seleccionado en nuestra aplicacion
         */

        if (opt == JOptionPane.OK_OPTION) {
            Options forms = new Options();

            /**
             * Switch case que nos llevara a los formularios personalizados para cada clase que hayamos creado
             */

            switch (CB.getSelectedItem().toString()) {
                case "Pajaros":
                    forms.PajarosOptions();
                    break;
                case "Peces":
                    forms.PezOptions();
                    break;
                case "Tiburones":
                    forms.TiburonOptions();
                    break;
                default:
                    break;
            }

            /**
             * Ventana que muestra que la accion a sido compeltada
             */

            JOptionPane.showMessageDialog(null, "Completado",
                    "Exit", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}