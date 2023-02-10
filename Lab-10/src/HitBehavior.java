//653380024-8 [Witchakorn Boonprakom] sec 2
public interface HitBehavior {
    int hit();
}
class HitByArm implements HitBehavior{
    @Override
    public int hit() {
        return 1;
    }
}
class HitByTail implements HitBehavior{
    @Override
    public int hit() {
        return 2;
    }
}
class HitByFire implements HitBehavior{
    @Override
    public int hit() {
        return 3;
    }
}
class Bite implements HitBehavior{
    @Override
    public int hit() {
        return 1;
    }
}
class HitBehaviorFactory {
    public static HitBehavior createHitBehavior(String Type) {
        String tp = Type.toUpperCase();
        if (tp.equals("HITBYARM")){
            return new HitByArm();
        } else if (tp.equals("HITBYTAIL")) {
            return new HitByTail();
        } else if (tp.equals("HITBYFIRE")) {
            return new HitByFire();
        } else if (tp.equals("BITE")) {
            return new Bite();
        } else {
            return null;
        }
    }
}