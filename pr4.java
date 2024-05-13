import java.util.*;                                                                                                                   

 class Figure {
    int l, b;

    Figure(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area(){};
}

class Rectangle extends Figure {
    Rectangle(int l, int b) {
        super(l, b);
    }

    void area() {
        System.out.println("Area of Rectangle: " + l * b);
    }
}

class Triangle extends Figure {
    Triangle(int l, int b) {
        super(l, b);
    }

    void area() {
        System.out.println("Area of Triangle: " + 0.5 * l * b);
    }
}

class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth for Rectangle:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        System.out.println("Enter base and height for Triangle:");
        int base = sc.nextInt();
        int height = sc.nextInt();

        Figure r = new Rectangle(length, breadth);
        Figure s = new Triangle(base, height);

        r.area();
        s.area();

    
    }
}
