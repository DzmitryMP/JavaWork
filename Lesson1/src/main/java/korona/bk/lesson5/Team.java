package korona.bk.lesson5;

import java.util.ArrayList;
import java.util.Objects;

public class Team {
    private String name;
    private ArrayList<Person>  members;

    public Team(String name, ArrayList<Person> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return name;
    }


    public void remove (Person person) {
        members.remove(person);
    }

    public void add (Person person) {
        members.add(person);
    }

    public ArrayList<Person> getBySpecialization (Specialization specialization){

        ArrayList<Person> result = new ArrayList<>();

        for (Person member : members) {
            Specialization memberSpecialization = member.getSpecialization();
            if (memberSpecialization.equals(specialization)) {
                result.add(member);
            }
        }
        return result;
    }

    public ArrayList<Person> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(members, team.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, members);
    }
}
