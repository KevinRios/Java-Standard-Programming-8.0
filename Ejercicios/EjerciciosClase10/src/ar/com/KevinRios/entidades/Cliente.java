package ar.com.KevinRios.entidades;

import java.util.ArrayList;

public class Cliente extends Persona {

    // Atributos
    private ArrayList hijos;
    private boolean formaPagoDebito;
    private boolean formaPagoCredito;
    private boolean formaPagoTransferencia;

    public Cliente() {
    }

    public ArrayList getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList hijos) {
        this.hijos = hijos;
    }

    public boolean isFormaPagoDebito() {
        return formaPagoDebito;
    }

    public void setFormaPagoDebito(boolean formaPagoDebito) {
        this.formaPagoDebito = formaPagoDebito;
    }

    public boolean isFormaPagoCredito() {
        return formaPagoCredito;
    }

    public void setFormaPagoCredito(boolean formaPagoCredito) {
        this.formaPagoCredito = formaPagoCredito;
    }

    public boolean isFormaPagoTransferencia() {
        return formaPagoTransferencia;
    }

    public void setFormaPagoTransferencia(boolean formaPagoTransferencia) {
        this.formaPagoTransferencia = formaPagoTransferencia;
    }


    
    
}
