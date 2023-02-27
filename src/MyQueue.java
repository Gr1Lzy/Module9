import java.util.Arrays;

public class MyQueue<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyQueue() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    void add(T value) { // добавляет элемент в конец
        if (elements.length >= DEFAULT_CAPACITY) {
            elements = Arrays.copyOf(elements, elements.length + 5);
        }
        elements[size++] = value;
    }

    Object peek() { // возвращает первый элемент в очереди (FIFO)
        return elements[0];
    }

    void poll() { // возвращает первый элемент в очереди и удаляет его из коллекции
        System.out.println(peek() + " - bye bye!");
        refreshArray();
    }

    private void refreshArray() {
        for (int index = 1; index < elements.length; index++) {
            elements[index - 1] = elements[index];
        }
        size--;
    }

    void clear() {// очищает коллекцию
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    void size() { // возвращает размер коллекции
        System.out.println(size);
    }

    @Override
    public String toString() {
        return GetString.getString(elements, size);
    }
}
