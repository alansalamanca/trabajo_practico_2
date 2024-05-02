package ar.edu.unju.fi.ejercicio5.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoTarjeta implements Pago{
	private String numeroTarjeta;
	private LocalDate fechaPago;
	private double montoPagado;
	
	public PagoTarjeta(String numeroTarjeta, LocalDate fechaPago, double montoPagado) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaPago = fechaPago;
		this.montoPagado = montoPagado;
	}
	
	@Override
	public double realizarPago(double monto) {
		this.montoPagado = this.montoPagado * 1.15;
		return 0;
	}
	@Override
	public void imprimirRecibo() {
		System.out.println("Numero de tarjeta: "+this.numeroTarjeta);
		System.out.println("Fecha de pago: "+this.fechaPago);
		System.out.println("Monto pagado: $"+this.montoPagado);
	}
}
