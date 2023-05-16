package mystruct.myexception;

//定义box索引越界异常
public class BoxIndexOutOfBoundsException extends RuntimeException {
    public BoxIndexOutOfBoundsException() {
    }

    public BoxIndexOutOfBoundsException(String msg) {
        super(msg);
    }
}
