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
 * @date 2018/10/22 14:28
 * @since 1.0
 */
public class ConcreteStrategyA extends Strategy {
    /**
     * 正常收费原价返回
     * @param money 原价
     * @return
     */
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
