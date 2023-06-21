/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica3.modelo;

import java.util.Stack;

/**
 *
 * @author Administrator
 */
public class PilaTransaccion {

    private Stack<Transaccion> pila;

    public PilaTransaccion() {
        pila = new Stack<>();
    }

    public void agregarTransaccion(Transaccion transaccion) {
        pila.push(transaccion);
    }

    public Transaccion obtenerTransaccion() {
        return pila.pop();
    }

    public boolean estaVacia() {
        return pila.isEmpty();
    }

}
