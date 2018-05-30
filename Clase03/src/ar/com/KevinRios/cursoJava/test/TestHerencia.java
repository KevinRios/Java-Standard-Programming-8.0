package ar.com.KevinRios.cursoJava.test;

import ar.com.KevinRios.cursoJava.entities.ClienteMinorista;
import ar.com.KevinRios.cursoJava.entities.Cuenta;
import ar.com.KevinRios.cursoJava.entities.Direccion;
import ar.com.KevinRios.cursoJava.entities.Empleado;
import ar.com.KevinRios.cursoJava.entities.Persona;

public class TestHerencia {
    
    public static void main(String[] args) {
    
        System.out.println("-- Inicio Testeo de Direcciones --");
        
        System.out.println("-- Direccion 1 --");    
        Direccion dir1 = new  Direccion("lavalle", "648", "10", "A");
        System.out.println(dir1);
        
        System.out.println("-- Direccion 2 --");
        Direccion dir2 = new Direccion("rivadavia", "7100", "", "", "Moron");
        System.out.println(dir2);
        
        System.out.println("-- Fin Testeo de Direcciones --");
        /*
        System.out.println("-- Inicio Testeo de Personas --");

        System.out.println("-- Persona 1 --");
        Persona per1 = new Persona("Melina", "asd", dir1, 40);
        System.out.println(per1);
        per1.saludar();
        
        System.out.println("-- Persona 2 --");
        Persona per2 = new Persona("Marta", "qwer", new Direccion("lima", "222", "3", "d"),20 );
        System.out.println(per2);
        per2.saludar();
        
        Direccion dirPer2 = per2.getDireccion();
        System.out.println(per2);
        per2.saludar();    
        
        System.out.println("-- Fin Testeo de Personas --");
        */
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("-- Inicio Testeo de empleados --");
       
        Empleado emp1 = new Empleado(1, 30000, "kevin", "rios", dir2, 5);
        // los primeros dos atributos corresponden a empleado (legajo y sueldo) los demas a persona
        System.out.println(emp1);
        
        emp1.saludar();        
        System.out.println("-- Fin Testeo de empleados --");

        
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("-- Inicio Testeo de clientes --");
        
        ClienteMinorista cm1 = new ClienteMinorista(1, new Cuenta(20, "arg$"), "nombre", "apellido", new Direccion("florida", "669", "8", "6"), 50);
        cm1.getCuenta().depositar(5000);
        System.out.println(cm1);
        System.out.println(cm1.getCuenta());
        
        cm1.saludar();     
        System.out.println("-- Fin Testeo de clientes --");
        
        
        // pruebo polimorfismo
        
        // adentro de persona estoy metiendo un empleado y un cliente
        
        Persona p1 = new Empleado(10, 20000, "Sergio", "zxc", dir1, 38);
        Persona p2 = new ClienteMinorista(2, new Cuenta(5, "arg$"), "ana", "rios", dir2, 19);
           
        p1.saludar();
        p2.saludar();
        
        // al revés no se puede, ya que empleado no sabe si es un emplado, o un cliente mayorita, o una persona
        // tendria que castearlo para que el obj sepa que corresponde a empleado
        Empleado e1 =(Empleado) p1;
        Empleado e2 = (p1 instanceof Empleado)?(Empleado)p1:null;
        
    }
    
}
