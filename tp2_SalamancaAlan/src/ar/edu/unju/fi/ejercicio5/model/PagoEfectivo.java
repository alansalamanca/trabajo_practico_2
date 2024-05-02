package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoEfectivo implements Pago{
	private double montoPagado;
	LocalDate fechaPago;
	
	@Override
	public double realizarPago(double monto) {
		double descuento;
		
		descuento = this.montoPagado * 0.10;
		this.montoPagado = this.montoPagado - descuento;
		return 0;
	}
	@Override
	public void imprimirRecibo() {
		System.out.println("Fecha de pago: "+fechaPago);
		System.out.println("Monto pagado: $"+this.montoPagado);
	}
	public PagoEfectivo(double montoPagado, LocalDate fechaPago) {
		super();
		this.montoPagado = montoPagado;
		this.fechaPago = fechaPago;
	}
	
	
}
