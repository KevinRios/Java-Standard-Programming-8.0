package ar.com.KevinRios.cursoJava.test;

import ar.com.KevinRios.cursoJava.entities.ClienteEmpresa;
import ar.com.KevinRios.cursoJava.entities.Cuenta;
import ar.com.KevinRios.cursoJava.entities.Cliente;


import java.util.List;

public class TestRelaciones {

    public static void main(String[] args) {
        System.out.println("-- cuenta1--");
        Cuenta cuenta1 = new Cuenta(1, "arg$");
        cuenta1.depositar(35000);
        cuenta1.depositar(40000);
        cuenta1.debitar(10000);
        
        System.out.println(cuenta1);
        
        System.out.println("--Cliente 1--");
        Cliente cliente1= new Cliente(1, "Juan", "qwerty", 2);
        
        
        // otra opcion
        //1º se obtiene la cuenta del cliente y se lo manda a un objeto de tipo cuenta
        //Cuenta cuentaCliente1 = cliente1.getCuenta();
        // se hace el deposito en el objeto cuenta del cliente 1 
        //cuentaCliente1.depositar(10000);
        
        cliente1.getCuenta().depositar(25000);        
        cliente1.getCuenta().debitar(10000);
        
        System.out.println(cliente1);
        System.out.println(cliente1.getCuenta());
        
        
        System.out.println("-- Cliente Empresa 1 -- ");
        ClienteEmpresa clienteEmpresa1 = new ClienteEmpresa(1, "empresa srl", "lavale 628");
        
        
        List<Cuenta> cuentas = clienteEmpresa1.getCuentas();
        cuentas.add(new Cuenta(10, "arg$"));     // indice 0
        cuentas.add(new Cuenta(11, "reales"));   // indice 1
        cuentas.add(new Cuenta(12, "u$s"));      // indice 2
        
        
        // se apunta a la primer cuenta, es decir la que tiene indice 0, que es la cuenta nro 10
        cuentas.get(0).depositar(40000);
        cuentas.get(0).depositar(30000);
        cuentas.get(0).debitar(10000);
        
        cuentas.get(1).depositar(24000);
        cuentas.get(1).debitar(10000);
    
        cuentas.get(2).depositar(12000);
        
        
        System.out.println(clienteEmpresa1);
        for (Cuenta cue : cuentas) {
            System.out.println(cue);
        }
        
    }
    
    
    
}
