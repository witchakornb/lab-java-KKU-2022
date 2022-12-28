//653380024-8 วิชชากร บุญประคม sec 2
public class Rectangle {
    private double h;
    private int w;
    public Rectangle(double h,int w){
        this.h = h;
        this.w = w;
    }
    public Rectangle(){
        this.h = 0;
        this.w = 0;
    }

    public double getArea() {
        return this.h*this.w;
    }
}
