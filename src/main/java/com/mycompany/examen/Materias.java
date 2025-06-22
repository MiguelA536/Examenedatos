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

import java.util.HashMap;
import java.util.Map;

public class Materias {

    private Map<String, Materia> mapaMaterias = new HashMap<>();

    public void registrarMateria(String codigo, String nombre) {
        codigo = codigo.trim();  // <-- IMPORTANTE
        if (mapaMaterias.containsKey(codigo)) {
            System.out.println("Ya existe una materia con ese código.");
        } else {
            mapaMaterias.put(codigo, new Materia(codigo, nombre));
            System.out.println("Materia registrada correctamente.");
        }
    }

    public Materia obtenerMateriaPorCodigo(String codigo) {
        return mapaMaterias.get(codigo.trim());  // <-- evita errores por espacios
    }

    public Materia obtenerMateriaPorNombre(String nombre) {
        for (Materia m : mapaMaterias.values()) {
            if (m.getNombre().equalsIgnoreCase(nombre.trim())) {
                return m;
            }
        }
        return null;
    }

    public void verMaterias() {
        if (mapaMaterias.isEmpty()) {
            System.out.println("No hay materias registradas.");
        } else {
            for (Materia m : mapaMaterias.values()) {
                System.out.println(m);
            }
        }
    }
}

