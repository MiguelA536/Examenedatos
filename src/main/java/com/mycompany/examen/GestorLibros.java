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

public class GestorLibros {

    private ArrayList<Libro> listaLibros = new ArrayList<>();
    private Scanner entrada = new Scanner(System.in);

    public void agregarLibro() {
        System.out.print("Título del libro: ");
        String titulo = entrada.nextLine();
        System.out.print("Autor del libro: ");
        String autor = entrada.nextLine();

        Libro nuevo = new Libro(titulo, autor);
        listaLibros.add(nuevo);
        System.out.println("Libro agregado correctamente.");
    }

    public void verLibros() {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            System.out.println("\nLista de libros:");
            for (Libro libro : listaLibros) {
                String estado = libro.isPrestado() ? "Prestado" : "Disponible";
                System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + " [" + estado + "]");
            }
        }
    }

    public void prestarLibro() {
        System.out.print("Título del libro a prestar: ");
        String titulo = entrada.nextLine();
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.isPrestado()) {
                    libro.prestar();
                    System.out.println("El libro ha sido prestado.");
                } else {
                    System.out.println("El libro ya está prestado.");
                }
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void devolverLibro() {
        System.out.print("Título del libro a devolver: ");
        String titulo = entrada.nextLine();
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isPrestado()) {
                    libro.devolver();
                    System.out.println("El libro ha sido devuelto.");
                } else {
                    System.out.println("⚠️ El libro no estaba prestado.");
                }
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public boolean prestarLibroDesdeVentanilla(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isPrestado()) {
                libro.prestar();
                return true;
            }
        }
        return false;
    }

    public boolean devolverLibroDesdeVentanilla(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.isPrestado()) {
                libro.devolver();
                return true;
            }
        }
        return false;
    }

}
