public class Consumable extends Item
{
    String consumeType;
    public Consumable(String name, String typeOfConsume){
        super(name);
        consumeType = typeOfConsume;
    }
}
