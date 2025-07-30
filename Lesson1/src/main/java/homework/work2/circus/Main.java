package homework.work2.circus;

import homework.work2.CustomList;

public class Main {
    public static void main(String[] args) {
        //Создаем участников
        Human clown = new Human("Клоун", new ActionType[]{
                ActionType.WALK,
                ActionType.JUGGLE,
                ActionType.DANCE
        });

        Human trainer = new Human("Дрессировщик", new ActionType[]{
                ActionType.SPEAK,
                ActionType.WHISTLE
        });

        Animal lion = new Animal("Лев", new ActionType[]{
                ActionType.RUN,
                ActionType.GROWL,
                ActionType.ROAR
        });

        Animal parrot = new Animal("Попугай", new ActionType[]{
                ActionType.FLY,
                ActionType.SPEAK
        });

        // Формируем номера
        CustomList clownAnimals = new CustomList();
        clownAnimals.add(parrot);
        CustomList animalsAction = new CustomList();
        animalsAction.add(ActionType.SPEAK);
        clownAnimals.add(lion);
        animalsAction.add(ActionType.GROWL);

        CustomList trainerAnimals = new CustomList();
        trainerAnimals.add(lion);

        CircusNumber number1 = new CircusNumber(clown, clownAnimals);
        CircusNumber number2 = new CircusNumber(trainer, trainerAnimals);
        CircusNumber number3 = new CircusNumber(clown);
        CircusNumber number4 = new CircusNumber(clown, ActionType.DANCE, clownAnimals, animalsAction);


        //Создаем программу и добавляем номера
        CustomList programNumbers = new CustomList();
        programNumbers.add(number1);
        programNumbers.add(number2);
        programNumbers.add(number3);
        programNumbers.add(number4);

        CircusProgram program = new CircusProgram(1, programNumbers);

        //Запускаем программу
        program.run();
    }
}
