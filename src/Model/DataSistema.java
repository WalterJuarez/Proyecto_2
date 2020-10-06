package Model;

import javafx.scene.control.TableView;

import java.util.ArrayList;

public class DataSistema{

    public static ArrayList<Individual> listadoClientes = new ArrayList<>();
    public static ArrayList<Producto> listaProducto = new ArrayList<>();

    public TableView<Individual> Datos(){

        listadoClientes.add(new Individual("2666475020101","walter","38910632","Ciudad","Particular"));
        listadoClientes.add(new Individual("63546542313","sheily","524288885","Ciudad","Particular"));
        listadoClientes.add(new Individual("6546146131222","Daniel","987532","Ciudad","Particular"));
        listadoClientes.add(new Individual("4563222125410","Sergio","3654742","Ciudad","Particular"));
        listadoClientes.add(new Individual("Sergio Marroquin","Indutria Hola","3343826","Ciudad","Empresa"));
        return null;
    }

    public TableView<Producto> DatosR(){
        listaProducto.add( new Producto( "cojinete a-21",23.5,12 ) );
        listaProducto.add( new Producto( "cigueñal ",135.45,18 ) );
        listaProducto.add( new Producto( "pide vias derecho",73.5,12 ) );
        return null;
    }

}
