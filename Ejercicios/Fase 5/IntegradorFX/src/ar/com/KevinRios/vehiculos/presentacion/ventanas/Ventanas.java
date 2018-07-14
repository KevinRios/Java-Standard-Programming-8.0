
package ar.com.KevinRios.vehiculos.presentacion.ventanas;


public enum Ventanas {

    VentanaPrincipal("/ar/com/KevinRios/vehiculos/presentacion/ventanas/VentanaMaestra.fxml", "Administracion de Concesionaria"), 
    AutosVentana("/ar/com/KevinRios/vehiculos/presentacion/ventanas/AutosVentana.fxml", "Administracion de Autos"), 
    VendedoresVentana("/ar/com/KevinRios/vehiculos/presentacion/ventanas/VendedoresVentana.fxml", "Administracion de Vendedores"), 
    CompradoresVentana("/ar/com/KevinRios/vehiculos/presentacion/ventanas/CompradoresVentana.fxml", "Administracion de Compradores"),
    AutosEdicion("/ar/com/KevinRios/vehiculos/presentacion/ventanas/AutosEdicion.fxml", "Edicion de Autos"),
    CompradoresEdicion("/ar/com/KevinRios/vehiculos/presentacion/ventanas/CompradoresEdicion.fxml", "Edicion de Compradores"),
    VendedoresEdicion("/ar/com/KevinRios/vehiculos/presentacion/ventanas/VendedoresEdicion.fxml", "Edicion de Vendedores"),
    ConfiguracionVentana("/ar/com/KevinRios/vehiculos/presentacion/ventanas/ConfiguracionVentana.fxml", "Ventana de configuración");

    private String path;
    private String title;
    private Boolean isopen;

    public String getPath() {
        return path;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getIsopen() {
        return isopen;
    }

    public void setIsopen(Boolean isopen) {
        this.isopen = isopen;
    }

    
    private Ventanas(String path, String title) {
        this.path = path;
        this.title = title;
        isopen = false;
    }
    
    

}
