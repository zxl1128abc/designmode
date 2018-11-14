package com.ziroom.strategymode;


import java.io.Console;

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
 * @version 1.0  使用策略模式和简单工厂模式结合
 * @date 2018/10/22 14:18
 * @since 1.0
 */
public class StoreCashierThird {

    static double total = 0.0d;

    public static void main(String[] args) {

        //使用简单工厂模式获取类型
        Context context = new Context("打8折");
        double totalPrices = 0d;
        //使用策略模式获取价格
        totalPrices = context.getResult(768);
        total += totalPrices;
        System.out.println("总价为："+total);

    }

}
