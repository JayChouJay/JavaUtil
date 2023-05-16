package constructor;

public class Student {
    static {
        new Student().test();
    }
    private void test(){
        System.out.println("测试");
    }

    public static void main(String[] args) {
        new Student();
    }
}
