/*
 * Un método abstracto es un tipo especial de método que se declara sin proporcionar una implementación en la clase
 * en la que se declara. La implementación real del método se proporciona en una subclase concreta que herede de la
 * clase que contiene el método abstracto. Si la clase contiene un método abstracto, ésta debe ser declarada como
 * abstracta también.
 * 
 *   public abstract class ClaseAbstracta {
 *       public abstract double CalcularArea();
 *   } 
*/

package POO;

import java.util.Date;
import java.util.GregorianCalendar;

public class Abstracts {
    public static void main(String[] args) {
        Person[] list = new Person[2];
        list[0] = new Employee("Luis Gonzalez", 50000, 2017, 5, 15);
        list[0] = new Student("Arturo Diaz", "Ingeniería en Tecnologías Computacionales");
        
        for (Person p: list){
            System.out.println(p.getName() + ", " + p.getDescripcion());
        }
    }
}

abstract class Person {
    public Person(String name){
        this.name = name;
    }

    public String getName(){ return name; }
    public void setName(String newName){ name = newName; }
    
    // Los métodos abstractos se definen en las subclases.
    public abstract String getDescripcion();

    private String name;
}

class Employee extends Person {
    public Employee(String name, int salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;

        GregorianCalendar calendar = new GregorianCalendar(this.year, this.month - 1, this.day);
        this.employeeRegistration = calendar.getTime();
    }


    public double getSalary(){ return salary; }
    public void setSalary(double newSalary){ salary = newSalary; }

    public Date getEmployeeRegDate(){ return employeeRegistration; }
    public void setEmployeeRegDate(Date newEmployeeRegDate){ newEmployeeRegDate = employeeRegistration; }

    public void raiseSalary(double percentage){
        double raise = (salary*percentage)/100;
        salary += raise;
    }

    // Definición de un método abstracto.
    public String getDescripcion(){ return "Este empleado fue dado de alta en " + employeeRegistration + " y tiene un salario de " + salary; }


    private double salary;
    private int year, month, day;
    private Date employeeRegistration;
}

class Student extends Person {
    public Student(String name, String major){
        super(name);
        this.major = major;
    }
    public String getDescripcion(){ return "Este alumno estudia la carrera de: " + major; }

    private String major;
}