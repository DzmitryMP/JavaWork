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

    public void sort(char[][] charMas) {

        int rows = charMas.length;
        int cols = charMas[0].length;
        int totalElements = rows * cols;

        for (int i = 0; i < totalElements - 1; i++) {
            for (int j = 0; j < totalElements - 1 - i; j++) {
                int currentRow = j / cols;
                int currentCol = j % cols;
                int nextRow = (j + 1) / cols;
                int nextCol = (j + 1) % cols;

                if (charMas[currentRow][currentCol] > charMas[nextRow][nextCol]) {
                    char temp = charMas[currentRow][currentCol];
                    charMas[currentRow][currentCol] = charMas[nextRow][nextCol];
                    charMas[nextRow][nextCol] = temp;
                }
            }
        }
        System.out.println("Вывод масивва");
        for (char[] row : charMas) {
            for (char value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


}
