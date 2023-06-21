/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.vista;

import ec.edu.ups.practica3.modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class VistaProducto {

    private Scanner scanner;

    public VistaProducto() {
        scanner = new Scanner(System.in);
    }

    public Producto solicitarDatosProducto() {
        System.out.println("Ingrese los datos del producto:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Código: ");
        String codigo = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad disponible: ");
        int cantidadDisponible = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer de entrada

        return new Producto(nombre, codigo, precio, cantidadDisponible);
    }

}
