public abstract class Assassin extends Weapon
{
    public Assassin(String name, String typeOfWeapon, int cost,
    int physAtk, int magAtk, int AtckSpd, int Criti, int CritiDmg,
    String desc){
        super(name, "Assassin", cost, physAtk,
        magAtk, AtckSpd, Criti, CritiDmg, desc);
    }
}
