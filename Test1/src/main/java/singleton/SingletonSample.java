package singleton;

public class SingletonSample {

    private static final SingletonSample SINGLETON_SAMPLE = new SingletonSample();
private String name;
    private SingletonSample() {
    }


    public void setName(String name){
        this.name += " " + name;

    }
    public static SingletonSample  CreateSingletonSample (){

        return SINGLETON_SAMPLE;
    }
}
