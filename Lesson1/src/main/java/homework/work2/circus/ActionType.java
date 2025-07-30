package homework.work2.circus;

public enum ActionType {
    WALK("идти"),
    RUN("бежать"),
    JUMP("прыгать"),
    CLAP("хлопать"),
    CATCH("ловить"),
    SPEAK("говорить"),
    JUGGLE("жонглировать"),
    WHISTLE("свистеть"),
    DANCE("танцевать"),
    GROWL("рычать"),
    FLY("летать"),
    SWIM("плавать"),
    BITE("кусать"),
    SCRATCH("царапать"),
    ROAR("реветь"),
    SLIDE("скользить");

    private final String description;

    ActionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}