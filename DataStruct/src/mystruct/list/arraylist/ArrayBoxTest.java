package mystruct.list.arraylist;

import mystruct.bean.Person;
import org.junit.jupiter.api.Test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class ArrayBoxTest {
    public String util="1";

    @Test
    public void test(){
        //        int[]array={1,2,3,4,5,6};
//        TestFunctions fun=new TestFunctions();
//        fun.convert(array);

//        Scanner input =new Scanner(System.in);
//        System.out.println(input.nextInt());
//        System.out.println(input.nextLine());
        //new Calculator().run();
        ArrayBox box = new ArrayBox();
        box.add(10);
        box.add(1);
        box.add(120);
        box.add(103);
        box.add(102);
        box.add(101);
        box.add(103);
        box.add(120);
        box.add(103);
        box.add(104);
        box.add(101);
        util="22";
        System.out.println(box.size());
        System.out.println(box.get(10));
//        System.out.println(box.get(100));
        System.out.println(box);
        ReferenceQueue<Person> queue=new ReferenceQueue<>();
        PhantomReference phantom=new PhantomReference(new Person(),queue);
        queue.poll();
        char a1='a';
        char a2=2;
        a1=(char)(a1+a2);
        System.out.println(a1);
    }
}
