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

public class ColaAtencion {

    private PilaDevoluciones pilaDevoluciones = new PilaDevoluciones();
    private Queue<String> turnos = new LinkedList<>();
    private List<String> historial = new ArrayList<>();
    private Scanner entrada = new Scanner(System.in);

    public void generarTurnos() {
        int totalTurnos = (int) (Math.random() * 5) + 2; // entre 2 y 6
        System.out.println("Generando " + totalTurnos + " turnos...");

        for (int i = 1; i <= totalTurnos; i++) {
            turnos.add("Turno #" + i);
        }
    }

    public void atenderTurnos(GestorLibros gestorLibros) {
        while (!turnos.isEmpty()) {
            System.out.println("\nPresiona ENTER para atender al siguiente:");
            entrada.nextLine();
            String turnoActual = turnos.poll();
            System.out.println("Atendiendo a " + turnoActual);

            System.out.print("Nombre del estudiante: ");
            String nombre = entrada.nextLine();

            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Solicitar libro");
            System.out.println("2. Devolver libro");
            System.out.print("Opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Título del libro a solicitar: ");
                    String titulo = entrada.nextLine();
                    boolean prestado = gestorLibros.prestarLibroDesdeVentanilla(titulo);
                    if (prestado) {
                        historial.add(titulo + " prestado a " + nombre);
                        System.out.println("Libro prestado con éxito.");
                    } else {
                        System.out.println("No se pudo prestar el libro.");
                    }
                }
                case 2 -> {
                    System.out.print("Título del libro a devolver: ");
                    String titulo = entrada.nextLine();
                    boolean devuelto = gestorLibros.devolverLibroDesdeVentanilla(titulo);
                    if (devuelto) {
                        historial.add(titulo + " devuelto por " + nombre);
                        pilaDevoluciones.registrarDevolucion(titulo + " devuelto por " + nombre);
                        System.out.println("Libro devuelto con éxito.");
                    } else {
                        System.out.println("No se pudo devolver el libro.");
                    }
                }

                default ->
                    System.out.println("Opción inválida.");
            }
        }
        System.out.println("\nTodos los turnos han sido atendidos.");
    }

    public void verHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay acciones registradas aún.");
        } else {
            System.out.println("\nHistorial de préstamos y devoluciones:");
            historial.forEach(System.out::println);
        }
    }
    
    public void verPilaDevoluciones() {
        pilaDevoluciones.verDevoluciones();
    }

}
