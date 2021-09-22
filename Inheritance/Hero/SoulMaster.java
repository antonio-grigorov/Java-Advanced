package src.OOP.Inheritance.Hero;

public class SoulMaster extends DarkWizard{
    public SoulMaster(String username, int level) {
        super(username, level);
    }
    @Override
    public String toString(){
        return "Type: SoulMaster"+ super.toString();
    }
}
