package ar.edu.unju.fi.ejercicio3.main;

import java.util.ArrayList;

import ar.edu.unju.fi.ejercicio3.constantes.Provincia;

public class Main {

	public static void main(String[] args) {
		ArrayList<Provincia> provincias = new ArrayList<>();
		
		for(Provincia l:Provincia.values()) {
			provincias.add(l);
		}
		
		for(Provincia l:provincias) {
			System.out.println("\n"+l.name()+" Poblacion:"+l.getCantidadPoblacion()+" Superficie:"+
			l.getSuperficie()+"km2"+" Densidad poblacional:"+l.densidadPoblacional());
			
		}

	}

}
