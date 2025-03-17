package korona.bk.lesson1;

public class Sort {
    public void sort(int[] intMas) {

        for (int i = 0; i < intMas.length - 1; i++) {
            for (int j = 0; j < intMas.length - i - 1; j++) {
                if (intMas[j + 1] < intMas[j]) {
                    int swap = intMas[j];
                    intMas[j] = intMas[j + 1];
                    intMas[j + 1] = swap;
                }
            }
        }
        System.out.println("Вывод масивва");
        for (int i = 0; i < intMas.length; i++) {
            System.out.println(intMas[i]);
        }
    }

}
