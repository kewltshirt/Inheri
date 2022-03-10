public class Potion extends Consumable
{
    int PotionAddHP;
    int PotionAddMP;
    public Potion(){
        super("Potion", "Potions", 50, 
        "A singular glass bottle with a blood-red colored liquid, it tastes... sweet.");
        PotionAddHP = 20;
        PotionAddMP = 0;
    }
    
    public Potion(String name, String typeOfConsume, int cost,
    int potionHP, int potionMP, String desc){
        super(name, typeOfConsume, cost, desc);
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
