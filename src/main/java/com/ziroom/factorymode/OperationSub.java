package com.ziroom.factorymode;

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
 * @date 2018/10/17 15:46
 * @since 1.0
 */
public class OperationSub extends Operation {
    @Override
    public String getResult(){
        double result = numA - numB;
        return Double.toString(result);
    }
}
