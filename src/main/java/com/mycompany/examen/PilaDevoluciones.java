/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author migue
 */
import java.util.Stack;

// Clase para manejar la pila de devoluciones
public class PilaDevoluciones {

    private Stack<String> pila = new Stack<>();

    public void registrarDevolucion(String descripcion) {
        pila.push(descripcion);
    }

    public void verDevoluciones() {
        if (pila.isEmpty()) {
            System.out.println("No hay nuevas devoluciones registradas");
        } else {
            System.out.println("Mostrando devoluciones (de la última a la primera) y removiéndolas:");
            while (!pila.isEmpty()) {
                System.out.println(pila.pop());
            }
            
        }
    }
    //Como hace pop solo se podrá ver la pila una vez

}
