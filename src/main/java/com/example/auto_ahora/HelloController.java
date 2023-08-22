package com.example.auto_ahora;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TableView<String> tblplaca;
    @FXML
    private TableView<String> tblmarca;
    @FXML
    private TableView<String> tblreferencia;
    @FXML
    private TableView<String> tblmodelo;
    @FXML
    private TableView<String> tblprecio;
    @FXML
    private TableView<String> tblnumero_ruedas;
    @FXML
    private TextField placa;
    @FXML
    private TextField marca;
    @FXML
    private TextField referencia;
    @FXML
    private TextField modelo;
    @FXML
    private TextField precio;
    @FXML
    private TextField numero_ruedas;
    @FXML
    private ComboBox<String> tipo;
    @FXML
    private TextField cilindrage;
    @FXML
    private TextField tamano_tanque;
    @FXML
    private TextField num_puertas;
    @FXML
    private ComboBox combustible;
    @FXML
    private TextField capacidad_carga;

    @FXML
    public void initialize (){
        TableColumn<DatosVehiculo, String> colPlaca = new TableColumn<>("Placa");
        colPlaca.setCellValueFactory(new PropertyValueFactory<>("placa"));

        TableColumn<DatosVehiculo, String> colMarca = new TableColumn<>("Marca");
        colMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));

        TableColumn<DatosVehiculo, String> colReferencia = new TableColumn<>("Referencia");
        colModelo.setCellValueFactory(new PropertyValueFactory<>("Referencia"));

        TableColumn<DatosVehiculo, String> colModelo = new TableColumn<>("Modelo");
        colModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));

        TableColumn<DatosVehiculo, String> colPrecio = new TableColumn<>("Precio");
        colModelo.setCellValueFactory(new PropertyValueFactory<>("Precio"));

        TableColumn<DatosVehiculo, String> colNumRuedas = new TableColumn<>("NumRuedas");
        colModelo.setCellValueFactory(new PropertyValueFactory<>("NumRuedas"));



        tblVehiculos.getColumns().addAll(colPlaca, colMarca, colModelo);
    }
    public void  onRegistrarClick(){

        Vehiculo vehiculo = new Vehiculo();

        vehiculo.setPlaca(placa.getText());
        vehiculo.setMarca(marca.getText());
        vehiculo.setReferencia(referencia.getText());
        vehiculo.setModelo(modelo.getText());
        vehiculo.setPrecio(Double.parseDouble(precio.getText()));
        vehiculo.setNumeroRuedas(Integer.parseInt(numeroRuedas.getText()));
        vehiculo.setTipo(tipo.getValue());



        datos.add(vehiculo);


        tblPlaca.setItems(datos);


        placa.clear();
        marca.clear();
        referencia.clear();

    }
    @FXML
    public void onBuscarClick(){


        Vehiculo vehiculo = buscarPorPlaca(placa.getText());

        if(vehiculo != null){

            marca.setText(vehiculo.getMarca());
            modelo.setText(vehiculo.getModelo());

        }else {

        }

    }

    @FXML
    public void onListarClick(){


        tblPlaca.setItems(datos);

    }

    @FXML
    public void onVenderClick(){


        int index = tblPlaca.getSelectionModel().getSelectedIndex();
        datos.get(index).setVendido(true);

    }

    @FXML
    public void onStockClick(){


        int count = 0;
        for(Vehiculo v : datos){
            if(!v.getVendido()){
                count++;
            }
        }

        lblStock.setText("En stock: " + count);

    }

    @FXML
    public void onActualizarClick(){


        int index = tblPlaca.getSelectionModel().getSelectedIndex();

        Vehiculo vehiculo = datos.get(index);

        vehiculo.setPlaca(placa.getText());
        vehiculo.setMarca(marca.getText());

        tblPlaca.refresh();

    }

    @FXML
    public void onVentasClick(){


        int count = 0;
        for(Vehiculo v : datos){
            if(v.getVendido()){
                count++;
            }
        }


        lblVentas.setText("Vehículos vendidos: " + count);

    }

    @FXML
    public void onEliminarClick(){

        int index = tblPlaca.getSelectionModel().getSelectedIndex();


        datos.remove(index);


        tblPlaca.setItems(datos);

    }
}