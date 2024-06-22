import java.util.Arrays;

public class CustomArrayList {
    private Animal[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        this.elements = new Animal[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public CustomArrayList(int initialCapacity) {
        this.elements = new Animal[initialCapacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void copyElementsFrom(Animal[] oldElements) {
        for (int i = 0; i < oldElements.length; i++) {
            elements[i] = oldElements[i];
        }
    }

    private void checkSize(int needCapacity) {
        if (needCapacity >= elements.length * 0.7) {
            Animal[] newElements = new Animal[elements.length * 2];
            copyElementsFrom(elements);
            elements = newElements;
        }
    }

    public boolean add(Animal element) {
        checkSize(size + 1);
        elements[size++] = element;
        return true;
    }

    public void set(int index, Animal element) {
        if (index >= 0 && index < size) {
            elements[index] = element;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public Animal get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void clear() {
        elements = new Animal[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i].toString());
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
