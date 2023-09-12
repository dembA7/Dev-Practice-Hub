package POO;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    public static void main(String[] args) {
        EmployeeClass Charlie = new EmployeeClass("Carlos Gonzalez", 25000, 2023, 11, 01);
        Boss Medu = new Boss("Manuel Perez", 100000, 2015, 01, 15);

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
        Medu.setIncentivo(15000);
        System.out.println("Nuevo salario: $" + Medu.getSalary());
        System.out.println();
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

    static class Boss extends EmployeeClass {
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
