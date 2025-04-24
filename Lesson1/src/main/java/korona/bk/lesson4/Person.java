package korona.bk.lesson4;

public class Person implements AccountInterface {
    private final String name;
    private Ammaunt ammaunt = new Ammaunt();


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean sendMoney(Ammaunt ammaunt) {
        if (this.ammaunt.cur == ammaunt.cur && this.ammaunt.sum >= ammaunt.sum) {
            this.ammaunt.sum = this.ammaunt.sum - ammaunt.sum;
            return true;
        }
        return false;
    }

    @Override
    public boolean recieveMoney(Ammaunt ammaunt) {
        if (this.ammaunt.cur == ammaunt.cur) {
            this.ammaunt.sum = this.ammaunt.sum + ammaunt.sum;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ammaunt=" + ammaunt +
                '}';
    }


}
