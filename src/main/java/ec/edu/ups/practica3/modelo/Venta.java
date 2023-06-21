/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.modelo;

/**
 *
 * @author Administrator
 */
public class Venta {

    private Producto producto;
    private int cantidadVendida;
    private double montoTotal;

    public Venta(Producto producto, int cantidadVendida, double montoTotal) {
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.montoTotal = montoTotal;
    }

    // Métodos getter y setter
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

}
