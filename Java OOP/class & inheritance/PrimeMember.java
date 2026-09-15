import java.util.Scanner;

class Member {

    String name;
    int age;
    String phone;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class PrimeMember extends Member {

    int joiningYear;
    double joiningFees;
    boolean isActive;

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Joining Year: " + joiningYear);
        System.out.println("Joining Fees: " + joiningFees);
        System.out.println("Active: " + isActive);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrimeMember p = new PrimeMember();

        System.out.print("Enter name: ");
        p.name = sc.nextLine();

        System.out.print("Enter age: ");
        p.age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter phone: ");
        p.phone = sc.nextLine();

        System.out.print("Enter address: ");
        p.address = sc.nextLine();

        System.out.print("Enter salary: ");
        p.salary = sc.nextDouble();

        System.out.print("Enter joining year: ");
        p.joiningYear = sc.nextInt();

        System.out.print("Enter joining fees: ");
        p.joiningFees = sc.nextDouble();

        System.out.print("Is active? true/false: ");
        p.isActive = sc.nextBoolean();

        System.out.println("\n--- Member Details ---");

        p.display();
        p.printSalary();
    }
}