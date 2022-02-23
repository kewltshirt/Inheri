public class Weapon extends Item
{
    String weaponType;
    int PAtk;
    int MAtk;
    int AtkSpd;
    int Crit;
    int CritDmg;
    
    public Weapon(String name, String typeOfWeapon, int cost,
    int physAtk, int magAtk, int AtckSpd, int Criti, int CritiDmg){
        super(name, cost);
        weaponType = typeOfWeapon;
        PAtk = physAtk;
        MAtk = magAtk;
        AtkSpd = AtckSpd;
        Crit = Criti;
        CritDmg = CritiDmg;
    }
    
}
