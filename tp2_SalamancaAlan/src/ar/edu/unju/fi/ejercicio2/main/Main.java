package ar.edu.unju.fi.ejercicio2.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio2.constantes.Mes;
import ar.edu.unju.fi.ejercicio2.model.Efemeride;

public class Main {

	public static void main(String[] args) {
		short mesNum;
		short opcion;
		ArrayList<Efemeride> efemerides = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1 - Crear efemeride");
			System.out.println("2 - Mostrar efemeride");
			System.out.println("3 - Eliminar efemeride");
			System.out.println("4 - Modificar efemeride");
			System.out.println("5 - Salir");
			opcion = scanner.nextShort();
			Mes mes = null;
			switch (opcion) {
				case 1:
					System.out.println("Ingrese codigo");
					int codigo = scanner.nextInt();
					System.out.println("Ingrese numero del mes:");
					mesNum = scanner.nextShort();
					switch(mesNum) {
						case 1:
							mes = Mes.ENERO;
							break;
						case 2:
							mes = Mes.FEBRERO;
							break;
						case 3:
							mes = Mes.MARZO;
							break;
						case 4:
							mes = Mes.ABRIL;
							break;
						case 5:
							mes = Mes.MAYO;
							break;
						case 6:
							mes = Mes.JUNIO;
							break;
						case 7:
							mes = Mes.JULIO;
							break;
						case 8:
							mes = Mes.AGOSTO;
							break;
						case 9:
							mes = Mes.SEPTIEMBRE;
							break;
						case 10:
							mes = Mes.OCTUBRE;
							break;
						case 11:
							mes = Mes.NOVIEMBRE;
							break;
						case 12:
							mes = Mes.DICIEMBRE;
							break;
						default:
							System.out.println("Opcion no valida");
					}
					System.out.println("Ingrese dia:");
					byte dia = scanner.nextByte();
					System.out.println("Ingrese detalle:");
					String detalle = scanner.next();
					efemerides.add(new Efemeride(codigo, mes, dia, detalle));
					break;
				case 2:
					for (Efemeride l:efemerides) {
						System.out.println(l);
					}
					break;
				case 3:
					System.out.println("Ingrese codigo de la efemeride a eliminar:");
					codigo = scanner.nextInt();
					Iterator<Efemeride> iterator = efemerides.iterator();
					while (iterator.hasNext()) {
						Efemeride l = iterator.next();
						if (l.getCodigo() == codigo) {
							iterator.remove();
						}
					}
					System.out.println("Efemeride eliminada correctamente");
					break;
				case 4:
					System.out.println("Ingrese codigo de la efemeride a modificar:");
					codigo = scanner.nextInt();
					for (Efemeride l:efemerides) {
						if (l.getCodigo() == codigo) {
							System.out.println("Ingrese numero del mes:");
							mesNum = scanner.nextShort();
							switch (mesNum) {
								case 1:
									mes = Mes.ENERO;
									break;
								case 2:
									mes = Mes.FEBRERO;
									break;
								case 3:
									mes = Mes.MARZO;
									break;
								case 4:
									mes = Mes.ABRIL;
									break;
								case 5:
									mes = Mes.MAYO;
									break;
								case 6:
									mes = Mes.JUNIO;
									break;
								case 7:
									mes = Mes.JULIO;
									break;
								case 8:
									mes = Mes.AGOSTO;
									break;
								case 9:
									mes = Mes.SEPTIEMBRE;
									break;
								case 10:
									mes = Mes.OCTUBRE;
									break;
								case 11:
									mes = Mes.NOVIEMBRE;
									break;
								case 12:
									mes = Mes.DICIEMBRE;
									break;
								
							}
							System.out.println("Ingrese dia:");
							dia = scanner.nextByte();
							System.out.println("Ingrese detalle:");
							detalle = scanner.next();
							l.setMes(mes);
							l.setDia(dia);
							l.setDetalle(detalle);
						}
					}
					break;
				case 5:
					System.out.println("Saliendo...");
			}
		}while(opcion != 5);
		
	}

}
