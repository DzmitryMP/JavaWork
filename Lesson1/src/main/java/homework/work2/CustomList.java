package homework.work2;
import java.util.Arrays;

public class CustomList<T> { // <T> означает, что список может работать с любым типом
    private Object[] arrObj;
    private int size;

    public CustomList() {
        this.arrObj = new Object[10];
        this.size = 0;
    }

    public CustomList(int i) {

        this.arrObj = new Object[i];
        this.size = 0;
    }

    public void add(T obj) {
        if (size == arrObj.length) {
            arrObj = Arrays.copyOf(arrObj, arrObj.length *2); //
        }
        arrObj[size++] = obj;
    }

    public void addArr(T... objArr) {
        for (T obj : objArr) {
            add(obj);
        }
    }

    public void del(int index) {

        // Сдвигаем все элементы после удаляемого на одну позицию влево
        for (int i = index; i < size - 1; i++) {
            arrObj[i] = arrObj[i + 1];
        }
        arrObj[size - 1] = null;
        size--;

    }

    public void del(T obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(arrObj[i])) {  // Сравниваем элементы
                del(i);
            }
        }
    }


    public void print() {

        for (int i = 0; i < size; i++) {
           // result.append(items[i]);
            System.out.print(arrObj[i]);
            if (i < size - 1)  System.out.print(", ");;
        }
        System.out.println();
    }

}
