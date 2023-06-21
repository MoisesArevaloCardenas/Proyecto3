/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.controlador;

import ec.edu.ups.practica3.modelo.Inventario;
import ec.edu.ups.practica3.modelo.Producto;
import ec.edu.ups.practica3.vista.VistaProducto;

/**
 *
 * @author Administrator
 */
public class ControladorProducto {

    private VistaProducto vistaProducto;
    private Inventario inventario;

    public ControladorProducto(VistaProducto vistaProducto, Inventario inventario) {
        this.vistaProducto = vistaProducto;
        this.inventario = inventario;
    }

    public void agregarProducto() {
        Producto nuevoProducto = vistaProducto.solicitarDatosProducto();
        inventario.agregarProducto(nuevoProducto);
        System.out.println("Producto agregado al inventario");
    }

}
