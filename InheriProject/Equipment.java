import java.lang.Math;
public class Equipment extends Item implements DefenseCommands
{
    String equipType;
    int MoveSpd;
    int PhysRes;
    int MagRes;
    int CDown;
    public Equipment(String name, String typeOfEquip, int cost,
    int ARs, int MaRs, int CDwn, String desc){
        super(name, cost, desc);
        equipType = typeOfEquip;
        PhysRes = ARs;
        MagRes = MaRs;
        CDown = CDwn;
    }

    public boolean blocked(Character carat){
        int rand = (int)(Math.random() * 101);
        for (int i = 0; i < carat.getBlockChance(); i++){
            if(rand == i){
                return true;
            }
        }
        return false;
    }
}
