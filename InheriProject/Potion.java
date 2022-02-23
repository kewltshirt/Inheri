public class Potion extends Consumable
{
    int PotionAddHP;
    int PotionAddMP;
    public Potion(){
        super("Potion", "Potions", 50);
        PotionAddHP = 20;
        PotionAddMP = 0;
    }
    
    public Potion(String name, String typeOfConsume, int cost,
    int potionHP, int potionMP){
        super(name, typeOfConsume, cost);
        PotionAddHP = potionHP;
        PotionAddMP = potionMP;
    }
    
    public int useHPotion(){
        return PotionAddHP;
    }
    
    public int useMPotion(){
        return PotionAddMP;
    }
}
