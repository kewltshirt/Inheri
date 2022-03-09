import java.util.ArrayList;
public class Item implements ItemInterface{
    int cost;
    String name;
    String description;
    public Item(String newName, int gold, String desc){
        name = newName;
        cost = gold;
        description = desc;
        System.out.println(description);
    }
    
    public String getName(){
        return name;
    }
    
    public int getCost(){
        return cost;
    }
}
