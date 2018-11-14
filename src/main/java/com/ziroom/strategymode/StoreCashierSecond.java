package com.ziroom.strategymode;

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
 * @version 1.0  使用简单工厂模式
 * @date 2018/10/22 13:14
 * @since 1.0
 */
public class StoreCashierSecond {

    static double total = 0.0d;
    public static void main(String[] args) {
        //利用简单工厂模式根据下拉选择框，生成相应的对象
        CashSuper csuper = CashFactory.createCashAccept("满300返100");
        double totalPrices = 0d;
        //参数为 单价和数量
        totalPrices = csuper.acceptCash(350 * 2);
        total += totalPrices;
        System.out.println("总价格为："+totalPrices);
    }

}
