/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.vista;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class VistaVenta {

    private Scanner scanner;

    public VistaVenta() {
        scanner = new Scanner(System.in);
    }

    public String solicitarCodigoProducto() {
        System.out.print("Ingrese el código del producto: ");
        return scanner.nextLine();
    }

    public int solicitarCantidadVenta() {
        System.out.print("Ingrese la cantidad a vender: ");
        return scanner.nextInt();
    }

}
