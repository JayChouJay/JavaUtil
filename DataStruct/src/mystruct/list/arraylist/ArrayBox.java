package mystruct.list.arraylist;

import mystruct.list.Box;
import mystruct.myexception.BoxIndexOutOfBoundsException;

import java.util.ArrayList;

/**
 * 存，取，删除元素，获取元素个数，输出所有数据
 * 数组扩容，
 */
public class ArrayBox<E> implements Box<E> {
    //自定义常量：
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    public ArrayBox() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public ArrayBox(int capacity) {
        elementData = new Object[capacity];
    }


    /**
     * 存数据
     */
    public boolean add(E element) {
        //确保容量
        ensureCapacityInternal(size + 1);
        elementData[size++] = element;
        return true;
    }

    @Override
    public void add(int index, int element) {

    }

    @Override
    public void addAll() {

    }

    /**
     * 取数据
     */
    public E get(int index) {
        this.rangeCheck(index);
        return (E) elementData[index];
    }

    /**
     * 删除数据
     */
    public E remove(int index) {
        this.rangeCheck(index);
        E oldValue = (E) elementData[index];
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[size--] = null;
        return oldValue;
    }

    /**
     * 获取ArrayBox长度
     */
    public int size() {
        return size;
    }

    /**
     * 输出ArrayBox的数据
     */
    public String toString() {
        StringBuilder arrayBox = new StringBuilder();
        arrayBox.append("{");
        for (int i = 0; i < size; i++) {
            if (i == 0)
                arrayBox.append(elementData[i]);
            else
                arrayBox.append("," + elementData[i]);
        }
        arrayBox.append("}");
        return arrayBox.toString();
    }

    /**
     * 扩容
     */
    private void ensureCapacityInternal(int minCapacity) {
        if (minCapacity > elementData.length) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + oldCapacity >> 1;
            newCapacity = newCapacity > minCapacity ? newCapacity : minCapacity;
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < elementData.length; i++) {
                newArray[i] = elementData[i];
            }
            elementData = newArray;
        }
    }

    /**
     * 检查索引是否越界
     */
    private void rangeCheck(int index) {
        if (index < 0 || size - index <= 0) {
            //异常使用：
            throw new BoxIndexOutOfBoundsException("ArrayBox长度：" + size + ",Index: " + index);
        }
    }
}
