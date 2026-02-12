import java.util.Scanner;

class Employee {

    String name;
    int age;
    String phone;
    String address;
    double salary;

    void printDetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
        System.out.println(address);
        System.out.println(salary);
    }
}

class Officer extends Employee {
    String specialization;

    void printOfficer() {
        printDetails();
        System.out.println(specialization);
    }
}

class Manager extends Employee {
    String department;

    void printManager() {
        printDetails();
        System.out.println(department);
    }
}

public class EmployeeInheritance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Officer Input
        Officer officer = new Officer();

        officer.name = sc.nextLine();
        officer.age = sc.nextInt();
        sc.nextLine();

        officer.phone = sc.nextLine();
        officer.address = sc.nextLine();
        officer.salary = sc.nextDouble();
        sc.nextLine();

        officer.specialization = sc.nextLine();

        // Manager Input
        Manager manager = new Manager();

        manager.name = sc.nextLine();
        manager.age = sc.nextInt();
        sc.nextLine();

        manager.phone = sc.nextLine();
        manager.address = sc.nextLine();
        manager.salary = sc.nextDouble();
        sc.nextLine();

        manager.department = sc.nextLine();

        // Output
        System.out.println("Officer:");
        officer.printOfficer();

        System.out.println("Manager:");
        manager.printManager();

        sc.close();
    }
}
