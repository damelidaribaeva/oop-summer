public interface AnimalList {
    void add(Animal animal);
    void addAll(CustomArrayList arrayList);
    Animal get(int index);
    void set(int index, Animal element);
    int size();
    boolean isEmpty();
    void clear();
}
