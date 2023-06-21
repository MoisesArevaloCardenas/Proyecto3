/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.vista;

import ec.edu.ups.practica3.modelo.Inventario;
import ec.edu.ups.practica3.modelo.Producto;

/**
 *
 * @author Administrator
 */
public class VistaInventario {

    public void mostrarInventario(Inventario inventario) {

        System.out.println("Inventario actual:");

        for (Producto producto : inventario.getProductos()) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cantidad disponible: " + producto.getCantidadDisponible());
            System.out.println("------------------------");
        }
    }

}
