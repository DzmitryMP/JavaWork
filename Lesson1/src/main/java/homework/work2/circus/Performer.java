package homework.work2.circus;

import homework.work2.CustomList;

public abstract class Performer {
    protected String name;
    protected CustomList possibleActions = new CustomList();

    public Performer(String name, ActionType[] actions) {
        this.name = name;
        for (ActionType action : actions) {
            possibleActions.add(action);
        }
    }

    public String getName() {
        return name;
    }


    public String performAction(ActionType action) {
        if (possibleActions.getSize() == 0) {
            return name + " ничего не делает";
        }

        if (possibleActions.find(action)) {
            return name + " " + action.getDescription();
        }
        return name + " нет такого действия";
    }

    public String performRandomAction() {
        if (possibleActions.getSize() == 0) {
            return name + " ничего не делает";
        }
        int randomIndex = (int) (Math.random() * possibleActions.getSize());
        ActionType action = (ActionType) possibleActions.getObj(randomIndex);
        return name + " " + action.getDescription();
    }
}