package ar.edu.unju.fi.ejercicio6.main;

import ar.edu.unju.fi.ejercicio6.interfaces.funcionales.Converter;
import ar.edu.unju.fi.ejercicio6.model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio6.model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {
		
		FelinoDomestico gato = new FelinoDomestico("Garfield", (byte)45, 12f);
		//definicion de expresion lambda que define el convertidor de FelinoDomestico a
		//FelinoSalvaje.
		Converter<FelinoDomestico, FelinoSalvaje> converter = x -> new FelinoSalvaje(x.getNombre(), 
		x.getEdad(), x.getPeso());;
		//se realiza la conversion
		FelinoSalvaje felino1 = converter.convert(gato);
		//mostramos los datos del objeto felino salvaje felino1
		converter.mostrarObjeto(felino1);
		
		//Conversion de un objeto felino salvaje A felino domestico
		FelinoSalvaje felino2 = new FelinoSalvaje("Tanner", (byte)20, 186f);
		boolean noNulo = Converter.isNotNull(felino2);
		if (noNulo == true) {
			Converter<FelinoSalvaje, FelinoDomestico> converter2 = y -> new FelinoDomestico(y.getNombre(),
			y.getEdad(), y.getPeso());
			FelinoDomestico gato2 = converter2.convert(felino2);
			converter2.mostrarObjeto(gato2);
		}
		else {
			System.out.println("El objeto es nulo");
		}
	}

}
