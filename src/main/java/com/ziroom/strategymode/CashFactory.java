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
 * @version 1.0  现金收费工厂类
 * @date 2018/10/22 14:09
 * @since 1.0
 */
public class CashFactory {

    /**
     * 现金收取工厂
     * @param type
     * @return
     */
    public static CashSuper createCashAccept(String type){
        CashSuper cs = null;
        //根据条件返回相应的对象
        switch (type){
            //使用多态可以得到收取费用的结果
            case  "正常收费": cs = new CashNormal();
                break;
            case "满300返100": cs = new CashReturn(300,100);
                break;
            case "打8折": cs = new CashRebate(0.8);
                break;
        }
        return cs;
    }
}
