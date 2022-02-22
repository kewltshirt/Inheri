
/**
 * Abstract class Character - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Character
{
    private int HealthPoints;
    private int MagicDamage;
    private int PhysicalDamage;
    private int Armour;
    private int MagicResist;
    private int Mana;
    private int MoveSpeed;
    private int CastDown; 
    /* reduces the CD of abilities linearly 
     * affects the number of times a player can cast a spell
     * Reduced CD = Base CD of ability * (100/(100 + CD))
     * Implement "RCD = BCD * Cooldown" when you make ability cooldowns
     */
    private int LifeVamp; 
    /* steals life based on dmg
     * hp += dmg*lifevamp
     */
    
    
    /**
     * 
     * 
     * 
     */
    /*public int loseHP()
    {
        if(
            if(armour >= 0 ){
            hp -= physDmg * (100/(100+armour)); 
        }else if(armour < 0 
        
    }
        public void abilityOne(){}
        public void abilityTwo(){}
        public void abilityThree(){}
        public void abilityFour(){}
    */
}
