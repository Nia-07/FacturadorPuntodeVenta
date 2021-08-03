package edu.poli;

import java.util.List;

public class Datos {
	
	public Almacen almacen;
	public List<Productos2> productos;
	public List<Cliente> clientes;
	public List<Venta> ventas;
	
	public Datos() {
		
	}
	
	public Almacen getAlmacen() {
		return almacen;
	}


	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}


	public List<Productos2> getProductos2() {
		return productos;
	}


	public void setProductos(List<Productos2> productos) {
		this.productos = productos;
	}


	public List<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}


	public List<Venta> getVentas() {
		return ventas;
	}


	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
}