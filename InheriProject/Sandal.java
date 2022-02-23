public class Sandal extends Equipment
{
    public Sandal(){
        super("Sandals", "Sandal", 300, 0, 0, 0);
    }
    
    public Sandal(String name, String typeOfEquip, int cost,
    int ARs, int MaRs, int CDwn){
        super(name, typeOfEquip, cost, ARs, MaRs, CDwn);
    }
}
