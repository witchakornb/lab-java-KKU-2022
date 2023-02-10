//653380024-8 [Witchakorn Boonprakom] sec 2
import java.util.ArrayList;
import java.util.List;

public class Scene {
    List<Actor> actors = new ArrayList<>();
    public Scene(){

    }
    public Actor findByName(String name){
        for (var obj:
             actors) {
            if (obj.name.equals(name)){
                return obj;
            }
        }
        return null;
    }
    public void actionByHit(int index,String name1,String name2){
        Actor source = findByName(name1);
        Actor opponent = findByName(name2);
        int hitScore = source.performHit(index);

        source.setHeathPoint(source.getHeathPoint()+hitScore);
        opponent.setHeathPoint(opponent.getHeathPoint()-hitScore);
    }
    public void showHealth(){
        for (var obj:
             actors) {
            System.out.println("Name : "+obj.getName());
            System.out.println("Type : "+obj.getClass().getName());
            System.out.println("Health Point : "+obj.heathPoint);
        }
        
    }
    public void showHealthByOne(int index) {
        System.out.println("\nShowHealthByOne");
        System.out.println("Name : "+actors.get(index).getName());
        System.out.println("Type : "+actors.get(index).getClass().getName());
        System.out.println("HeathPoint : "+actors.get(index).getHeathPoint());
    }
    public void addActor(Actor obj) {
        actors.add(obj);
    }
}
