/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.controlador;

import ec.edu.ups.practica3.modelo.Inventario;
import ec.edu.ups.practica3.vista.VistaInventario;

/**
 *
 * @author Administrator
 */
public class ControladorInventario {

    private VistaInventario vistaInventario;
    private Inventario inventario;

    public ControladorInventario(VistaInventario vistaInventario, Inventario inventario) {
        this.vistaInventario = vistaInventario;
        this.inventario = inventario;
    }

    public void mostrarInventario() {
        vistaInventario.mostrarInventario(inventario);
    }

}
