package src.OOP.Inheritance.Hero;

public class Hero {
    private String username;
    private int level;

    public Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }

    @Override
    public String toString(){
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.username,
                this.level);

    }
}
