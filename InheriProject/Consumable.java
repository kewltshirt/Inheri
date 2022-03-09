public abstract class Consumable extends Item
{
    String consumeType;
    public Consumable(String name, String typeOfConsume, int cost, String desc){
        super(name, cost, desc);
        consumeType = typeOfConsume;
    }
    public abstract int useHPotion();
    public abstract int useMPotion();
}
