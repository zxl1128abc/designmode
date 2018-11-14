package com.ziroom.factorymode;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author zhangxiuli
 * @version 1.0
 * @date 2018/10/17 14:20
 * @since 1.0
 */
public class FactoryFirst {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A：");
        double numA = scanner.nextDouble();
        System.out.println("请选择运算符号（+、-、*、/）：");
        String operation = scanner.next();
        System.out.println("请输入数字B：");
        double numB = scanner.nextDouble();
        String result = "";
        switch (operation) {
            case "+":
                result = Double.toString(numA + numB);
                break;
            case "-":
                result = Double.toString(numA - numB);
                break;
            case "*":
                result = Double.toString(numA * numB);
                break;
            case "/":
                if (numB != 0){
                    result = Double.toString(numA / numB);
                    break;
                }else{
                    result= "除数不能为0";
                    break;
                }
        }
        System.out.println("结果是："+result);

    }


}
