package src.OOP.Inheritance.Hero;

public class Wizard extends Hero{
    public Wizard(String username, int level) {
        super(username, level);
    }
    @Override
    public String toString(){
        return "Type: Wizard"+ super.toString();
    }
}
