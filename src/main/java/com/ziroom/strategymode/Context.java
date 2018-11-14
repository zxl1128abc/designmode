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
 * @date 2018/10/22 14:46
 * @since 1.0
 */
public class Context {

    //声明一个策略对象
    Strategy strategy = null;

  /*  *//**
     * 初始化时，传入具体的策略对象
     * @param strategy
     *//*
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
*/

    /**
     *  将实例化具体策略的过程由客户端转移到Context类中 ---简单工厂的应用
     * @param type 参数不是具体的收费策略对象，而是一个字符串，表示收费类型
     */
    public Context(String type){

        switch (type){
            case "正常收费":  ConcreteStrategyA ca = new ConcreteStrategyA();
            strategy = ca;
            break;
            case "打8折": ConcreteStrategyB cb = new ConcreteStrategyB(0.8);
            strategy = cb;
            break;
            case "满300返100": ConcreteStrategyC cc = new ConcreteStrategyC(300,100);
            strategy = cc;
            break;
        }

    }

    /**
     * 根据具体的策略对象，调用其算法的方法
     */
    public double getResult(double money){
        //根据收费策略的不同，获得计算结果
        return strategy.acceptCash(money);
    }


}
