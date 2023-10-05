package MethodOverriding.AllMainExamples;

class Shape {
    double perimrter;
    double area;

    public Shape() {

    }

    public double getPerimeter() {
        return perimrter;
    }

    public double getArea() {
        return area;
    }

    public Shape(double perimrter, double area) {
        this.perimrter = perimrter;
        this.area = area;
        System.out.println(perimrter);
        System.out.println(area);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14159265359 * radius;
    }

    public double getArea() {
        return 3.14159265359 * radius * radius;
    }
}