import java.util.Scanner;


class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println(salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        Officer officer = new Officer();
        officer.name = sc.nextLine();
        officer.age = sc.nextInt();
        sc.nextLine();
        officer.phoneNumber = sc.nextLine();
        officer.address = sc.nextLine();
        officer.salary = sc.nextDouble();
        sc.nextLine();
        officer.specialization = sc.nextLine();

        Manager manager = new Manager();
        manager.name = sc.nextLine();
        manager.age = sc.nextInt();
        sc.nextLine();
        manager.phoneNumber = sc.nextLine();
        manager.address = sc.nextLine();
        manager.salary = sc.nextDouble();
        sc.nextLine();
        manager.department = sc.nextLine();


        System.out.println("Officer:");
        System.out.println(officer.name);
        System.out.println(officer.age);
        System.out.println(officer.phoneNumber);
        System.out.println(officer.address);
        System.out.println(officer.salary);
        System.out.println(officer.specialization);

        System.out.println("Manager:");
        System.out.println(manager.name);
        System.out.println(manager.age);
        System.out.println(manager.phoneNumber);
        System.out.println(manager.address);
        System.out.println(manager.salary);
        System.out.println(manager.department);

        
    }
}

