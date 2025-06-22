/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author migue
 */
public class Estudiante {
    // Atributos asignados a la clase de estudiante
    private String nombre;
    private String id;
    private String grado;
    private String grupo;

    public Estudiante(String nombre, String id, String grado, String grupo) {
        //Constructor sobre los elementos que conforman a cada estudiante
        this.nombre = nombre;
        this.id = id;
        this.grado = grado;
        this.grupo = grupo;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public String getId() { return id; }
    public String getGrado() { return grado; }
    public String getGrupo() { return grupo; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setId(String id) { this.id = id; }
    public void setGrado(String grado) { this.grado = grado; }
    public void setGrupo(String grupo) { this.grupo = grupo; }
}
