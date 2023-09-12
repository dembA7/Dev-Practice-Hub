/*
 * En java, se pueden crear múltiples constructores para una clase, con la condición
 * de que cada uno reciba un set distinto de parámetros. 
*/

package Constructors;

import java.util.Date;
import java.util.GregorianCalendar;

public class constructorOverload {
    public static void main(String[] args) {

        Employee[] listaEmployees = new Employee[4];
        listaEmployees[0] = new Employee("Alejandro Lopez", 50000, 2021, 5, 21);
        listaEmployees[1] = new Employee("Carlos Gonzalez", 25000, 2023, 11, 01);
        listaEmployees[2] = new Employee("Manuel Perez", 100000, 2015, 1, 15);
        listaEmployees[3] = new Employee("Antonio Fernandez");


        for (Employee e: listaEmployees){
            e.raiseSalary(5);
        }
        for (int i = 0; i < 4; i++){
            System.out.println();
            System.out.println("Nombre: " + listaEmployees[i].getName() + "\nSueldo: " + listaEmployees[i].getSalary() + "\nFecha Ingreso: " + listaEmployees[i].getEmployeeRegDate());
            System.out.println();
        }
    }

    // Constructor con paso de parametros
    static class Employee{
        public Employee(String name, int salary, int year, int month, int day){
            this.name = name;
            this.salary = salary;
            this.year = year;
            this.month = month;
            this.day = day;

            GregorianCalendar calendar = new GregorianCalendar(this.year, this.month - 1, this.day);
            this.employeeRegistration = calendar.getTime();

        }

        // Sobrecarga de constructores, únicamente recibe el nombre por parámetro.
        public Employee(String name){
            // Se llama recursivamente al primer constructor, se establecen valores default para el resto.
            this(name, 30000, 2000, 01, 01);
        }

        public String getName(){ return name; }
        public void setName(String newName){ newName = name; }

        public double getSalary(){ return salary; }
        public void setSalary(double newSalary){ newSalary = salary; }

        public Date getEmployeeRegDate(){ return employeeRegistration; }
        public void setEmployeeRegDate(Date newEmployeeRegDate){ newEmployeeRegDate = employeeRegistration; }

        public void raiseSalary(double percentage){
            double raise = (salary*percentage)/100;
            salary += raise;
        }


        private String name;
        private double salary;
        private int year, month, day;
        private Date employeeRegistration;
    }
}

