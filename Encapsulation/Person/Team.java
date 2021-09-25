package src.OOP.Encapsulation.Person;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> secondTeam;

    public Team(String name) {
        this.setName(name);
        this.firstTeam=new ArrayList<>();
        this.secondTeam=new ArrayList<>();
    }
    public String getName(){
        return this.name;
    }
    private void setName(String name){
        this.name=name;
    }

    public List<Person> getFirstTeam(){
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getSecondTeam() {
        return Collections.unmodifiableList(this.secondTeam);
    }
}
