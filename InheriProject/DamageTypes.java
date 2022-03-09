public class DamageTypes
{
    /* This is to show different damages but for now they just combine
     * into Dmg when you attack
     */
    String damageType;
    String PhysDmg;
    String MagDmg;
    String TrueDmg;
    public DamageTypes(String AdDmg, String ApDmg, String TruDmg){
        PhysDmg = AdDmg;
        MagDmg = ApDmg;
        TrueDmg = TruDmg;
    }
}
