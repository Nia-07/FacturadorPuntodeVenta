package edu.poli;

public class  Efectivo  {

	    public Efectivo() {
	    	
	    }

	    private int moneda;

	    private int billete;

	    

		public Efectivo(int moneda, int billete) {
			super();
			this.moneda = moneda;
			this.billete = billete;
		}

		public int getMoneda() {
			return moneda;
		}

		public void setMoneda(int moneda) {
			this.moneda = moneda;
		}


		public int getBillete() {
			return billete;
		}


		public void setBillete(int billete) {
			this.billete = billete;
		}


		public int TipoDePago() {
			// TODO Auto-generated method stub
			return 1;
		}

	}


