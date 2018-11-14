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
 * @version 1.0  打折收费子类
 * @date 2018/10/22 13:19
 * @since 1.0
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    /**
     * 构造方法
     * 打折收费，初始化时，必须要输入折扣率，如八折，输入0.8
     * @param moneyRebate
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
