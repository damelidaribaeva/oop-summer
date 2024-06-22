public class AnimalLinkedList implements AnimalList {
    private class Node {
        Animal element;
        Node prev;
        Node next;

        Node(Animal element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node header;
    private int size;

    public AnimalLinkedList() {
        header = new Node(null, null, null);
        header.prev = header;
        header.next = header;
        size = 0;
    }

    private void add(Animal animal, Node node) {
        Node newNode = new Node(animal, node, node.next);
        node.next.prev = newNode;
        node.next = newNode;
        size++;
    }

    @Override
    public void add(Animal animal) {
        add(animal, header);
    }

    @Override
    public void addAll(CustomArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            add(arrayList.get(i));
        }
    }

    private Node findNodeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = header.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public Animal get(int index) {
        return findNodeByIndex(index).element;
    }

    @Override
    public void set(int index, Animal element) {
        Node node = findNodeByIndex(index);
        node.element = element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        header.next = header;
        header.prev = header;
        size = 0;
    }
}
