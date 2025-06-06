package homework.work2.circus;

import homework.work2.CustomList;

public class CircusNumber {
    private final Human human;
    private CustomList animals;
    private ActionType humanAction;
    private CustomList animalsAction;

    public CircusNumber(Human human) {
        this.human = human;
    }

    public CircusNumber(Human human, CustomList animals) {
        this.human = human;
        this.animals = animals;
    }

    public CircusNumber(Human human, ActionType humanAction, CustomList animals, CustomList animalsAction) {
        this.human = human;
        this.animals = animals;
        this.humanAction = humanAction;
        this.animalsAction = animalsAction;
    }

    public void perform() {
        System.out.println("Номер с " + human.getName() + ":");
        if (humanAction == null) {
            System.out.print(human.performRandomAction());
        } else {
            System.out.print(human.performAction(humanAction));
        }
        if (animals != null) {
            for (int i = 0; i < animals.getSize(); i++) {
                Animal animal = (Animal) animals.getObj(i);
                if (animalsAction == null) {
                    System.out.print(" -> " + animal.performRandomAction());
                } else {
                    ActionType animalType = (ActionType) animalsAction.getObj(i);
                    if (animalType == null) {
                        System.out.print(" -> " + animal.performRandomAction());
                    } else {
                        System.out.print(" -> " + animal.performAction(animalType));
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}