package edu.poli;

public class TipoCombof {
	
	private String nombre1;
	private int idp;
	
	
	public TipoCombof(String nombre1, int idp) {
		super();
		this.nombre1 = nombre1;
		this.idp = idp;
	}
	public String getNombre1() {
		return nombre1;
	}
	public void setNombr1e(String nombre1) {
		this.nombre1 = nombre1;
	}
	public int getIdp() {
		return idp;
	}
	public void setIdp(int idp) {
		this.idp = idp;
	}
	
	@Override
	public String toString() {
	    return this.getNombre1();
	}
	

}



