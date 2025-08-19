package korona.bk.lesson5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person igorM = new Person("Игорь", "Малиновский", Specialization.QA);
        Person dimaM = new Person("Дмитрий", "Мышковец", Specialization.ORACLE);
        Person dimaM2 = new Person("Дмитрий", "Мышковец", Specialization.ORACLE);
        Person dimaT = new Person("Дмитрий", "Тимощенко", Specialization.JAVA);

        ArrayList<Person> membersBK = new ArrayList<>();
        membersBK.add(igorM);
        membersBK.add(dimaM);
        membersBK.add(dimaT);

        Team team = new Team("БК", membersBK);
        System.out.println(team);

        Person olegS = new Person("Олег", "Сейко", Specialization.JAVA);
        Person artemS = new Person("Артём", "Соколовский", Specialization.QA);
        Person igorG = new Person("Игорь", "Гембарук", Specialization.QA);

        ArrayList<Person> membersBD = new ArrayList<>();
        membersBD.add(olegS);
        membersBD.add(artemS);
        membersBD.add(igorG);

        Team team2 = new Team("БД", membersBK);
        System.out.println(team2);

      //  membersBK.remove(dimaM2);
        team.remove(dimaM2);//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println(team);
        membersBK.add(dimaM2);
        System.out.println(team);


        ArrayList<Person>  personJava = new ArrayList<>();

        personJava = team2.getBySpecialization(Specialization.JAVA);
        System.out.println(personJava);



    }

    public static void test (Team team){

    }
}