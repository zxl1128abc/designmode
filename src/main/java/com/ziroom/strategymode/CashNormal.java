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
 * @version 1.0  正常收费子类
 * @date 2018/10/22 13:17
 * @since 1.0
 */
public class CashNormal extends CashSuper {
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
