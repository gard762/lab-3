package lab3.task3;

import java.util.Objects;

public class Human implements Comparable<Human>{
    private String firstName;
    private String lastName;
    private int age;

    public Human(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public int getAge(){ return age; }

    @Override
    public int compareTo(Human other){
        int ageComapre = Integer.compare(this.age, other.age);
        if(ageComapre != 0) return ageComapre;
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public boolean equals(Object other){
        if(other == null || getClass() != other.getClass())
            return false;
        Human human = (Human) other;
        return age == human.age &&
                Objects.equals(lastName, human.lastName) &&
                Objects.equals(firstName, human.firstName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString(){
        return String.format("%s %s (%d)", firstName, lastName, age);
    }
}