// 653380024-6 [Witchakorn Boonprakom] sec 02
public class Main {
    public static void main(String[] args) {
        var box = new Box();
        box.add(new Circle(2.5));
        box.add(new Rectangle(3.0,4.0));
        double totalArea = box.getTotalArea();
        double totalCircus = box.getTotalCircumference();
        System.out.println(totalArea);
        System.out.println(totalCircus);
        box.add(new Triangle(3.0,4.0,5.0));
        double totalArea2 = box.getTotalArea();
        double totalCircus2 = box.getTotalCircumference();
        System.out.println();
        System.out.println(totalArea2);
        System.out.println(totalCircus2);
    }
}