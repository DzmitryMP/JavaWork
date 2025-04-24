package korona.bk.lesson4;

public class StartTransfer {


    //Дима пришел в касу и положил дениги на счет
    public static void main(String[] args) {










        Person payerPerson = new Person("Дима");
        Person payeePerson = new Person("Игорь");
        Ammaunt ammaunt = new Ammaunt();
        ammaunt.cur = "RUS";
        ammaunt.sum = 100000;

        System.out.println(payerPerson);
        System.out.println(payeePerson);
        payerPerson.recieveMoney(ammaunt);
        ammaunt.sum = 100;
        Transfer transfer = new Transfer();
        if (transfer.execute(payerPerson, payeePerson, ammaunt)) {

            System.out.println(payerPerson);
            System.out.println(payeePerson);
        } else {
            System.out.println("перевод не выполнени");
        }

        ammaunt.sum = 100000000;
        if (transfer.execute(payerPerson, payeePerson, ammaunt)) {

            System.out.println(payerPerson);
            System.out.println(payeePerson);
        } else {
            System.out.println("перевод не выполнени");
        }


    }
}
