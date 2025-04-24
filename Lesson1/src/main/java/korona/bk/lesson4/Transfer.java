package korona.bk.lesson4;

public class Transfer {


    public boolean execute(Person payerPerson, Person payeePerson, Ammaunt ammaunt) {
        if (payerPerson.sendMoney(ammaunt) &&
                payeePerson.recieveMoney(ammaunt)) {
            return true;
        }
        return false;
    }

}
