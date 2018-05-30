package ar.com.KevinRios.cursoJava.entities;

public class Direccion {
    
    private String calle;
    private String numero;
    private String piso;
    private String dpto;
    private String ciudad;

    public Direccion(String calle, String numero, String piso, String dpto, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.dpto = dpto;
        this.ciudad = ciudad;
    }
    /**
     * Constructor para direcciones de la ciudad autonoma de buenos aires
     */
    public Direccion(String calle, String numero, String piso, String dpto) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.dpto = dpto;
        this.ciudad= "CABA";
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", piso=" + piso + ", dpto=" + dpto + ", ciudad=" + ciudad + '}';
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    public String getPiso() {
        return piso;
    }

    public String getDpto() {
        return dpto;
    }

    public String getCiudad() {
        return ciudad;
    }
            
    
    
    
}
