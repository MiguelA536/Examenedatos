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

public class RegistroEstudiantes {
    //Aqui se almacenarán los estudiantes
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    private Scanner entrada = new Scanner(System.in);
    
    
    //Aqui es donde se hace el registro de cada alumno de modo que pide el nombre, id, grado y grupo
    /*Si bien es cierto que los datos de podrían tener fijos, a mi gusto es preferible que todos los datos
    sean ingresados por el usuario, ya que cuanod un estuidante se inscribe, no conocemos sus datos hasta
    el momento en el que el usuario nos lo hace saber*/
    public void registrarEstudiante() {
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("ID: ");
        String id = entrada.nextLine();
        System.out.print("Grado: ");
        String grado = entrada.nextLine();
        System.out.print("Grupo: ");
        String grupo = entrada.nextLine();

        Estudiante nuevo = new Estudiante(nombre, id, grado, grupo);
        listaEstudiantes.add(nuevo);
        System.out.println("✅ Estudiante registrado con éxito.");
    }
    
    //Método para ver la lista de estudiantes
    public void verListaEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\n📘 Lista de Estudiantes:");
            for (Estudiante e : listaEstudiantes) {
                System.out.println("Nombre: " + e.getNombre() + ", ID: " + e.getId()
                        + ", Grado: " + e.getGrado() + ", Grupo: " + e.getGrupo());
            }
        }
    }
}
