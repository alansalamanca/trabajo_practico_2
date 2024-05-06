package ar.edu.unju.fi.ejercicio7.main;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import ar.edu.unju.fi.ejercicio5.model.Producto;
import ar.edu.unju.fi.ejercicio5.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio5.model.Producto.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		byte opcion;
		ArrayList<Producto> productos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		productos.add(new Producto(111, "SamsungA01", 140000, OrigenFabricacion.BRASIL, Categoria.TELEFONIA, true));
		productos.add(new Producto(112, "SamsungA05", 180000, OrigenFabricacion.BRASIL, Categoria.TELEFONIA, true));
		productos.add(new Producto(113, "SamsungA21", 220000, OrigenFabricacion.BRASIL, Categoria.TELEFONIA, true));
		productos.add(new Producto(114, "SamsungA50", 380000, OrigenFabricacion.BRASIL, Categoria.TELEFONIA, true));
		productos.add(new Producto(115, "SamsungJ7", 120000, OrigenFabricacion.BRASIL, Categoria.TELEFONIA, true));
		productos.add(new Producto(116, "NotebookHP", 560000, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA, true));
		productos.add(new Producto(117, "NotebookLG", 740000, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA, false));
		productos.add(new Producto(118, "NotebookLenovo", 785000, OrigenFabricacion.URUGUAY, Categoria.INFORMATICA, true));
		productos.add(new Producto(119, "NotebookAsus", 974000, OrigenFabricacion.CHINA, Categoria.INFORMATICA, false));
		productos.add(new Producto(120, "LicuadoraPhilips", 60000, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, true));
		productos.add(new Producto(121, "VentiladorKanji", 44500, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR, true));
		productos.add(new Producto(122, "HeladeraSamsung", 388000, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, true));
		productos.add(new Producto(123, "PavaElectrica", 29800, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR, true));
		productos.add(new Producto(124, "AireAcondicionado", 144799, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR, true));
		productos.add(new Producto(125, "Plancha", 25899, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR, true));
		
		do {
			System.out.println("1 - Mostrar productos");
			System.out.println("2 - Mostrar productos faltantes");
			System.out.println("3 - Incrementar los precios de los productos en un 20%");
			System.out.println("4 - Mostrar productos que correspondan a la categoria Electrohogar y que esten disponibles para la venta");
			System.out.println("5 - Ordenar los productos por precio de forma descendente");
			System.out.println("6 - Mostrar los productos con los nombres en mayusculas");
			System.out.println("7 - Salir");
			opcion = scanner.nextByte();
			
			switch (opcion) {
				case 1:
					Consumer<Producto> mostrar = p -> {if (p.isEstado())
						System.out.println(p);
					};
					productos.forEach(mostrar);
					break;
				case 2:
					Predicate<Producto> noDisponible = p -> p.isEstado()==false;
					System.out.println(productos.stream().filter(noDisponible).collect(Collectors.toList()));
					break;
				case 3:
					ArrayList<Producto> productosIncrementados = new ArrayList<>();
					Function<Producto, Producto> aumento = p -> {
						p.setPrecioUnitario(p.getPrecioUnitario()*1.20f);
						return p;
					};
					productosIncrementados = (ArrayList<Producto>) productos.stream().map(aumento).collect(Collectors.toList());
					System.out.println(productosIncrementados);
					break;
				case 4:
					Predicate<Producto> condicion = p -> p.isEstado() && p.getCategoria()==p.getCategoria().ELECTROHOGAR;
					System.out.println(productos.stream().filter(condicion).collect(Collectors.toList()));
					break;
				case 5:
					Comparator<Producto> c = Comparator.comparing(Producto :: getPrecioUnitario).reversed();
					productos.sort(c);
					System.out.println(productos);
					break;
				case 6:
					Function<Producto, Producto> mayuscula = p -> {
						p.setDescripcion(p.getDescripcion().toUpperCase());
						return p;
					};
					System.out.println(productos.stream().map(mayuscula).collect(Collectors.toList()));
					break;
				case 7:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion no valida");
			}
		}while(opcion != 7);
	}

}
