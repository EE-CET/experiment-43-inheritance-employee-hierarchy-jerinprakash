import java.util.Scanner;

class Employee {

    String name;
    int age;
    String phone;
    String address;
    double salary;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;

    void printOfficer() {
        printDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Employee {
    String department;

    void printManager() {
        printDetails();
        System.out.println("Department: " + department);
    }
}

public class EmployeeInheritance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Officer officer = new Officer();

        officer.name = sc.nextLine();
        officer.age = sc.nextInt();
        sc.nextLine();

        officer.phone = sc.nextLine();
        officer.address = sc.nextLine();
        officer.salary = sc.nextDouble();
        sc.nextLine();

        officer.specialization = sc.nextLine();

        Manager manager = new Manager();

        manager.name = sc.nextLine();
        manager.age = sc.nextInt();
        sc.nextLine();

        manager.phone = sc.nextLine();
        manager.address = sc.nextLine();
        manager.salary = sc.nextDouble();
        sc.nextLine();

        manager.department = sc.nextLine();
        System.out.println("Officer:");
        officer.printOfficer();

        System.out.println("Manager:");
        manager.printManager();

        sc.close();
    }
}
