public class Weapon extends Item
{
    String weaponType;
    public Weapon(String name, String typeOfWeapon){
        super(name);
        weaponType = typeOfWeapon;
    }
}
