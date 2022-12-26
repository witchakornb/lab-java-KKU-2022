package PackageA;

public class A {
    public int x;
    protected  int y;
    public int z;
    int g;

    public A(){
        this.setX(0);
        this.y = 0;
        this.z = 0;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }

    public void setG(int g) {
        this.g = g;
    }
}
