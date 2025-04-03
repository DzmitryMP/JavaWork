package homework.work2;

import java.util.Arrays;

public class CustomList {
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

    public void add(Object obj) {
        if (size == arrObj.length) {
            arrObj = Arrays.copyOf(arrObj, arrObj.length + 1);
        }
        arrObj[size++] = obj;
    }

    public void addArr(Object[] objArr) {
        for (Object obj : objArr) {
            add(obj);
        }
    }

    public boolean del(int index) {

        if (index < 0 || index >= size) {
            return false;
        }

        // Сдвигаем все элементы после удаляемого на одну позицию влево
        for (int i = index; i < size - 1; i++) {
            arrObj[i] = arrObj[i + 1];
        }
        arrObj[size - 1] = null;
        size--;
        return true;
    }

    public boolean del(Object obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(arrObj[i])) {  // Сравниваем элементы
              return del(i);
            }
        }
        return false;
    }


    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(arrObj[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

}
