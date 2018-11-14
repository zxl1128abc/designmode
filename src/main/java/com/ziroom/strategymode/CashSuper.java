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
 * @version 1.0
 * @date 2018/10/22 13:15
 * @since 1.0
 */
public abstract class CashSuper {
    /***
     * 现金收取超类的抽象方法
     * @param money 原价
     * @return  当前价
     */
    public abstract double acceptCash(double money);
}
