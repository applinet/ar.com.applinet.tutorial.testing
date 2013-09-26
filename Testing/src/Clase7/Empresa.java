/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase7;

import java.util.ArrayList;

/**
 *
 * @author educacionit
 */
public class Empresa {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Antonio", 19, "1919");
        Empleado emp2 = new Empleado("Sergio", 36, "3636");
        Empleado emp3 = new Empleado("Fernando", 35, "3535");
        Empleado emp4 = new Empleado("Francisco", 59, "5959");
        Empleado emp5 = new Empleado("Antonia", 19, "1919");
        Empleado emp6 = new Empleado("Antonella", 17, "1717");

        ArrayList losEmpleados = new ArrayList();
        losEmpleados.add(emp1);
        losEmpleados.add(emp2);
        losEmpleados.add(emp3);
        losEmpleados.add(emp4);
        losEmpleados.add(emp5);
        losEmpleados.add(emp6);

        informarDatosDeEmpleados(losEmpleados);
        System.out.println("La cant de empleados son:" + losEmpleados.size());
        System.out.println("------------------------------------------------");
        System.out.println("Los empleados menores a 30 son:");
        obtenerDatosDeEmpleadosMenosDe30(losEmpleados);
        System.out.println("-------------------FIN--------------------------");
    }

    public static void informarDatosDeEmpleados(ArrayList losEmpleados) {

        for (int i = 0; i < losEmpleados.size(); i++) {
            Empleado emp = (Empleado) losEmpleados.get(i);
            System.out.println(emp.getDatosConcatenados());
        }
    }

    public static void obtenerDatosDeEmpleadosMenosDe30(ArrayList losEmpleados) {
        for (int i = 0; i < losEmpleados.size(); i++) {
            Empleado emp = (Empleado) losEmpleados.get(i);
            if (emp.getNombre().equals("Fernando")){
                System.out.println("Soy Fernando");
            }
            if (emp.getEdad() > 30) {
                losEmpleados.remove(i);
            }
        }
        informarDatosDeEmpleados(losEmpleados);
    }
}
