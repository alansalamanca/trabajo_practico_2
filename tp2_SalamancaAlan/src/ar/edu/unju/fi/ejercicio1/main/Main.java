package ar.edu.unju.fi.ejercicio1.main;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio1.model.Producto;
import ar.edu.unju.fi.ejercicio1.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio1.model.Producto.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		int codigo;
		String descripcion;
		float precioUnitario;
		byte origenOpcion, categoriaOpcion;
		byte opcion;
		ArrayList<Producto> productos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1 - Crear producto");
			System.out.println("2 - Mostrar productos");
			System.out.println("3 - Modificar producto");
			System.out.println("4 - Salir");
			opcion = scanner.nextByte();
			switch (opcion) {
				case 1:
					System.out.println("Ingrese el codigo del producto:");
					codigo = scanner.nextInt();
					System.out.println("Ingrese una descripcion del producto:");
					descripcion = scanner.next();
					System.out.println("Ingrese precio del producto:");
					precioUnitario = scanner.nextFloat();
					System.out.println("--- Origen de fabricacion ---");
					System.out.println("1 - Argentina");
					System.out.println("2 - China");
					System.out.println("3 - Brasil");
					System.out.println("4 - Uruguay");
					System.out.println("Elija una opcion:");
					origenOpcion = scanner.nextByte();
					switch (origenOpcion){
						case 1:
							OrigenFabricacion argentina = OrigenFabricacion.ARGENTINA;
							System.out.println("--- Categoria ---");
							System.out.println("1 - Telefonia");
							System.out.println("2 - Informatica");
							System.out.println("3 - Electro hogar");
							System.out.println("4 - Herramientas");
							System.out.println("Elija una opcion:");
							categoriaOpcion = scanner.nextByte();
							switch(categoriaOpcion) {
								case 1:
									Categoria telefonia = Categoria.TELEFONIA;
									productos.add(new Producto(codigo, descripcion, precioUnitario, argentina, telefonia));
									break;
								case 2:
									Categoria informatica = Categoria.INFORMATICA;
									productos.add(new Producto(codigo, descripcion, precioUnitario, argentina, informatica));
									break;
								case 3:
									Categoria electrohogar = Categoria.ELECTROHOGAR;
									productos.add(new Producto(codigo, descripcion, precioUnitario, argentina, electrohogar));
									break;
								case 4:
									Categoria herramientas = Categoria.HERRAMIENTAS;
									productos.add(new Producto(codigo, descripcion, precioUnitario, argentina, herramientas));
									break;
								default:
									System.out.println("Opcion no valida");
							}
							break;
						case 2:
							OrigenFabricacion china = OrigenFabricacion.CHINA;
							System.out.println("--- Categoria ---");
							System.out.println("1 - Telefonia");
							System.out.println("2 - Informatica");
							System.out.println("3 - Electro hogar");
							System.out.println("4 - Herramientas");
							System.out.println("Elija una opcion:");
							categoriaOpcion = scanner.nextByte();
							switch(categoriaOpcion) {
								case 1:
									Categoria telefonia = Categoria.TELEFONIA;
									productos.add(new Producto(codigo, descripcion, precioUnitario, china, telefonia));
									break;
								case 2:
									Categoria informatica = Categoria.INFORMATICA;
									productos.add(new Producto(codigo, descripcion, precioUnitario, china, informatica));
									break;
								case 3:
									Categoria electrohogar = Categoria.ELECTROHOGAR;
									productos.add(new Producto(codigo, descripcion, precioUnitario, china, electrohogar));
									break;
								case 4:
									Categoria herramientas = Categoria.HERRAMIENTAS;
									productos.add(new Producto(codigo, descripcion, precioUnitario, china, herramientas));
									break;
								default:
									System.out.println("Opcion no valida");
							}
							break;
						case 3:
							OrigenFabricacion brasil = OrigenFabricacion.BRASIL;
							System.out.println("--- Categoria ---");
							System.out.println("1 - Telefonia");
							System.out.println("2 - Informatica");
							System.out.println("3 - Electro hogar");
							System.out.println("4 - Herramientas");
							System.out.println("Elija una opcion:");
							categoriaOpcion = scanner.nextByte();
							switch(categoriaOpcion) {
								case 1:
									Categoria telefonia = Categoria.TELEFONIA;
									productos.add(new Producto(codigo, descripcion, precioUnitario, brasil, telefonia));
									break;
								case 2:
									Categoria informatica = Categoria.INFORMATICA;
									productos.add(new Producto(codigo, descripcion, precioUnitario, brasil, informatica));
									break;
								case 3:
									Categoria electrohogar = Categoria.ELECTROHOGAR;
									productos.add(new Producto(codigo, descripcion, precioUnitario, brasil, electrohogar));
									break;
								case 4:
									Categoria herramientas = Categoria.HERRAMIENTAS;
									productos.add(new Producto(codigo, descripcion, precioUnitario, brasil, herramientas));
									break;
								default:
									System.out.println("Opcion no valida");
							}
							break;
						case 4:
							OrigenFabricacion uruguay = OrigenFabricacion.URUGUAY;
							System.out.println("--- Categoria ---");
							System.out.println("1 - Telefonia");
							System.out.println("2 - Informatica");
							System.out.println("3 - Electro hogar");
							System.out.println("4 - Herramientas");
							System.out.println("Elija una opcion:");
							categoriaOpcion = scanner.nextByte();
							switch(categoriaOpcion) {
								case 1:
									Categoria telefonia = Categoria.TELEFONIA;
									productos.add(new Producto(codigo, descripcion, precioUnitario, uruguay, telefonia));
									break;
								case 2:
									Categoria informatica = Categoria.INFORMATICA;
									productos.add(new Producto(codigo, descripcion, precioUnitario, uruguay, informatica));
									break;
								case 3:
									Categoria electrohogar = Categoria.ELECTROHOGAR;
									productos.add(new Producto(codigo, descripcion, precioUnitario, uruguay, electrohogar));
									break;
								case 4:
									Categoria herramientas = Categoria.HERRAMIENTAS;
									productos.add(new Producto(codigo, descripcion, precioUnitario, uruguay, herramientas));
									break;
								default:
									System.out.println("Opcion no valida");
							}
							break;
						default:
							System.out.println("Opcion no valida");
					}
					break;
				case 2:
					for (Producto l:productos) {
						System.out.println(l);
					}
					break;
				case 3:
					System.out.println("Ingrese el codigo del producto a modificar");
					codigo = scanner.nextInt();
					for (Producto l:productos) {
						if(l.getCodigo() == codigo) {
							System.out.println("Ingrese nueva descripcion:");
							descripcion = scanner.next();
							System.out.println("Ingrese nuevo precio:");
							precioUnitario = scanner.nextFloat();
							l.setDescripcion(descripcion);
							l.setPrecioUnitario(precioUnitario);
							System.out.println("--- Origen de fabricacion ---");
							System.out.println("1 - Argentina");
							System.out.println("2 - China");
							System.out.println("3 - Brasil");
							System.out.println("4 - Uruguay");
							System.out.println("Elija una opcion:");
							origenOpcion = scanner.nextByte();
							switch (origenOpcion){	
							case 1:
								OrigenFabricacion argentina = OrigenFabricacion.ARGENTINA;
								l.setOrigen(argentina);
								break;
							case 2:
								OrigenFabricacion china = OrigenFabricacion.CHINA;
								l.setOrigen(china);
								break;
							case 3:
								OrigenFabricacion brasil = OrigenFabricacion.BRASIL;
								l.setOrigen(brasil);
								break;
							case 4:
								OrigenFabricacion uruguay = OrigenFabricacion.URUGUAY;
								l.setOrigen(uruguay);
								break;
							default:
								System.out.println("Opcion no valida");
							}
							System.out.println("--- Categoria ---");
							System.out.println("1 - Telefonia");
							System.out.println("2 - Informatica");
							System.out.println("3 - Electro hogar");
							System.out.println("4 - Herramientas");
							System.out.println("Elija una opcion:");
							categoriaOpcion = scanner.nextByte();
							switch (categoriaOpcion) {
								case 1:
									Categoria telefonia = Categoria.TELEFONIA;
									l.setCategoria(telefonia);
									break;
								case 2:
									Categoria informatica = Categoria.INFORMATICA;
									l.setCategoria(informatica);
									break;
								case 3:
									Categoria electrohogar = Categoria.ELECTROHOGAR;
									l.setCategoria(electrohogar);
									break;
								case 4:
									Categoria herramientas = Categoria.HERRAMIENTAS;
									l.setCategoria(herramientas);
									break;
							}
						}
					}
					break;
				case 4:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion no valida");
			}
		} while (opcion != 4);
	}
}
