import java.io.*;
import java.util.*;

public class EmployeeApp {

    // Employee class
    static class Employee implements Serializable {

        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        void display() {
            System.out.println("ID     : " + id);
            System.out.println("Name   : " + name);
            System.out.println("Salary : " + salary);
            System.out.println("----------------------");
        }
    }

    // Employee array
    static Employee[] employees = new Employee[100];
    static int count = 0;

    static String fileName = "employees.dat";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE APPLICATION =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Save Employees");
            System.out.println("4. Load Employees");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    employees[count] =
                            new Employee(id, name, salary);

                    count++;

                    System.out.println("Employee added.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employees found.");
                    } else {

                        for (int i = 0; i < count; i++) {
                            employees[i].display();
                        }
                    }
                    break;

                case 3:
                    saveEmployees();
                    break;

                case 4:
                    loadEmployees();
                    break;

                case 5:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }


    // SAVE
    static void saveEmployees() {

        try {

            ObjectOutputStream out =
                    new ObjectOutputStream(
                            new FileOutputStream(fileName));

            out.writeObject(employees);
            out.writeInt(count);

            out.close();

            System.out.println("Employees saved successfully.");

        } catch (IOException e) {

            System.out.println("Error while saving.");
        }
    }


    // LOAD
    static void loadEmployees() {

        try {

            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream(fileName));

            employees = (Employee[]) in.readObject();

            count = in.readInt();

            in.close();

            System.out.println("Employees loaded successfully.");

        } catch (FileNotFoundException e) {

            System.out.println("File not found. Save employees first.");

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Error while loading.");
        }
    }
}