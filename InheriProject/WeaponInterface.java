
/**
 * Methods for all weapons
 * 
 * @author Wiebe 
 * @version 1.2
 * 
 * @modified by Mitch so new version kinda? Was allowed to remove parry
 * as my concept does not involve the ability to parry
 */
public interface WeaponInterface
{
    /**
     * Attacks an enemy for an amount
     * 
     * 
     * @return      
     * Returns amount of damage successfully done to the opponent 
     */
    int attack(int physAtk, int magAtk, Character carat);
}
