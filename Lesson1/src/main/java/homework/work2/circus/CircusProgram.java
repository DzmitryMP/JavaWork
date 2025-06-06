package homework.work2.circus;

import homework.work2.CustomList;

public class CircusProgram {
    private final int programNumber;
    private final CustomList numbers;  // Список номеров (CircusNumber)

    public CircusProgram(int programNumber, CustomList numbers) {
        this.programNumber = programNumber;
        this.numbers = numbers;
    }

    public void run() {
        System.out.println("Запуск программы #" + programNumber + ":");

        for (int i = 0; i < numbers.getSize(); i++) {
            CircusNumber number = (CircusNumber) numbers.getObj(i);
            number.perform();
        }

        System.out.println("Завершаем программу #" + programNumber + ".");
    }
}
