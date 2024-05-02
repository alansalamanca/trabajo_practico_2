package ar.edu.unju.fi.ejercicio5.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio5.model.PagoEfectivo;
import ar.edu.unju.fi.ejercicio5.model.PagoTarjeta;
import ar.edu.unju.fi.ejercicio5.model.Producto;
import ar.edu.unju.fi.ejercicio5.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio5.model.Producto.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		short opcion;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Producto> productos = new ArrayList<>();
		ArrayList<Producto> productosComprados = new ArrayList<>();
		productos.add(new Producto(111, "SamsungA01", 140000, OrigenFabricacion.BRASIL, Categoria.TELEFONIA, false));
		productos.add(new Producto(112, "SamsungA05", 180000, OrigenFabricacion.BRASIL, Categoria.TELEFONIA, true));
		productos.add(new Producto(113, "SamsungA21", 220000, OrigenFabricacion.BRASIL, Categoria.TELEFONIA, true));
		productos.add(new Producto(114, "SamsungA50", 380000, OrigenFabricacion.BRASIL, Categoria.TELEFONIA, true));
		productos.add(new Producto(115, "SamsungJ7", 120000, OrigenFabricacion.BRASIL, Categoria.TELEFONIA, false));
		productos.add(new Producto(116, "NotebookHP", 560000, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA, true));
		productos.add(new Producto(117, "NotebookLG", 740000, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA, false));
		productos.add(new Producto(118, "NotebookLenovo", 785000, OrigenFabricacion.URUGUAY, Categoria.INFORMATICA, true));
		productos.add(new Producto(119, "NotebookAsus", 974000, OrigenFabricacion.CHINA, Categoria.INFORMATICA, false));
		productos.add(new Producto(120, "LicuadoraPhilips", 60000, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, false));
		productos.add(new Producto(121, "VentiladorKanji", 44500, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR, true));
		productos.add(new Producto(122, "HeladeraSamsung", 388000, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, true));
		productos.add(new Producto(123, "PavaElectrica", 29800, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR, true));
		productos.add(new Producto(124, "AireAcondicionado", 144799, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR, false));
		productos.add(new Producto(125, "Plancha", 25899, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR, true));
		do {
			System.out.println("1 - Mostrar productos");
			System.out.println("2 - Realizar compra");
			System.out.println("3 - Salir");
			opcion = scanner.nextShort();
			switch (opcion) {
				case 1:
					System.out.println("--- Productos con stock ---");
					for (Producto l:productos) {
						if (l.isEstado() == true)
						System.out.println(l);
					}
					break;
				case 2:
					do {
						System.out.println("Ingrese codigo");
						int codigo = scanner.nextInt();
						for (Producto l:productos) {
							if(l.getCodigo() == codigo) {
								productosComprados.add(l);
							}
						}
						System.out.println("¿Desea seguir ingresando? (1) si (2) no");
						opcion = scanner.nextShort();
					}while (opcion != 2);
					System.out.println("--- Seleccione un metodo de pago ---");
					System.out.println("1 - Pago efectivo");
					System.out.println("2 - Pago con tarjeta");
					opcion = scanner.nextShort();
					switch (opcion) {
						case 1:
							double sumaProductos = 0;
							for (Producto l:productosComprados) {
								sumaProductos = sumaProductos + l.getPrecioUnitario();
							}
							PagoEfectivo efectivo = new PagoEfectivo(sumaProductos, LocalDate.now());
							efectivo.realizarPago(sumaProductos);
							efectivo.imprimirRecibo();
							break;
						case 2:
							sumaProductos = 0;
							for (Producto l:productosComprados) {
								sumaProductos = sumaProductos + l.getPrecioUnitario();
							}
							String numeroTarjeta;
							System.out.println("Ingrese el numero de tarjeta:");
							numeroTarjeta = scanner.next();
							PagoTarjeta tarjeta = new PagoTarjeta(numeroTarjeta, LocalDate.now(), sumaProductos);
							tarjeta.realizarPago(sumaProductos);
							tarjeta.imprimirRecibo();
							break;
					}
					break;
			}
		}while (opcion != 3);
		
	}

}
