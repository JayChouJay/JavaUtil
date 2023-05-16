package mystruct.bean;

import java.util.Objects;

public class Node<E> {
    public E val;
    public Node<E> next;

    public Node(E val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(val, node.val) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
