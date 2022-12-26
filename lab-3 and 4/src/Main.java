
public class Main {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(2, 3);
        System.out.println(myTriangle.area());
        Triangle dupTriangle = myTriangle;
        System.out.println(dupTriangle.area());

    }
}