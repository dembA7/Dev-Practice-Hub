package POO;
import java.util.Date;
import java.util.GregorianCalendar;

public class BetterEmployeeUse {
    public static void main(String[] args) {

        Employee[] listaEmployees = new Employee[3];
        listaEmployees[0] = new Employee("Alejandro Lopez", 50000, 2021, 5, 21);
        listaEmployees[1] = new Employee("Carlos Gonzalez", 25000, 2023, 11, 01);
        listaEmployees[2] = new Employee("Manuel Perez", 100000, 2015, 1, 15);

        for (int i = 0; i < 3; i++){
            listaEmployees[i].raiseSalary(5);
        }
        for (int i = 0; i < 3; i++){
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
