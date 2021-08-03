package edu.poli;


public abstract class Productos {

	private int id;
	private String codigo;
	private String nombre;
	private String unidad;
	private double precio;
	private int tipoProducto;
	private int tipoImpuesto;
	private double impuesto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(int tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public int getTipoImpuesto() {
		return tipoImpuesto;
	}
	public void setTipoImpuesto(int tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	 
	
}
