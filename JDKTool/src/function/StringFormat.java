package function;

import java.util.HashMap;
import java.util.Scanner;

public class StringFormat {
    /**
     * In: LH-EN工程师\t工程\t2
     * LH-EN工程师\t销售\t3
     * <p>
     * OUT:LH-EN工程师\t工程（3）+销售（2）
     */
    public void out() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        HashMap<String, String> result = new HashMap<>();
        while (!str.equals("")) {
            String left = str.split("\t")[0];
            String middle = str.split("\t")[1];
            String right = str.split("\t")[2];
            if (result.containsKey(middle)) {
                result.replace(middle, result.get(middle) + "+" + left + "(" + right + ")");
            } else {
                result.put(middle, left + "(" + right + ")");
            }
            str = input.nextLine();
        }

        String str2 = result.toString();
        String[] strings = str2.split(",");
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            resultBuilder.append(strings[i].replace("=", "\t") + "\n");
        }
        System.out.println(resultBuilder);

//        for (int i=0;i<242;i++){
//            String left=str.split("\t")[0];
//            String middle=str.split("\t")[1];
//            String right=str.split("\t")[2];
//            if (result.containsKey(middle)){
//                result.replace(middle,result.get(middle)+"+"+left+"("+right+")");
//            }else{
//                result.put(middle,left+"("+right+")");
//            }
//            str=input.nextLine();
//        }
//        System.out.printf("left:"+left+",middle:"+middle+",right:"+right);
//        System.out.println(middle+"\t"+left+"("+right+")");
//        System.out.println(result);
    }

    public static void main(String[] args) {
        StringFormat format = new StringFormat();
        format.out();
    }
}
