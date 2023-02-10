//653380024-8 [Witchakorn Boonprakom] sec 2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HitBehavior my_hit = HitBehaviorFactory.createHitBehavior("hitbyTail");
        System.out.println("Hit By Tail:"+my_hit.hit());
        List<HitBehavior> hits = new ArrayList<>();
        hits.add(HitBehaviorFactory.createHitBehavior("hitbyarm"));
        hits.add(HitBehaviorFactory.createHitBehavior("hitbytail"));
        hits.add(HitBehaviorFactory.createHitBehavior("hitbyFire"));
        hits.add(HitBehaviorFactory.createHitBehavior("bite"));


        int idx=0;
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in)); // for taking a number as an input

        try {
            System.out.print("Enter your Index to hit:");
            idx=	Integer.parseInt(inp.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int index=idx;
        System.out.println(hits.get(index).hit());


        Scene  scene= new Scene();
        Human h= new Human("John",60);
        h.addHitBehavior("hitbyarm");

        Crocodile d= new Crocodile("Tony",90);
        d.addHitBehavior("hitbytail");
        d.addHitBehavior("bite");
        scene.addActor(h);
        scene.addActor(d);
        scene.showHealth();

        scene.actionByHit(0, "John", "Tony");
        System.out.println("After attrtaction:!!!!");
        scene.showHealth();
    }
}