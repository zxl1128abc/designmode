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
 * @date 2018/10/17 15:50
 * @since 1.0
 */
public class OperationDiv extends Operation {
    /**
     * 获取除法结果
     * @return
     */
    @Override
    public String getResult(){
        String result = "";
        if(numB != 0){
           result =  Double.toString(numA/numB);
        }else{
            result="除数不能为空";
        }
        return result;

    }

}
