package constructor;

import java.util.Scanner;

public class ConstructionMethod {
    {
        System.out.println("我是块");
    }

    public ConstructionMethod() {
        super();
    }

    public ConstructionMethod(int index) {

    }

    public void eat() {
        System.out.println("我是吃饭方法");
    }

    public static void main(String[] args) {
        new ConstructionMethod().eat();
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
    }
}
