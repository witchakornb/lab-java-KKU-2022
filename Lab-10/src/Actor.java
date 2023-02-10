//653380024-8 [Witchakorn Boonprakom] sec 2
import java.util.ArrayList;
import java.util.List;

public abstract class Actor {
    protected int heathPoint;
    protected String name;
    protected List<HitBehavior> hitBehaviors = new ArrayList<>();
    public Actor(){
        this.heathPoint = 0;
        this.name = "NoName";
    }
    public Actor(String name, int heathPoint) {
        this.heathPoint = heathPoint;
        this.name = name;
    }

    public int getHeathPoint() {
        return heathPoint;
    }

    public void setHeathPoint(int heathPoint) {
        this.heathPoint = heathPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int performHit(int IDX);
    public void addHitBehavior(String hit){
        HitBehavior obj = HitBehaviorFactory.createHitBehavior(hit);
        if (obj != null){
            this.hitBehaviors.add(obj);
        }
    }

}
class Human extends Actor{
    public Human() {
        super("", 50);
    }

    public Human(String name, int i) {
        super(name, i);
    }

    @Override
    public int performHit(int IDX) {
        return hitBehaviors.get(IDX).hit()+1;
    }
}
class Crocodile extends Actor{
    public Crocodile() {
        super("",100);
    }

    public Crocodile(String name, int heathPoint) {
        super(name, heathPoint);
    }

    @Override
    public int performHit(int IDX) {
        return hitBehaviors.get(IDX).hit()+5;
    }
}