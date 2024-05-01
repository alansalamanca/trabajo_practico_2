package ar.edu.unju.fi.ejercicio4.main;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;
import ar.edu.unju.fi.ejercicio4.model.Jugador;

public class Main {

	public static void main(String[] args) {
		short opc;
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		do {
			System.out.println("1 - Alta de jugador");
			System.out.println("2 - Mostrar todos los jugadores");
			System.out.println("3 - Modificar la posicion de un jugador");
			System.out.println("4 - Eliminar un jugador");
			System.out.println("5 - Salir");
			opc = scanner.nextShort();
			switch(opc) {
				case 1:
					System.out.println("Ingrese nombre:");
					String nombre = scanner.next();
					System.out.println("Ingrese apellido");
					String apellido = scanner.next();
					System.out.println("Ingrese fecha de nacimiento (dd/MM/yyyy)");
					String fechaString = scanner.next();
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
					LocalDate fechaNac = LocalDate.parse(fechaString, formatter);
					System.out.println("Ingrese nacionalidad");
					String nacionalidad = scanner.next();
					System.out.println("Ingrese peso");
					float peso = scanner.nextFloat();
					System.out.println("Ingrese estatura");
					float estatura = scanner.nextFloat();
					System.out.println("Ingrese posicion [delantero - medio - defensa - arquero]");
					String posicionString = scanner.next();
					Posicion posicion = Posicion.valueOf(posicionString.toUpperCase());
					jugadores.add(new Jugador(nombre, apellido, fechaNac, nacionalidad, peso, estatura, posicion));
					break;
				case 2:
					for (Jugador l:jugadores) {
						System.out.println(l);
					}
					break;
				case 3:
					System.out.println("Ingrese nombre:");
					nombre = scanner.next();
					System.out.println("Ingrese apellido:");
					apellido = scanner.next();
					for(Jugador l:jugadores) {
						if(l.getNombre().equals(nombre) && l.getApellido().equals(apellido)) {
							System.out.println("Ingrese posicion [delantero - medio - defensa - arquero]");
							posicionString = scanner.next();
							posicion = Posicion.valueOf(posicionString.toUpperCase());
							l.setPosicion(posicion);
						}
					}
					break;
				case 4:
					System.out.println("Ingrese nombre:");
					nombre = scanner.next();
					System.out.println("Ingrese apellido:");
					apellido = scanner.next();
					Iterator<Jugador> iterator = jugadores.iterator();
					while (iterator.hasNext()) {
						Jugador l = iterator.next();
						if (l.getNombre().equals(nombre) && l.getApellido().equals(apellido)) {
							iterator.remove();
						}
					}
					break;
				case 5:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion no valida");
			}
		}while(opc != 5);
		
	}

}
