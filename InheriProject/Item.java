import java.util.ArrayList;
public class Item implements ItemInterface{
    int cost;
    String name;
    public Item(String newName, int gold){
        name = newName;
        cost = gold;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCost(){
        return cost;
    }
}
