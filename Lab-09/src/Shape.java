// 653380024-6 [Witchakorn Boonprakom] sec 02
public class Shape {
    private int x_left;
    private int y_left;

    public Shape(){
        this(0,0);
    }
    public Shape(int x_left, int y_left) {
        this.x_left = x_left;
        this.y_left = y_left;
    }
    public double getCircumference(){
        return 0.0;
    }
    public double getArea(){
        return 0.0;
    }

    public int getX_left() {
        return x_left;
    }

    public void setX_left(int x_left) {
        this.x_left = x_left;
    }

    public int getY_left() {
        return y_left;
    }

    public void setY_left(int y_left) {
        this.y_left = y_left;
    }
}
class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int x_left, int y_left, double radius) {
        super(x_left, y_left);
        this.radius = radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x_left, int y_left, double width, double height) {
        super(x_left, y_left);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getCircumference() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
class Triangle extends Shape{
    private double base;
    private double height;
    private double c;

    public Triangle() {
        this(0.0,0.0,0.0);
    }

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
        this.c = Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
    }

    public Triangle(double base, double height, double c) {
        super();
        this.base = base;
        this.height = height;
        this.c = c;
    }

    public Triangle(int x_left, int y_left, double base, double height, double c) {
        super(x_left, y_left);
        this.base = base;
        this.height = height;
        this.c = c;
    }

    @Override
    public double getCircumference() {
        return base + height + c;
    }


    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}