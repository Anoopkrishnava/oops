import java.util.Scanner;

// Base class
class Person {
    String name;
    String gender;
    String address;
    int age;

    // Constructor
    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Derived class from Person
class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

    // Constructor
    Employee(String name, String gender, String address, int age,
             int empId, String companyName, String qualification, double salary) {

        super(name, gender, address, age);  // Calling Person constructor
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Derived class from Employee
class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    // Constructor
    Teacher(String name, String gender, String address, int age,
            int empId, String companyName, String qualification, double salary,
            String subject, String department, int teacherId) {

        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    // Method to display details
    void display() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
    }
}

// Main class
public class MultilevelInheritanceExample{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        Teacher[] teachers = new Teacher[n];  // Array of objects

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Company Name: ");
            String companyName = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Teacher ID: ");
            int teacherId = sc.nextInt();
            sc.nextLine();

            teachers[i] = new Teacher(name, gender, address, age,
                    empId, companyName, qualification, salary,
                    subject, department, teacherId);
        }

        // Displaying details
        System.out.println("\n===== Teacher Information =====");
        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}