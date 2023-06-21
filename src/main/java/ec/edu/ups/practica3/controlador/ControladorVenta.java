/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.controlador;

import ec.edu.ups.practica3.modelo.Inventario;
import ec.edu.ups.practica3.modelo.PilaTransaccion;
import ec.edu.ups.practica3.modelo.Producto;
import ec.edu.ups.practica3.modelo.Transaccion;
import ec.edu.ups.practica3.vista.VistaVenta;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class ControladorVenta {

    private VistaVenta vistaVenta;
    private Inventario inventario;
    private PilaTransaccion pilaTransaccion;

    public ControladorVenta(VistaVenta vistaVenta, Inventario inventario, PilaTransaccion pilaTransacciones) {
        this.vistaVenta = vistaVenta;
        this.inventario = inventario;
        this.pilaTransaccion = pilaTransaccion;
    }

    public void realizarVenta() {
        String codigoProducto = vistaVenta.solicitarCodigoProducto();
        Producto producto = inventario.buscarProductoPorCodigo(codigoProducto);

        if (producto != null) {
            int cantidadVenta = vistaVenta.solicitarCantidadVenta();

            if (cantidadVenta <= producto.getCantidadDisponible()) {
                double montoTotal = cantidadVenta * producto.getPrecio();
                producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidadVenta);
                inventario.removerProducto(producto); // Remover el producto del inventario temporalmente

                // Crear registro de la transacción
                Transaccion transaccion = new Transaccion(codigoProducto, "VENTA", cantidadVenta, montoTotal, new Date());
                pilaTransaccion.agregarTransaccion(transaccion);

                System.out.println("Venta realizada correctamente");
            } else {
                System.out.println("No hay suficiente cantidad disponible para realizar la venta");
            }
        } else {
            System.out.println("El producto no se encuentra en el inventario");
        }
    }

}
