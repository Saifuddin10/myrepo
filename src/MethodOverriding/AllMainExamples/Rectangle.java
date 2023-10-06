package MethodOverriding.AllMainExamples;

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        super(width, height);
        this.width = width;
        this.height = height;
    }

    public double getPeremeter() {
        return 2 * (width + height);
    }

    public double getarea() {
        return width * height;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(8.0);
        System.out.println("Radious of circle :" + circle.radius);
        System.out.println("Circel perimeter is :" + circle.getPerimeter());
        System.out.println("Circle Area is :" + circle.getArea());

    }
}
