//653380024-8 วิชชากร บุญประคม sec 2
public class Main {
    public static void main(String[] args) {
        Rectangle[] r = new Rectangle[3];
        r[0]= new Rectangle (3.5,2);
        r[1]= new Rectangle (1.5,4);
        r[2]= new Rectangle (2.5,5);
        double totalArea = totalRectangleArea(r);
        System.out.println("The total area of rectangle is " + totalArea);
        int[] a = {1,2,3};
        int[] b = {0,0,0};
        MyMath.copy(b,a);
        System.out.println(a);
        System.out.println(b);
        for(int i : b) {
            System.out.println(i);
        }
    }

    private static double totalRectangleArea(Rectangle[] r) {
        double sum = 0;
        for (int i=0;i<r.length;i++){
            sum += r[i].getArea();
        }
        return sum;
    }

}