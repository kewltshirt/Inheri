/**
 * Abstract class Character - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Character
{
    private int HealthPoints;
    private int MagicDamage;
    private int PhysicalDamage;
    private int PhysicalResist;
    private int MagicResist;
    private int Mana;
    private int MoveSpeed;
    private int SkillHaste; 
    private int CriticalChance;
    private int CriticalDamage;
    private int LifeVamp;
    private int BlockChance;
    /* reduces the CD of abilities linearly 
     * affects the number of times a player can cast a spell
     * Reduced CD = Base CD of ability * (100/(100 + CD))
     * Implement "RCD = BCD * Cooldown" when you make ability cooldowns
     */
    /* steals life based on dmg
     * hp += dmg*lifevamp
     */
    public Character(int hp, int mp, int mgDmg, int phDmg, int pyRes,
    int miRes, int moSpd, int skHaste, int critChance, int critDamage,
    int blkChance, int lfVamp){
        HealthPoints = hp;
        Mana = mp;
        MagicDamage = mgDmg;
        PhysicalDamage = phDmg;
        PhysicalResist = pyRes;
        MagicResist = miRes;
        MoveSpeed = moSpd;
        SkillHaste = skHaste; 
        CriticalChance = critChance;
        CriticalDamage = critDamage;
        BlockChance = blkChance;
    }
    public int getHP(){
        return HealthPoints; 
    }
    public int getMP(){
        return Mana; 
    }
    public int getPhyRes(){
        return PhysicalResist;
    }
    public int getMagRes(){
        return MagicResist;
    }
    public int getPhyDmg(){
        return PhysicalDamage;
    }
    public int getMagDmg(){
        return MagicDamage;
    }
    public int getMoveSpeed(){
        return MoveSpeed;
    }
    public int getSkillHaste(){
        return SkillHaste;
    }
    public int getCritDmg(){
        return CriticalDamage;
    }
    public int getCritChance(){
        return CriticalChance;
    }
    public int getBlockChance(){
        return BlockChance;
    }
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
    public void usePotion(Potion pot){
        HealthPoints += pot.useHPotion();
        Mana += pot.useMPotion();
    }
}
