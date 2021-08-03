package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


import edu.poli.Cliente;
import edu.poli.Datos;
import edu.poli.FormasDePagos;
//import edu.poli.Datos;
import edu.poli.Producto1;
import edu.poli.TipoCombo;
import edu.poli.TipoCombof;
import edu.poli.Venta;
//import edu.poli.Venta;
//import edu.poli.javaFX.modelo.Consumidor;
//import edu.poli.javaFX.modelo.Electronico;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage; 


	
	public class Controller1 implements Initializable{
		

		//-------------------------------------------
		
		// PRODUCTOS
	    @FXML
	    private TableView<Producto1> prodTabla;

	    @FXML
	    private TableColumn<Producto1, String> prodColCodigo;

	    @FXML
	    private TableColumn<Producto1, String> prodColNombre;

	    @FXML
	    private TableColumn<Producto1, Double> prodColPrecio;

	    @FXML
	    private TableColumn<Producto1, String> prodColUnidad;

	    @FXML
	    private TableColumn<Producto1, Double> prodColImpuesto;

	    @FXML
	    private TableColumn<Producto1, Integer> prodColTipo;

	    @FXML
	    private TableColumn<Producto1, Integer> prodColTipoImpuesto;

	    @FXML
	    private TextField prodCodigo;

	    @FXML
	    private TextField prodNombre;

	    @FXML
	    private TextField prodUnidad;

	    @FXML
	    private TextField prodPrecio;

	    @FXML
	    private TextField prodImpuesto;

	    @FXML
	    private ComboBox<TipoCombo> prodTipoProducto = new ComboBox<TipoCombo>();

	    @FXML
	    private ComboBox<TipoCombo> prodTipoImpuesto= new ComboBox<TipoCombo>();

	    @FXML
	    private Button prodBotonAgregar;

	    private final ObservableList<Producto1> productos = FXCollections.observableArrayList();
	    
	    @FXML
	    void prodBotonAgregarAccion(ActionEvent event) {
	    	Producto1 nuevoProducto= new Producto1();

	    	TipoCombo tipoProductoSeleccionado = this.prodTipoProducto.getSelectionModel().getSelectedItem();
	    	TipoCombo tipoImporteSeleccionado = this.prodTipoImpuesto.getSelectionModel().getSelectedItem();
	    	
	    	nuevoProducto.setCodigo(prodCodigo.getText());
	    	nuevoProducto.setNombre(prodNombre.getText());
	    	nuevoProducto.setUnidad(prodUnidad.getText());
	    	nuevoProducto.setPrecio(Double.parseDouble(prodPrecio.getText()));
	    	nuevoProducto.setTipoProducto(tipoProductoSeleccionado.getId());
	    	nuevoProducto.setTipoImpuesto(tipoImporteSeleccionado.getId());
	    	nuevoProducto.setImpuesto(Double.parseDouble(this.prodImpuesto.getText()));
	    	productos.add(nuevoProducto);

	    	prodColCodigo.setCellValueFactory(new PropertyValueFactory<Producto1, String>("codigo"));
	    	prodColNombre.setCellValueFactory(new PropertyValueFactory<Producto1, String>("nombre"));
	    	prodColPrecio.setCellValueFactory(new PropertyValueFactory<Producto1, Double>("precio"));
	    	prodColUnidad.setCellValueFactory(new PropertyValueFactory<Producto1, String>("unidad"));
	    	prodColImpuesto.setCellValueFactory(new PropertyValueFactory<Producto1, Double>("impuesto"));
	    	prodColTipo.setCellValueFactory(new PropertyValueFactory<Producto1, Integer>("tipoProducto"));
	    	prodColTipoImpuesto.setCellValueFactory(new PropertyValueFactory<Producto1, Integer>("tipoImpuesto"));

	    	prodTabla.getItems().setAll(productos);
	    }
	    
	    
		//-------------------------------------------
		
	    // CLIENTES
	    

	    @FXML
	    private TableView<Cliente> clienteTable;

	    @FXML
	    private TableColumn<Cliente, String> clienteColNombres;

	    @FXML
	    private TableColumn<Cliente, String> clienteColApellidos;

	    @FXML
	    private TableColumn<Cliente, String> clienteColTarjeta;

	    @FXML
	    private TextField clienteNombre;

	    @FXML
	    private TextField clienteApellido;

	    @FXML
	    private TextField clienteTarjeta;

	    @FXML
	    private Button clienteBotonAgregar;

	    private final ObservableList<Cliente> clientes = FXCollections.observableArrayList();

	    @FXML
	    void clienteBotonAgregarAccion(ActionEvent event) {
	    	
	    	Cliente cliente= new Cliente();
	    	
	    	cliente.setNombres(this.clienteNombre.getText());
	    	cliente.setApellidos(this.clienteApellido.getText());
	    	cliente.setTarjeta(this.clienteTarjeta.getText());
	    	
	    	
	    	clientes.add(cliente);

	    	clienteColNombres.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombres"));
	    	clienteColApellidos.setCellValueFactory(new PropertyValueFactory<Cliente, String>("apellidos"));
	    	clienteColTarjeta.setCellValueFactory(new PropertyValueFactory<Cliente, String>("tarjeta"));

	    	clienteTable.getItems().setAll(this.clientes);
	    
	   /* if (!cliente.contains) {
	    	
	    }*/
	    
	    }
	    
	    
	    
	    //-------------------------------------------
	    
	    // NUEVA VENTA
	    @FXML
	    private Button botonNuevaVenta;

	    @FXML
	    void botonNuevaVentaAccion(ActionEvent event) {
	    	try {	        
				FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("FacturaNueva.fxml"));
		        Pane root =  (Pane) loader.load();
				Stage secondStage = new Stage();
		        secondStage.setScene(new Scene(root));
		        secondStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }

	    //----------------------------------
	    
	    //  FACTURA NUEVA
	
	    @FXML
	    private TableView<?> tablaProductosSeleccionados;

	    @FXML
	    private Button cancelarNuevaFactura;

	    @FXML
	    private Button verFacturaGenerada;

	    @FXML
	    private Button vistaSeleccionarCliente;

	    @FXML
	    private Button vistaSeleccionarProductos;
	    
	    
	    @FXML
	    private ComboBox<?> vistaFormasDePago;
	    
	    
	    @FXML
	    private TableColumn<FormasDePagos, Integer> facColFormasPago;
	    
	    
		@FXML
	    private ComboBox<TipoCombof> tipodePago = new ComboBox<TipoCombof>();
		
		
		
	    @FXML
	    void cancelarNuevaFacturaAccion(ActionEvent event) {

	    }

	   @FXML
	    void verFacturaGeneradaAccion(ActionEvent event) {
		    	/*Venta nuevaVenta= new Venta();

		    	TipoCombof tipoProductoSeleccionado = this.prodTipoProducto1.getSelectionModel().getSelectedItem();
		    	
		    	nuevaVenta.setCodigo(prodCodigo.getText());
		    	nuevaVenta.setNombre(prodNombre.getText());
		    	nuevaVenta.setUnidad(prodUnidad.getText());
		    	nuevaVenta.setPrecio(Double.parseDouble(prodPrecio.getText()));
		    	nuevaVenta.setTipoProducto(tipoProductoSeleccionado1.getId());
		    	nuevaVenta.setTipoImpuesto(tipoProductoSeleccionado1.getId());
		    	nuevaVenta.setImpuesto(Double.parseDouble(this.prodImpuesto.getText()));
		    	nuevaVenta.setFormasDePagos(tipodePago.getItems());
		    	productos.add(nuevoProducto);

		    	prodColCodigo.setCellValueFactory(new PropertyValueFactory<Producto1, String>("codigo"));
		    	prodColNombre.setCellValueFactory(new PropertyValueFactory<Producto1, String>("nombre"));
		    	prodColPrecio.setCellValueFactory(new PropertyValueFactory<Producto1, Double>("precio"));
		    	prodColUnidad.setCellValueFactory(new PropertyValueFactory<Producto1, String>("unidad"));
		    	prodColImpuesto.setCellValueFactory(new PropertyValueFactory<Producto1, Double>("impuesto"));
		    	prodColTipo.setCellValueFactory(new PropertyValueFactory<Producto1, Integer>("tipoProducto"));
		    	prodColTipoImpuesto.setCellValueFactory(new PropertyValueFactory<Producto1, Integer>("tipoImpuesto"));

		    	prodTabla.getItems().setAll(productos);*/
		    }
		   

		//@FXML
	    void vistaFormasDePagoAccion(ActionEvent event) {
	    	

	    }
	    
	    
		//Efectivo nuevoPago = new Efectivo();	
		   //----------------
				
			//FORMAS DE PAGO	
		
		    //ObservableList<Efectivo> FormaLista =  FXCollections.observableArrayList();
		    //ArrayList<Efectivo> FormaList = new ArrayList<Efectivo>();

		    //Efectivo nuevoPago = new Efectivo();

	    	//TipoCombof tipoPagoSeleccionado = this.tipodePago.getSelectionModel().getSelectedItem();	
		    

	    	//productos.add(nuevoProducto);
	    
	    
	    


	    @FXML
	    void vistaSeleccionarClienteAccion(ActionEvent event) {
	    	try {	        
				FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("FacturaCliente.fxml"));
		        Pane root =  (Pane) loader.load();
				Stage secondStage = new Stage();
		        secondStage.setScene(new Scene(root));
		        secondStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }

	    @FXML
	    void vistaSeleccionarProductosAccion(ActionEvent event) {
	    	try {	        
				FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("FacturaProductos.fxml"));
		        Pane root =  (Pane) loader.load();
				Stage secondStage = new Stage();
		        secondStage.setScene(new Scene(root));
		        secondStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
	    
	    
	
	    
	    
	    
	  
	    
	    
	    
	    //-----------------------------------------------------
	    
	    
	    // SELECCIONAR CLIENTE 
	    @FXML
	    private TextArea infoClienteSeleccionar;

	    @FXML
	    private TableView<Cliente> tablaSeleccionarCliente;

	    @FXML
	    private TableColumn<Cliente, String> columnaNombresSeleccionarCliente;

	    @FXML
	    private TableColumn<Cliente, String> columnaApellidosSeleccionarCliente;

	    @FXML
	    private TableColumn<Cliente, String> columnaTarjetaSeleccionarCliente;

	    @FXML
	    private Button botonSeleccionarCliente;

	    @FXML
	    void botonSeleccionarClienteAccion(ActionEvent event) { 

	    	columnaNombresSeleccionarCliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombres"));
	    	columnaApellidosSeleccionarCliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("apellidos"));
	    	columnaTarjetaSeleccionarCliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("tarjeta"));

	    	
	    	
	    	

	    	
	    	clienteTable.getItems().setAll(clientes);
	    }
	    //----------------------------------------
	    
	    // SELECCIONAR PRODUCTO
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
        //-------------------------------------------
		
	    // FORMAS DE PAGO
	    
	    
	    
	    
	    
	    
	    
	    
	    //--------------------------------------
	    // private Datos cliente = new Datos();
	    
	    
		// MANEJO DE VISTAS
	

		@FXML
	    void vistaProductos(ActionEvent event) {
			try {	        
				FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("Productos.fxml"));
		        Pane root =  (Pane) loader.load();
				Stage secondStage = new Stage();
		        secondStage.setScene(new Scene(root));
		        secondStage.show();
		        
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }

	    @FXML
	    void vistaVenta(ActionEvent event) {
	    	try {	        
				FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("Venta.fxml"));
		        Pane root =  (Pane) loader.load();
				Stage secondStage = new Stage();
		        secondStage.setScene(new Scene(root));
		        secondStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
	    
	    
	    @FXML
	    void vistaEfectivo(ActionEvent event) {
	    	try {	        
				FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("Efectivo.fxml"));
		        Pane root =  (Pane) loader.load();
				Stage secondStage = new Stage();
		        secondStage.setScene(new Scene(root));
		        secondStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
	    
	    @FXML
	    void vistaCheque(ActionEvent event) {
	    	try {	        
				FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("Cheque.fxml"));
		        Pane root =  (Pane) loader.load();
				Stage secondStage = new Stage();
		        secondStage.setScene(new Scene(root));
		        secondStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
	    
	    
	    
	    @FXML
	    void vistaTarjeta(ActionEvent event) {
	    	try {	        
				FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(getClass().getResource("TarjetaPago.fxml"));
		        Pane root =  (Pane) loader.load();
				Stage secondStage = new Stage();
		        secondStage.setScene(new Scene(root));
		        secondStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
	    
  
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			this.prodTipoImpuesto.setItems(FXCollections.observableArrayList(
					new TipoCombo("Iva5%",1),
					new TipoCombo("Iva16%", 2),
					new TipoCombo("Iva19%", 3)
					));
			
			this.prodTipoProducto.setItems(FXCollections.observableArrayList(
					new TipoCombo("Alimento",1),
					new TipoCombo("Aseo", 2),
					new TipoCombo("Electrodomestico", 3)
					));

			this.prodTipoImpuesto.getSelectionModel().select(0);
			this.prodTipoProducto.getSelectionModel().select(0);	 
		
		
			this.tipodePago.setItems(FXCollections.observableArrayList(
					
				new TipoCombof("Efectivo", 1),
				new TipoCombof("Cheque", 2),	
				new TipoCombof("Tarjeta", 3)	
				));
		
			this.tipodePago.getSelectionModel().select(0);
		
		
		
		}
	}

	
	


