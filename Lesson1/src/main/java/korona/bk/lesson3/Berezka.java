package korona.bk.lesson3;

public class Berezka extends Tree{
    public String getType() {
        return type;
    }

    private String type = "Berezka";


    public Berezka() {

    }
    public Berezka(String type) {
        this.type = type;
    }

    public Berezka(int age, String name, double height, String type) {
        super(age, name, height);
        this.type = type;
    }
}
