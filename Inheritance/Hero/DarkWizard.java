package src.OOP.Inheritance.Hero;

public class DarkWizard extends Wizard{
    public DarkWizard(String username, int level) {
        super(username, level);
    }
    @Override
    public String toString(){
        return "Type: DarkWizard"+ super.toString();
    }
}
