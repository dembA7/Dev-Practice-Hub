/*
 * El casting en java es un procedimiento donde se transforma una variable o un objeto
 * de un tipo de dato a otro.
 * 
 * double num = 7.555;
 * int num2 = (int) num;
 * En este ejemplo, se transforma el tipo de dato de la variable num2 a entero.
*/

package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class Casting {
    public static void main(String[] args) {

        Boss Walter = new Boss("Walter White", 1000000, 2006, 9, 25);

        EmployeeClass[] employeeList = new EmployeeClass[4]; // Espera que se almacenen objetos de tipo EmployeeClass.
        employeeList[0] = new EmployeeClass("Carlos Gonzalez", 25000, 2023, 11, 01);
        employeeList[1] = new EmployeeClass("Manuel Perez", 12500, 2023, 05, 15);
        employeeList[2] = Walter; // Polimorfismo, principio de sustitución. Se almacena un objeto de tipo Boss, que es subclase de EmployeeClass.
        employeeList[3] = new Boss("María Gabriela", 96500, 2015, 7, 18); // Polimorfismo.

        // Casting del objeto Boss.

        Boss Maria = (Boss) employeeList[3];
        Maria.setIncentivo(5000);

        for (EmployeeClass e: employeeList){
            e.raiseSalary(5);
        }

        for (EmployeeClass e: employeeList){
            System.out.println( "\n" +
                "Nombre: " + e.getName() + "\n" +
                //Enlazado dinámico, se llama a la función getSalary() de la clase Boss cuando se encuentra un objeto de este tipo.
                "Sueldo: " + e.getSalary() + "\n" + 
                "Fecha de registro: " + e.getEmployeeRegDate() + "\n"
            );
        }

    }

    static class EmployeeClass{
        public EmployeeClass(String name, int salary, int year, int month, int day){
            this.name = name;
            this.salary = salary;
            this.year = year;
            this.month = month;
            this.day = day;

            GregorianCalendar calendar = new GregorianCalendar(this.year, this.month - 1, this.day);
            this.employeeRegistration = calendar.getTime();

        }

        public String getName(){ return name; }
        public void setName(String newName){ name = newName; }

        public double getSalary(){ return salary; }
        public void setSalary(double newSalary){ salary = newSalary; }

        public Date getEmployeeRegDate(){ return employeeRegistration; }
        public void setEmployeeRegDate(Date newEmployeeRegDate){ employeeRegistration = newEmployeeRegDate; }

        public void raiseSalary(double percentage){
            double raise = (salary * percentage) / 100;
            salary += raise;
        }


        private String name;
        private double salary;
        private int year, month, day;
        private Date employeeRegistration;
    }

    // La declaración final hace que no sea posible heredar más clases de la clase Boss.
    final static class Boss extends EmployeeClass {
        public Boss(String name, int salary, int year, int month, int day) {
            super(name, salary, year, month, day);
        }

        public void setIncentivo(int incentivo){ this.incentivo = incentivo; }
        public double getSalary(){ 
            double bossSalary = super.getSalary();
            return bossSalary + incentivo;
        }

        private double incentivo;
    }

}
