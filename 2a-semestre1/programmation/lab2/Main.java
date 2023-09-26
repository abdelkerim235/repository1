// Abstract class
abstract class Employee {
    protected String name;
    protected String role;
    protected double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    // Abstract method
    public abstract void work();

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + salary);
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for role
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Inherited class 1
class Administrator extends Employee {
    private String department;

    public Administrator(String name, String role, double salary, String department) {
        super(name, role, salary);
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println("Administrator is managing the department.");
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

// Inherited class 2
class Programmer extends Employee {
    private String programmingLanguage;

    public Programmer(String name, String role, double salary, String programmingLanguage) {
        super(name, role, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println("Programmer is coding in " + programmingLanguage);
    }

    // Getter and Setter for programmingLanguage
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}

// Inherited class 3
class Manager extends Employee {
    private String departmentManaged;

    public Manager(String name, String role, double salary, String departmentManaged) {
        super(name, role, salary);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void work() {
        System.out.println("Manager is managing the " + departmentManaged + " department.");
    }

    // Getter and Setter for departmentManaged
    public String getDepartmentManaged() {
        return departmentManaged;
    }

    public void setDepartmentManaged(String departmentManaged) {
        this.departmentManaged = departmentManaged;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Administrator, Programmer, and Manager
        Administrator admin = new Administrator("Alice", "Administrator", 60000, "HR");
        Programmer programmer = new Programmer("Bob", "Programmer", 70000, "Java");
        Manager manager = new Manager("Chris", "Manager", 80000, "Engineering");

        // Display information about the employees
        admin.displayInfo();
        admin.work();
        System.out.println("Department: " + admin.getDepartment());

        programmer.displayInfo();
        programmer.work();
        System.out.println("Programming Language: " + programmer.getProgrammingLanguage());

        manager.displayInfo();
        manager.work();
        System.out.println("Department Managed: " + manager.getDepartmentManaged());

        // Demonstrate specific actions
        admin.work();
        programmer.work();
        manager.work();
    }
}
