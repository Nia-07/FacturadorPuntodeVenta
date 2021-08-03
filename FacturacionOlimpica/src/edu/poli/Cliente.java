package edu.poli;

public class Cliente {
	
	
	private int id; 
	private String nombres;
	private String apellidos;
	private String tarjeta;
	 
	

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	} 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
