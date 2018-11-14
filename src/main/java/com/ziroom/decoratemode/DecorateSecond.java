package com.ziroom.decoratemode;

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
 * @date 2018/11/7 15:27
 * @since 1.0
 */
public class DecorateSecond {
    public static void main(String[] args) {

        Person p = new Person("小白");
        System.out.println("第一种装扮");
        Finery ts = new TShirts();
        Finery bt = new BigTrouser();
        ts.show();
        bt.show();
        System.out.println("");



    }

}
