package function;

import java.util.Scanner;

/**
 *计算器，只能加减乘除
 */
public class Calculator {
    private float result;
    public float calculaor(float num1,String sym,float num2){
        switch(sym){
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
            default:return 0;
        }

    }
    public void run(){
        Scanner input =new Scanner(System.in);
        System.out.println("请输入第一个数字");
        String str1=input.nextLine();
        result=Float.parseFloat(str1);
        while(true){
            System.out.println("请输入运算符号");
            String symbol=input.nextLine();
            if(symbol.equals("=")){
                break;
            } else if (!(symbol.equals("+")||symbol.equals("-")||symbol.equals("*")||symbol.equals("/"))) {
                System.out.println("输入符号有误，请输入‘+，-，*，/，=’");
                continue;
            }
            System.out.println("请输入第二个数字");
            String str2=input.nextLine();
            float num2=Float.parseFloat(str2);
            result=calculaor(result, symbol, num2);
            System.out.println("运算结果是:"+result);
        }
        System.out.println("运算结果是:"+result);
    }
}