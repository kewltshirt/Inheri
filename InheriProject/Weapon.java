import java.util.ArrayList;
public class Weapon extends Item implements WeaponInterface
{
    String weaponType;
    int PAtk;
    int MAtk;
    int AtkSpd;
    int Crit;
    int CritDmg;
    int dmg = 0;
    public Weapon(String name, String typeOfWeapon, int cost,
    int physAtk, int magAtk, int AtckSpd, int Criti, int CritiDmg,
    String desc){
        super(name, cost, desc);
        weaponType = typeOfWeapon;
        PAtk = physAtk;
        MAtk = magAtk;
        AtkSpd = AtckSpd;
        Crit = Criti;
        CritDmg = CritiDmg;
    }
    public int attack(int physAtk, int magAtk, Character carat){
        if(carat.getPhyRes() >= 0 && carat.getMagRes() >= 0){
            dmg = ((PAtk * (100/(100 + carat.getPhyRes()))) + 
            (MAtk * (100/(100 + carat.getMagRes()))));
        }
        /*implement into the method above or create a new if method
         * for if the physRes and/or MagRes are negative due to 
         * lethality/magic pen which increases dmg
         */
        return dmg;
    }
    public int damageBlocked(boolean blocked){
        if (blocked == true){
           dmg /= 2;
        }
        return dmg;
    }
}
