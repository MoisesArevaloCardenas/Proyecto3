/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practica3;

import ec.edu.ups.practica3.controlador.ControladorInventario;
import ec.edu.ups.practica3.controlador.ControladorProducto;
import ec.edu.ups.practica3.controlador.ControladorVenta;
import ec.edu.ups.practica3.modelo.Inventario;
import ec.edu.ups.practica3.modelo.PilaTransaccion;
import ec.edu.ups.practica3.vista.VistaInventario;
import ec.edu.ups.practica3.vista.VistaProducto;
import ec.edu.ups.practica3.vista.VistaVenta;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Practica3 {

    public static void main(String[] args) {

        // Crear instancias de los modelos
        Inventario inventario = new Inventario();
        PilaTransaccion pilaTransacciones = new PilaTransaccion();

        // Crear instancias de las vistas
        VistaProducto agregarProductoView = new VistaProducto();
        VistaVenta realizarVentaView = new VistaVenta();
        VistaInventario mostrarInventarioView = new VistaInventario();

        // Crear instancias de los controladores
        ControladorProducto agregarProducto = new ControladorProducto(agregarProductoView, inventario);
        ControladorVenta realizarVenta = new ControladorVenta(realizarVentaView, inventario, pilaTransacciones);
        ControladorInventario mostrarInventario = new ControladorInventario(mostrarInventarioView, inventario);

        // Menú principal
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("======= Sistema de Gestión de Tienda =======");
            System.out.println("1. Agregar producto al inventario");
            System.out.println("2. Realizar venta");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el búfer de entrada

            switch (opcion) {
                case 1:
                    agregarProducto.agregarProducto();
                    break;
                case 2:
                    realizarVenta.realizarVenta();
                    break;
                case 3:
                    mostrarInventario.mostrarInventario();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

}
