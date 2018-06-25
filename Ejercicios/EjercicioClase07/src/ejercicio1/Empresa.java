package ejercicio1;

import java.util.ArrayList;

public class Empresa {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("NOMBRE1", "11222333", 20);
        Empleado emp2 = new Empleado("NOMBRE2", "11444555", 10);
        Empleado emp3 = new Empleado("NOMBRE3", "11666777", 35);
        Empleado emp4 = new Empleado("NOMBRE4", "11888999", 45);
        Empleado emp5 = new Empleado("NOMBRE5", "78456123", 77);
        Empleado emp6 = new Empleado("NOMBRE6", "45789123", 44);

        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        listaEmpleados.add(emp1);
        listaEmpleados.add(emp2);
        listaEmpleados.add(emp3);
        listaEmpleados.add(emp4);
        listaEmpleados.add(emp5);
        listaEmpleados.add(emp6);

        informarDatosDeEmpleados(listaEmpleados);

        System.out.println("Hay: " + listaEmpleados.size() + " empleados.");

        obtenerDatosDeEmpleadosMenosDe30(listaEmpleados);

    }

    public static void obtenerDatosDeEmpleadosMenosDe30(ArrayList<Empleado> listaEmpleados) {
        for (Empleado lsEmp : listaEmpleados) {
            if (lsEmp.getEdad() > 30) {
                System.out.println(lsEmp);
            }
        }
    }

    public static void informarDatosDeEmpleados(ArrayList<Empleado> listaEmpleados) {
        for (Empleado lsEmp : listaEmpleados) {
            System.out.println(lsEmp);
        }
    }

}
