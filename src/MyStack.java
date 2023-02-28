import java.util.Arrays;

public class MyStack {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyStack() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    void push(Object value) { // добавляет элемент в конец
        if (elements.length >= DEFAULT_CAPACITY) {
            elements = Arrays.copyOf(elements, elements.length + 5);
        }
        elements[size++] = value;
    }

    int size() { // возвращает размер коллекции
        return size;
    }

    Object clear() { // очищает коллекцию
        return elements = new Object[DEFAULT_CAPACITY];
    }

    void remove(int index) { // удаляет элемент под индексом
        elements[index] = null;
        refreshArray();
    }

    Object pop() { // возвращает первый элемент в стеке и удаляет его из коллекции
        Object temp = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return temp;
    }

    Object peek() { // возвращает первый элемент в стеке (LIFO)
        return elements[0];
    }

    private Object[] refreshArray() {
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] == null) {
                for (; index < elements.length; index++) {
                    if (elements[index + 1] != null) {
                        elements[index] = elements[index + 1];
                    } else {
                        elements[index] = null;
                        size--;
                        return elements;
                    }
                }
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return GetString.getString(elements, size);
    }
}


