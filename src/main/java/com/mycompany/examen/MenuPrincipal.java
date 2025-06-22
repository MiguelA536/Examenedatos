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
        Materias materias = new Materias();
        MapaSalones mapasalones = new MapaSalones();
        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {

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
            System.out.println("10.- Mostrar calificaciones en Inorden");
            System.out.println("11.- Registrar materia (código y nombre)");
            System.out.println("12.- Ver materias registradas ");
            System.out.println("13.- Conectar Salones ");
            System.out.println("14.- Ver conexiones de un salón");
            System.out.println("15.- Salir");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine();
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
                        
                    case 9: // Insertar calificación en materia
                        System.out.print("Ingresa ID o nombre del alumno: ");
                        String alumno = entrada.nextLine();  // Solo una vez, no repetir entrada.nextLine()

                        System.out.print("Ingresa nombre de la materia: ");
                        String nombreMateria = entrada.nextLine();

                        Materia materia = materias.obtenerMateriaPorNombre(nombreMateria);

                        if (materia != null) {
                            System.out.print("Ingresa calificación (puede tener decimales): ");
                            try {
                                float calif = Float.parseFloat(entrada.nextLine());
                                materia.getArbolCalificaciones().insertar(calif);
                                System.out.println("Calificación insertada para la materia " + materia.getNombre());
                            } catch (NumberFormatException e) {
                                System.out.println("Calificación inválida.");
                            }
                        } else {
                            System.out.println("Materia no encontrada.");
                        }
                        
                        break;
                        
                    case 10: // Mostrar calificaciones en orden inorden de materia
                        System.out.print("¿Buscar materia por código (c) o nombre (n)? ");
                        String opcionBusqueda = entrada.nextLine();  // solo una vez

                        Materia materiaMostrar = null;

                        if (opcionBusqueda.equalsIgnoreCase("c")) {
                            System.out.print("Ingresa código de la materia: ");
                            String codigoMat = entrada.nextLine().trim();  // <- asegúrate de limpiar espacios
                            materiaMostrar = materias.obtenerMateriaPorCodigo(codigoMat);
                        } else if (opcionBusqueda.equalsIgnoreCase("n")) {
                            System.out.print("Ingresa nombre de la materia: ");
                            String nombreMat = entrada.nextLine().trim();
                            materiaMostrar = materias.obtenerMateriaPorNombre(nombreMat);
                        }

                        if (materiaMostrar == null) {
                            System.out.println("Materia no encontrada.");
                        } else {
                            materiaMostrar.getArbolCalificaciones().inorden();
                        }
                        break;
                        
                    case 11: // Registrar nueva materia
                        System.out.print("Ingresa código de la materia: ");
                        String codigoNueva = entrada.nextLine();  // Solo una vez, sin repetir entrada.nextLine()

                        System.out.print("Ingresa nombre de la materia: ");
                        String nombreNueva = entrada.nextLine();

                        materias.registrarMateria(codigoNueva, nombreNueva);
                        break;

                    case 12: // Ver materias registradas
                        materias.verMaterias();
                        break;
                        
                    case 13:
                        System.out.print("Ingresa nombre del salón origen: ");
                        String origen = entrada.nextLine().trim();
                        System.out.print("Ingresa nombre del salón destino: ");
                        String destino = entrada.nextLine().trim();

                        mapasalones.conectarSalones(origen, destino);
                        System.out.println("Salones conectados correctamente.");
                        break;
                        
                    case 14:
                        mapasalones.mostrarConexiones();
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
