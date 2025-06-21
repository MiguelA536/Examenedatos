/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.util.*;

/**
 *
 * @author migue
 */
public class MenuPrincipal {
    public void ejecutar() {
        RegistroEstudiantes registroEstudiante = new RegistroEstudiantes();
        GestorLibros gestorLibros = new GestorLibros();
        ColaAtencion colaAtencion = new ColaAtencion();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {

            /*System.out.println("\n__¿Qué deseas hacer hoy?__");
            System.out.println("1.- Registrar un nuevo estudiante");
            System.out.println("2.- Ver la lista de estudiantes");
            System.out.println("3.- Agregar libro nuevo");
            System.out.println("4.- Ver libros nuevos");
            System.out.println("5.- Registrar atención en ventanilla");
            System.out.println("6.- Atender estudiante");
            System.out.println("7.- Registrar devolución de libro");
            System.out.println("8.- Ver pila de devoluciones");
            System.out.println("9.- Insertar calificación");
            System.out.println("10.- MOstrar calificaciones en Inorden");
            System.out.println("11.- Registrar materia (código y nombre)");
            System.out.println("12.- Ver materias registradas ");
            System.out.println("13.- Conectar Salones ");
            System.out.println("14.- Ver conexiones de un salón");
            System.out.println("15.- Salir");*/
            System.out.println("\n__¿Qué deseas hacer hoy?__");
            System.out.println("1.- Registrar un nuevo estudiante");
            System.out.println("2.- Ver la lista de estudiantes");
            System.out.println("3.- Agregar libro nuevo");
            System.out.println("4.- Ver libros nuevos");
            System.out.println("5.- Generar turnos para ser atendido");
            System.out.println("6.- Atender estudiante - Espere su turno mientras se atienden al resto");
            System.out.println("7.- Ver el historial de prestamos y devoluciones");
            System.out.println("8.- Ver pila de devoluciones");
            System.out.println("9.- Insertar calificación");
            System.out.println("10.- MOstrar calificaciones en Inorden");
            System.out.println("11.- Registrar materia (código y nombre)");
            System.out.println("12.- Ver materias registradas ");
            System.out.println("13.- Conectar Salones ");
            System.out.println("14.- Ver conexiones de un salón");
            System.out.println("15.- Salir");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        registroEstudiante.registrarEstudiante();
                        break;
                    case 2:
                        registroEstudiante.verListaEstudiantes();
                        break;
                    case 3:
                        gestorLibros.agregarLibro();
                        break;
                    case 4:
                        gestorLibros.verLibros();
                        break;
                    case 5:
                        //Es necesario generar un turno  para ser atendido
                        colaAtencion.generarTurnos();
                        break;
                    case 6:
                        /*o se que es molesto, pero hasta cierto punto es realista el esperar a
                        que atiendan a todos antes de ser atendido*/
                        colaAtencion.atenderTurnos(gestorLibros);
                        break;
                    case 7:
                        colaAtencion.verHistorial();
                        break;
                    case 8:
                        //La pila solo se omstrara una vez ya que hace pop()
                        colaAtencion.verPilaDevoluciones();
                        break;
                    case 9:

                        break;
                    case 10:

                        break;
                    case 11:

                        break;
                    case 12:

                        break;
                    case 13:

                        break;
                    case 14:

                        break;
                    case 15:
                        System.out.println("Hasta la próxima...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número entero.");
                entrada.next();
                opcion = 0;
            }
        } while (opcion != 15);
    }
}