package test;

import org.junit.jupiter.api.Test;
import test.bean.User;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest {
    @Test
    public void stream() {
        List<User> list = Arrays.asList(
                new User("周杰伦", 20, 4000),
                new User("张国荣", 21, 3000),
                new User("邓紫棋", 22, 3000)
        );
        //list中age<21
        List<User> newList = new ArrayList<>();
        for (User user : list) {
            if (user.getAge() < 21) newList.add(user);
        }
        //list中salary>2000
        List<User> newList2 = new ArrayList<>();
        for (User user : list) {
            if (user.getSalary() > 2000) newList2.add(user);
        }
        //Stream Lambda表达式（函数式编程）
        Predicate<User> predicate1 = user -> user.getAge() < 21;
        Predicate<User> predicate2 = user -> user.getSalary() > 2000;
        List<User> collect = list.stream()
                .filter(predicate1)
                .filter(predicate2)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void stream2() {
        List<String> list = Arrays.asList("周杰伦","张国荣","邓紫棋");
        List<Integer> list2 = Arrays.asList(1,3,52,3,5,12,3,213,12,3);

        list.stream()
                .filter(str->str.length()>2)
                .forEach(str-> System.out.println(str));
        //limit
        list.stream()
                .limit(2)
                .forEach(str-> System.out.println(str));
        //sorted
        list2.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(num-> System.out.println(num));
        System.out.println(list2.stream()
                .max(Integer::compareTo).get());
        System.out.println(list2.stream()
                .min(Integer::compareTo).get());
        System.out.println(list2.stream()
                .count());
        //map
        list2.stream()
                .map(num->num+10)
                .forEach(num-> System.out.println(num));
        //reduce
        System.out.println(list2.stream()
                .reduce((sum, num) -> sum + num).get());
        List<Integer> collect = list2.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
    @Test
    public void lambda() throws InterruptedException {
        Thread thread=new Thread(()->{
            System.out.println("Lambda");
            try {
                Thread.sleep(3000);
                System.out.println("Lambda");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        Thread.sleep(2990);
    }
}
