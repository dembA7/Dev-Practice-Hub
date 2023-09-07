package POO;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeUse {
    public static void main(String[] args) {
        Employee Alejandro = new Employee("Alejandro Lopez", 50000, 2021, 5, 21);
        Employee Charlie = new Employee("Carlos Gonzalez", 25000, 2023, 11, 01);
        Employee Medu = new Employee("Manuel Perez", 100000, 2015, 01, 15);
        
        System.out.println();
        System.out.println("Nombre: " + Alejandro.getName());
        System.out.println("Salario: $" + Alejandro.getSalary());
        System.out.println("Fecha de registro: " + Alejandro.getEmployeeRegDate());
        Alejandro.raiseSalary(5);
        System.out.println("Nuevo salario: $" + Alejandro.getSalary());
        System.out.println();

        System.out.println("Nombre: " + Charlie.getName());
        System.out.println("Salario: $" + Charlie.getSalary());
        System.out.println("Fecha de registro: " + Charlie.getEmployeeRegDate());
        Charlie.raiseSalary(5);
        System.out.println("Nuevo salario: $" + Charlie.getSalary());
        System.out.println();

        System.out.println("Nombre: " + Medu.getName());
        System.out.println("Salario: $" + Medu.getSalary());
        System.out.println("Fecha de registro: " + Medu.getEmployeeRegDate());
        Medu.raiseSalary(5);
        System.out.println("Nuevo salario: $" + Medu.getSalary());
        System.out.println();
       
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
