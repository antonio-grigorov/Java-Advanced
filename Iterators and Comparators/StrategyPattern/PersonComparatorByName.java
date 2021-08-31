package src.Iterators.StrategyPattern;

import java.util.Comparator;

public class PersonComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        int result = first.getName().length()
                - second.getName().length();
        if (result == 0) {
            result = Character.toLowerCase(first.getName().charAt(0))
                    - Character.toLowerCase(second.getName().charAt(0));
        }
        return result;
    }
    }

