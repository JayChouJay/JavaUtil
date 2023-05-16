package structure.adapter.box;

public interface Box {
    boolean add(int element);
    void add(int index,int element);
    void addAll();
    int get(int index);
    int remove(int index);
    int size();

}
