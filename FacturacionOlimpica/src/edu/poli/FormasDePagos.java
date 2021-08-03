package edu.poli;


public class FormasDePagos extends Efectivo {
	
	   private double monto;

	    private String fecha;

	    private String tipoMoneda;

	    //public abstract int TipoDePago();
	    
	    private int tipodePago;

	    
		public FormasDePagos(double monto, String fecha, String tipoMoneda, int tipodePago) {
			super();
			this.monto = monto;
			this.fecha = fecha;
			this.tipoMoneda = tipoMoneda;
			this.tipodePago = tipodePago;
		}

		public double getMonto() {
			return monto;
		}

		public void setMonto(double monto) {
			this.monto = monto;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}

		public String getTipoMoneda() {
			return tipoMoneda;
		}

		public void setTipoMoneda(String tipoMoneda) {
			this.tipoMoneda = tipoMoneda;
		}


		public int getTipodePago() {
			return tipodePago;
		}


		public void setTipodePago(int tipodePago) {
			this.tipodePago = tipodePago;
		}
	     
		
		
		
		
		/*public String toString(FormasDePagos object) {
		       
		        
		        if ( this.tipoDePago()== 1) {
		        	return "Efectivo ";
		        }
		        
		        if ( this.TipoDePago()== 2) {
		        	return "Tarjeta ";
		        }
		        
		        
		        if ( this.TipoDePago()== 3) {
		        	return "Cheque ";
		        }
				return "FormaDePago ";
		        
		        
		        
		    }*/
	
  
	}
	
