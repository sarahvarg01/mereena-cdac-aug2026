import java.util.Scanner;

class Complex {

    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void sum(Complex c) {
        System.out.println("Sum = " +
                (real + c.real) + " + " +
                (imaginary + c.imaginary) + "i");
    }

    void difference(Complex c) {
        System.out.println("Difference = " +
                (real - c.real) + " + " +
                (imaginary - c.imaginary) + "i");
    }

    void product(Complex c) {

        double r = (real * c.real) - (imaginary * c.imaginary);
        double i = (real * c.imaginary) + (imaginary * c.real);

        System.out.println("Product = " + r + " + " + i + "i");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first number: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter imaginary part of first number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second number: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter imaginary part of second number: ");
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);
    }
}