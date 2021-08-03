package edu.poli;

import java.util.Date;

import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;

public class Venta {
	private Productos productoVendidos;
	private Cliente cliente;
	private Date fecha;
	private FormasDePagos formasdepago;
	
	public Venta(Productos productoVendidos, Cliente cliente, Date fecha, FormasDePagos formasdepago) {
		super();
		this.productoVendidos = productoVendidos;
		this.cliente = cliente;
		this.fecha = fecha;
		this.formasdepago = formasdepago;
		
	}

	public Productos getProductoVendidos() {
		return productoVendidos;
	}
	public void setProductoVendidos(Productos productoVendidos) {
		this.productoVendidos = productoVendidos;
	}
	public FormasDePagos getFormasdepago() {
		return formasdepago;
	}
	public void setFormasdepago(FormasDePagos formasdepago) {
		this.formasdepago = formasdepago;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public FormasDePagos getPagos() {
		return formasdepago;
	}
	public void setFormasDePagos(ObservableList<TipoCombof> formasdepago) {
		this.formasdepago = (FormasDePagos) formasdepago;
	
}

	public void setCodigo(String text) {
		// TODO Auto-generated method stub
		
	}

	public void setNombre(String text) {
		// TODO Auto-generated method stub
		
	}

	public void setUnidad(String text) {
		// TODO Auto-generated method stub
		
	}

	public void setPrecio(double parseDouble) {
		// TODO Auto-generated method stub
		
	}

	public void setImpuesto(double parseDouble) {
		// TODO Auto-generated method stub
		
	}

	public void setTipoProducto(int idp) {
		// TODO Auto-generated method stub
		
	}

	public void setTipoImpuesto(int idp) {
		// TODO Auto-generated method stub
		
	}

	public void setFormasDePagos(ComboBox<TipoCombof> tipodePago) {
		// TODO Auto-generated method stub
		
	}
	
}
