import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 5;
    private int size;
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    //добавляет элемент в конец
    void add(T value) {
        if (elements.length == size) {
            increaseCapacity();
        }
        elements[size++] = value;
    }
    private void increaseCapacity() {
        elements = Arrays.copyOf(elements, elements.length + 5);
    }

    //удаляет элемент под индексом
    void remove(int index) {
        if (index > size - 1 && size < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            elements[index] = null;
            size--;
        }
    }

    //очищает коллекцию
    void clear() {
        elements = new String[]{""};
        size = 0;
    }

    //возвращает размер коллекции
    void size() {
        System.out.println(size);
    }

    //возвращает элемент под индексом
    void get(int index) {
        if (index > size - 1 && size < 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            System.out.println((String) elements[index]);
        }
    }

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder("[");
        for (Object element : elements) {
            if (element != null) {
                line.append(element).append(", ");
            }
        }
        line.append(" ");
        return line.toString().replace(",  ", "]");
    }
}


