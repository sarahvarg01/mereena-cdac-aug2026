class Shape {

    void shape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {

    void rectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {

    void circle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {

    void square() {
        System.out.println("Square is a rectangle");
    }

    public static void main(String[] args) {

        Square s = new Square();

        s.shape();
        s.rectangle();
        s.square();

        Circle c = new Circle();

        c.shape();
        c.circle();
    }
}