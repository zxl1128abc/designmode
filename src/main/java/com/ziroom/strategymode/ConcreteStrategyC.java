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
 * @date 2018/10/22 14:45
 * @since 1.0
 */
public class ConcreteStrategyC extends Strategy{
    /**
     * 满足返利条件
     */
    private double moneyCondition = 0.0d;

    /**
     * 返利值
     */
    private double moneyReturn = 0.0d;

    /**
     * 有参构造方法
     *
     * 返利收费，初始化时必须要输入返利条件和返利值
     * @param moneyCondition 返利条件
     * @param moneyReturn 返利值
     */
    public ConcreteStrategyC(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /**
     *
     * @param money 原价
     * @return 当前价
     */
    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition){
            //若大于返利条件，则需要减去返利值  moneyCondition不要传0
            // Math.floor()不大于它的最小整数 	Math.round() 四舍五入它的最小整数	Math.ceil() 不小于它的最小整数
            result = money - Math.floor(money/moneyCondition) * moneyReturn;
        }
        return result;
    }
}
