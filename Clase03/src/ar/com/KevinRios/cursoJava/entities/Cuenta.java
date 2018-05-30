package ar.com.KevinRios.cursoJava.entities;


public class Cuenta {

    private int nro;
    private String moneda;
    private float saldo;

 

    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
    }

    public void depositar(float monto) {
        saldo+=monto;
    }

    public void debitar(float monto) {
        if(monto<=saldo){
            saldo-=monto;
        }
        else{
            System.out.println("Saldo insuficiente");
        }            
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nro=" + nro + ", moneda=" + moneda + ", saldo=" + saldo + '}';
    }
    


}
