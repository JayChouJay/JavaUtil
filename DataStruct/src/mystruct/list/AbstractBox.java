package mystruct.list;

public abstract class AbstractBox<E> implements Box<E> {
    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public void add(int index, int element) {

    }

    @Override
    public void addAll() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
