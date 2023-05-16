package algorithm.a5hash;

import org.junit.jupiter.api.Test;

public class BFindTheDifferenceTest {
    private String s="flasdkjf";
    private String t="flassdkjf";
    private String s1="abcd";
    private String t1="abcde";
    @Test
    public void findTheDifference(){
        System.out.println(BFindTheDifference.findTheDifference(s, t));
        System.out.println(BFindTheDifference.findTheDifference(s1, t1));
    }
    @Test
    public void findTheDifference2(){
        System.out.println(BFindTheDifference.findTheDifference2(s, t));
        System.out.println(BFindTheDifference.findTheDifference2(s1, t1));
    }
    @Test
    public void findTheDifference3(){
        System.out.println(BFindTheDifference.findTheDifference3(s, t));
        System.out.println(BFindTheDifference.findTheDifference3(s1, t1));
    }
    @Test
    public void findTheDifference4(){
        System.out.println(BFindTheDifference.findTheDifference4(s, t));
        System.out.println(BFindTheDifference.findTheDifference4(s1, t1));
    }
    @Test
    public void findTheDifference5(){
        System.out.println(BFindTheDifference.findTheDifference5(s, t));
        System.out.println(BFindTheDifference.findTheDifference5(s1, t1));
    }
}
