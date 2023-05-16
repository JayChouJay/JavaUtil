package structure.adapter.box;


public class LinkedBox extends AbstractBox {

    private Node element;
    private int size;
    @Override
    public boolean add(int element) {
        return false;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int remove(int index) {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    private static class Node {
        private Node prev;
        int item;
        private Node next;
    }
}
