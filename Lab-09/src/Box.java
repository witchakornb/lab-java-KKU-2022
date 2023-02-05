import java.util.ArrayList;

// 653380024-6 [Witchakorn Boonprakom] sec 02
public class Box {
    private ArrayList<Shape> shapes = new ArrayList<>();
    public Box() {
    }
    public double getTotalArea(){
        double sum = 0;
        for (var a:
             shapes) {
            sum += a.getArea();
        }
        return sum;
    }
    public double getTotalCircumference(){
        double sum = 0;
        for (var a:
                shapes) {
            sum += a.getCircumference();
        }
        return sum;
    }
    public void add(Shape shape){
        shapes.add(shape);
    }
}
