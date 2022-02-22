import java.util.ArrayList;
public class Item implements ItemInterface{
    String name;
    public Item(String newName){
        name = newName;
    }
    
    public String getName(){
        return name;
    }
}
