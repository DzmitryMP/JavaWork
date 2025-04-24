package korona.bk.lesson2;

public class Picture {
    private String image;
    private FigureInterface form;

    public Picture(String image, FigureInterface form) {
        this.image = image;
        this.form = form;
    }

    public void print(){
        System.out.println("image = " + image );
        form.print();
    }
}
