public abstract class Consumable extends Item
{
    String consumeType;
    public Consumable(String name, String typeOfConsume, int cost){
        super(name, cost);
        consumeType = typeOfConsume;
    }
    public abstract int useHPotion();
    public abstract int useMPotion();
}
