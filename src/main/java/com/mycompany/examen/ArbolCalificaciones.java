/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author migue
 */
public class ArbolCalificaciones {
    private Nodo raiz;

    public void insertar(float valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo nodo, float valor) {
        if (nodo == null) return new Nodo(valor);
        if (valor < nodo.valor) nodo.izquierda = insertarRec(nodo.izquierda, valor);
        else nodo.derecha = insertarRec(nodo.derecha, valor);
        return nodo;
    }

    public void inorden() {
        System.out.println("Recorrido inorden:");
        inordenRec(raiz);
        System.out.println();
    }

    private void inordenRec(Nodo nodo) {
        if (nodo != null) {
            inordenRec(nodo.izquierda);
            System.out.print(nodo.valor + "   ");
            inordenRec(nodo.derecha);
        }
    }
}


