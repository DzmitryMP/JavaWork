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

    public int getSize() {
        return size;
    }

    public void add(Object obj) {

        if (obj != null) {
            if (size == arrObj.length) {
                arrObj = Arrays.copyOf(arrObj, arrObj.length + 1);
            }
            arrObj[size++] = obj;
        }
    }

    public void addArr(Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                add(obj);
            }
        }
    }

    public void addArr(CustomList objArr) {
        if (objArr != null) {
            for (int i = 0; i < objArr.size - 1; i++) {
                add(objArr.getObj(i));
            }
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
               boolean b = "тест".equals(obj);
               boolean b1 = obj.equals("тест");

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

    public Object getObj(int i) {
        return arrObj[i];

    }

    public boolean find(Object obj) {
        if (obj != null) {
            for (int i = 0; i < size; i++) {
                if (obj.equals(arrObj[i])) {  // Сравниваем элементы
                    return true;
                }
            }
        }
        return false;
    }


}
