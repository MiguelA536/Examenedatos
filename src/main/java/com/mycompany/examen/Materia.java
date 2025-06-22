/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author migue
 */
public class Materia {
    private String codigo;
    private String nombre;
    private ArbolCalificaciones arbolCalificaciones;

    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.arbolCalificaciones = new ArbolCalificaciones();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArbolCalificaciones getArbolCalificaciones() {
        return arbolCalificaciones;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre;
    }
}
