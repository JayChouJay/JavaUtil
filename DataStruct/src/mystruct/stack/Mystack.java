package mystruct.stack;

public class Mystack<E> {
    //存储数据
    private Object[] elements;
    //最大容量
    private int maxSize;
    //实际存储大小
    private int top;


    public Mystack(int size) {
        maxSize = size;
        this.elements = new Object[size];
        top = -1;
    }

    /**
     * 进栈、压栈
     */
    public void push(E object) throws Exception {
        if (isFull()) {
            throw new Exception("满了");
        }
        elements[++top] = object;
    }

    /**
     * 出栈、弹栈
     */
    public E pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("空的");
        }
        return (E) elements[top--];
    }

    public E peek() throws Exception {
        if (isEmpty()) {
            return null;
        }
        return (E) elements[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
