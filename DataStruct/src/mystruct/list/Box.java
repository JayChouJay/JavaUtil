package mystruct.list;

/**
 * 功能描述：为了将所有的box规则统一起来  让使用者用起来更加方便
 */
public interface Box<E> {
    /**
     * 添加到末尾
     */
    boolean add(E element);

    /**
     * 在给定的位置中插入一个元素
     */
    void add(int index, int element);

    /**
     * 将给定的box中所有的元素添加至我们现在的box中
     */
    void addAll();

    E get(int index);

    E remove(int index);

    int size();
}
