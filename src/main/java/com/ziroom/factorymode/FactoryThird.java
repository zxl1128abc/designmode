package com.ziroom.factorymode;

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
 * @date 2018/10/17 14:53
 * @since 1.0
 */
public class FactoryThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择运算符号（+、-、*、/）：");
        String oper= scanner.next();
        Operation operation = FactoryThird.createOperation(oper);
        System.out.println("请输入数字A：");
        double numA1 = scanner.nextDouble();
        operation.numA = numA1;
        System.out.println("请输入数字B：");
        double numB1 = scanner.nextDouble();
        operation.numB = numB1;
        String result = operation.getResult();
        System.out.println("结果是："+result);
    }

    public static Operation createOperation(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
               operation = new OperationDiv();
               break;
        }
        return operation;
    }

}
