package korona.bk.lesson2;

public enum CustomMonths {
    ЯНВАРЬ(1, 31), ФЕВРАЛЬ(2);

    private final int number;
    private  int days;

    CustomMonths(int number) {
        this.number = number;
    }

    CustomMonths(int number, int days) {
        this.number = number;
        this.days = days;
    }

    public int getNumber() {
        return number;
    }
}
