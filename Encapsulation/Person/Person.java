package src.OOP.Encapsulation.Person;

public class Person {

    private String firstName;
    private String lastname;
    private int age;
    private double salary;

    public Person(String firstName, String lastname, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastname(lastname);
        this.setAge(age);
        this.setSalary(salary);
    }

    public void increaseSalary(double bonusPercentage) {
        double baseBonus = (this.getSalary() * bonusPercentage / 100);
        if (this.age < 30) {
            this.setSalary(this.getSalary() + baseBonus / 2);
        } else {
            this.setSalary(this.getSalary() + baseBonus);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)  {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        if (lastname.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }


        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                this.firstName, this.lastname,
                this.salary);
    }

}
