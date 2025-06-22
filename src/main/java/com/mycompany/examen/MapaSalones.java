/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author migue
 */
import java.util.*;

public class MapaSalones {
    // Mapa para el grafo no dirigido: cada salón apunta a una lista de salones conectados
    private Map<String, List<String>> grafo;

    public MapaSalones() {
        // TreeMap para orden alfabético insensible a mayúsculas
        grafo = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    // Agregar salón (vértice)
    public void agregarSalon(String salon) {
        grafo.putIfAbsent(salon, new ArrayList<>());
    }

    // Agregar conexión (arista no dirigida)
    public void conectarSalones(String origen, String destino) {
        agregarSalon(origen);
        agregarSalon(destino);
        // Agregar conexión en ambos sentidos
        if (!grafo.get(origen).contains(destino)) {
            grafo.get(origen).add(destino);
        }
        if (!grafo.get(destino).contains(origen)) {
            grafo.get(destino).add(origen);
        }
    }

    // Mostrar grafo
    public void mostrarConexiones() {
        System.out.println("Conexiones de salones (grafo no dirigido):");
        for (String salon : grafo.keySet()) {
            List<String> conectados = grafo.get(salon);
            conectados.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.println(salon + " -> " + conectados);
        }
    }
}
