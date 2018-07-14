
package ar.com.KevinRios.vehiculos.presentacion.controladores;

import ar.com.KevinRios.vehiculos.aplicacion.APPConcesionaria;


public abstract class ConcesionariaControlador {

    protected APPConcesionaria mainApp;

    public void setMainApp(APPConcesionaria runner) {
        this.mainApp = runner;
    }
}
