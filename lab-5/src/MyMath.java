//653380024-8 วิชชากร บุญประคม sec 2
public class MyMath {
    public static int sum(int[] data){
        int s = 0;
        for (int e : data){
            s += e;
        }
        return s;
    }
    public static double[] returnArrayExample(){
        double[] x = new double[3];
        x[0] = 2.3;
        x[1] = 3.4;
        x[2] = 4.5;
        return (x);
    }
    public static void copy(int[] dest, int[] source) {
        System.arraycopy(source, 0, dest, 0, source.length);
    }

}
