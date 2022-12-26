// 653380024-8 วิชชากร บุญประคม sec 2
public class Triangle {
    private double height;
    private double base;

    public Triangle(){
        this.height = 0.0;
        this.base = 0.0;
    }
    public Triangle(double h,double b){
        this.height = h;
        this.base = b;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    public double area(){
        return 1.0/2.0*this.height * this.base;
    }

}
