class Employee {

    String name;
    int year;
    int salary;
    String address;

    Employee(String name, int year, int salary, String address) {
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.address = address;
    }

    void display() {
        System.out.println(name + "\t" + year + "\t" +
                           salary + "\t" + address);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Mereena", 1994, 50000,
                                    "Vashi");

        Employee e2 = new Employee("Anjes", 2000, 45000,
                                    "Thane");

        Employee e3 = new Employee("Saniya", 1999, 55000,
                                    "Ambernath");

        System.out.println("Name\tYear\tSalary\tAddress");

        e1.display();
        e2.display();
        e3.display();
    }
}