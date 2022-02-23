public class Equipment extends Item
{
    String equipType;
    int MoveSpd;
    int PhysRes;
    int MagRes;
    int CDown;
    public Equipment(String name, String typeOfEquip, int cost,
    int ARs, int MaRs, int CDwn){
        super(name, cost);
        equipType = typeOfEquip;
        PhysRes = ARs;
        MagRes = MaRs;
        CDown = CDwn;
    }
}
