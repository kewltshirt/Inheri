public class Sandal extends Equipment
{
    public Sandal(){
        super("Sandals", "Sandal", 300, 0, 0, 0, "Wide and comfortable slip-on sandals.");
    }
    
    public Sandal(String name, String typeOfEquip, int cost,
    int ARs, int MaRs, int CDwn, String desc){
        super(name, typeOfEquip, cost, ARs, MaRs, CDwn, desc);
    }
}
